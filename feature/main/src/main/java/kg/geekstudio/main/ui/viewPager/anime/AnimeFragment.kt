package kg.geekstudio.main.ui.viewPager.anime

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import kg.geekstudio.core_ui.base.BaseFragment
import kg.geekstudio.kitsu.main.databinding.FragmentAnimeBinding
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
class AnimeFragment : BaseFragment<AnimeViewModel, FragmentAnimeBinding>(FragmentAnimeBinding::inflate) {

    override val viewModel : AnimeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        viewModel.fetchAnime()
    }
}