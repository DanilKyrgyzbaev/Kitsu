package kg.geekstudio.domain.repository

import kg.geekstudio.core.util.ResultStatus
import kg.geekstudio.domain.model.AnimeData

interface AnimeRepository {
    suspend fun getAnime(): ResultStatus<List<AnimeData>>
}