package kg.geekstudio.data.model.manga

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.manga.MangaImageDimensions

data class MangaImageDimensionsDto(
    val tiny: MangaImageSizeDto,
    val large: MangaImageSizeDto,
    val small: MangaImageSizeDto,
    val medium: MangaImageSizeDto
) : DataMapper<MangaImageDimensions> {
    override fun toDomain() = MangaImageDimensions(
        tiny.toDomain(), large.toDomain(), small.toDomain(), medium.toDomain()
    )
}
