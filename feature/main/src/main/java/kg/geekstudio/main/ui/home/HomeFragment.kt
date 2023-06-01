package kg.geekstudio.main.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.viewpager2.widget.ViewPager2
import kg.geekstudio.core_ui.base.BaseFragment
import kg.geekstudio.core_ui.common.ViewPagerAdapter
import kg.geekstudio.kitsu.main.databinding.FragmentHomeBinding
import kg.geekstudio.main.ui.viewPager.anime.AnimeFragment
import kg.geekstudio.main.ui.viewPager.manga.MangaFragment
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
class HomeFragment: BaseFragment<HomeViewModel, FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    private lateinit var  viewPager: ViewPager2
    override val viewModel: HomeViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        viewModel.fetchAnime()
    }

    override fun initialize() {
        val adapter = ViewPagerAdapter(this)
        adapter.addFragment(AnimeFragment())
        adapter.addFragment(MangaFragment())
        viewPager = binding.viewPager
        viewPager.adapter = adapter
    }
}