package kg.geekstudio.domain.di

import kg.geekstudio.domain.useCase.AuthUseCase
import kg.geekstudio.domain.useCase.GetAnimeUseCase
import kg.geekstudio.domain.useCase.GetMangaUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { AuthUseCase(get())}
    factory { GetAnimeUseCase(get())}
    factory { GetMangaUseCase(get())}
}