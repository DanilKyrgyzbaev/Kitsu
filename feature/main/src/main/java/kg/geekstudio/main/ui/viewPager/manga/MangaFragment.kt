package kg.geekstudio.main.ui.viewPager.manga

import android.os.Bundle
import android.view.View
import kg.geekstudio.core_ui.base.BaseFragment
import kg.geekstudio.kitsu.main.databinding.FragmentMangaBinding
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.koin.androidx.viewmodel.ext.android.viewModel

@ExperimentalCoroutinesApi
class MangaFragment : BaseFragment<MangaViewModel, FragmentMangaBinding>(FragmentMangaBinding::inflate) {

    override val viewModel: MangaViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        viewModel.fetchAnime()
    }

}