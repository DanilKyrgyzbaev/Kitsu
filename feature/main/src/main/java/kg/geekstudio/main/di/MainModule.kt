package kg.geekstudio.main.di

import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import kg.geekstudio.main.ui.home.HomeViewModel
import kg.geekstudio.main.ui.signin.SigninViewModel
import kg.geekstudio.main.ui.viewPager.anime.AnimeViewModel
import kg.geekstudio.main.ui.viewPager.manga.MangaViewModel

@ExperimentalCoroutinesApi
val mainModule = module {
    viewModelOf(::HomeViewModel)
    viewModelOf(::SigninViewModel)
    viewModelOf(::AnimeViewModel)
    viewModelOf(::MangaViewModel)
}