package kg.geekstudio.domain.repository

import kg.geekstudio.core.util.ResultStatus
import kg.geekstudio.domain.model.manga.MangaItem

interface MangaRepository {
    suspend fun getManga(): ResultStatus<List<MangaItem>>
}