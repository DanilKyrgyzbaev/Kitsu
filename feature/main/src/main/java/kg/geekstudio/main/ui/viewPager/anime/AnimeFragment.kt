package kg.geekstudio.main.ui.viewPager.anime

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import kg.geekstudio.core_ui.base.BaseFragment
import kg.geekstudio.core_ui.common.AnimeAdapter
import kg.geekstudio.core_ui.state.UIState
import kg.geekstudio.kitsu.main.databinding.FragmentAnimeBinding
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.koin.androidx.viewmodel.ext.android.viewModel

@ExperimentalCoroutinesApi
class AnimeFragment : BaseFragment<AnimeViewModel, FragmentAnimeBinding>(FragmentAnimeBinding::inflate) {
    private lateinit var adapter: AnimeAdapter

    override val viewModel by viewModel<AnimeViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.fetchAnime()
    }

    override fun initialize() {
        adapter = AnimeAdapter(ArrayList(), requireContext())
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
    }

    override fun setupObservers() {
        viewModel.animeList.observe(viewLifecycleOwner) { uiState ->
            when (uiState) {
                is UIState.Success ->{
                    val animeDataList = uiState.data
                    adapter.updateData(animeDataList)
                    adapter.notifyDataSetChanged()
                }
                is UIState.Error ->{
                    val errorMessage = uiState.error
                }
                is UIState.Loading -> {
                    // Обработка состояния загрузки
                }
            }
        }
    }
}