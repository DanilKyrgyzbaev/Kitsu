package kg.geekstudio.domain.di

import kg.geekstudio.domain.useCase.GetAnimeUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { GetAnimeUseCase(get()) }
}