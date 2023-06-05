package kg.geekstudio.domain.repository

import kg.geekstudio.core.util.ResultStatus
import kg.geekstudio.domain.model.anime.AnimeData

interface AnimeRepository {
    suspend fun getAnime(limit: Int, offset: Int): ResultStatus<List<AnimeData>>
}