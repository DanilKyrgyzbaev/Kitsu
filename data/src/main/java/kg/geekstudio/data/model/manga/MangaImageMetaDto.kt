package kg.geekstudio.data.model.manga

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.manga.MangaImageMeta

data class MangaImageMetaDto(
    val dimensions: MangaImageDimensionsDto

) : DataMapper<MangaImageMeta> {
    override fun toDomain() = MangaImageMeta(
        dimensions.toDomain()
    )
}
