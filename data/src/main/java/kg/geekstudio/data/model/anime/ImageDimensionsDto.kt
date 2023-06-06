package kg.geekstudio.data.model.anime

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.anime.ImageDimensions

data class ImageDimensionsDto(
    val tiny: ImageSizeDto,
    val large: ImageSizeDto,
    val small: ImageSizeDto,
    val medium: ImageSizeDto
) : DataMapper<ImageDimensions> {
    override fun toDomain() = ImageDimensions(
        tiny.toDomain(), large.toDomain(), small.toDomain(), medium.toDomain()
    )
}
