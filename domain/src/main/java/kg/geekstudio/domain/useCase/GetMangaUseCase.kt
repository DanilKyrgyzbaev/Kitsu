package kg.geekstudio.domain.useCase

import kg.geekstudio.core.util.ResultStatus
import kg.geekstudio.domain.model.manga.MangaItem
import kg.geekstudio.domain.repository.MangaRepository

class GetMangaUseCase(private val mangaRepository: MangaRepository)  {
    suspend operator fun invoke(): ResultStatus<List<MangaItem>> {
        return mangaRepository.getManga()
    }
}