package kg.geekstudio.data.model.manga

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.manga.MangaData
import kg.geekstudio.domain.model.manga.MangaItem

data class MangaDataDto(
    val data: List<MangaItemDto>
) : DataMapper<MangaData> {
    override fun toDomain() = MangaData(
        data.map { it.toDomain() }
    )
}
