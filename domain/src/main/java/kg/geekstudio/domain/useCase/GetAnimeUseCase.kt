package kg.geekstudio.domain.useCase

import kg.geekstudio.core.util.ResultStatus
import kg.geekstudio.domain.model.anime.AnimeData
import kg.geekstudio.domain.repository.AnimeRepository

class GetAnimeUseCase (private val animeRepository: AnimeRepository){
    suspend operator fun invoke(limit: Int, offset: Int): ResultStatus<List<AnimeData>> {
        return animeRepository.getAnime(limit,offset)
    }
}