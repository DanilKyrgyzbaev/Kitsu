package kg.geekstudio.main.ui.viewPager.manga

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kg.geekstudio.core_ui.base.BaseFragment
import kg.geekstudio.core_ui.common.AnimeAdapter
import kg.geekstudio.core_ui.common.MangaAdapter
import kg.geekstudio.core_ui.state.UIState
import kg.geekstudio.kitsu.main.databinding.FragmentMangaBinding
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.koin.androidx.viewmodel.ext.android.viewModel

@ExperimentalCoroutinesApi
class MangaFragment : BaseFragment<MangaViewModel, FragmentMangaBinding>(FragmentMangaBinding::inflate) {
    private lateinit var adapter: MangaAdapter

    override val viewModel by viewModel<MangaViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.fetchManga()
    }

    override fun initialize() {
        adapter = MangaAdapter(ArrayList(), requireContext())
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
    }

    override fun setupObservers() {
        viewModel.mangaList.observe(viewLifecycleOwner) { uiState ->
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