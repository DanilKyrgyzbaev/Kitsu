package kg.geekstudio.domain.useCase

import kg.geekstudio.core.util.ResultStatus
import kg.geekstudio.domain.model.AnimeData
import kg.geekstudio.domain.repository.AnimeRepository

class GetAnimeUseCase (private val animeRepository: AnimeRepository){
    suspend operator fun invoke(): ResultStatus<List<AnimeData>> {
        return animeRepository.getAnime()
    }
}