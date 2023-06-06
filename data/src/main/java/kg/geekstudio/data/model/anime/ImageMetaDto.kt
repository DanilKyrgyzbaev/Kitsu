package kg.geekstudio.data.model.anime

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.anime.ImageMeta


data class ImageMetaDto(
    val dimensions: ImageDimensionsDto
) : DataMapper<ImageMeta> {
    override fun toDomain() = ImageMeta(
        dimensions.toDomain()
    )
}
