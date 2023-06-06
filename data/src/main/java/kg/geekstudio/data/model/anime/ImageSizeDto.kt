package kg.geekstudio.data.model.anime

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.anime.ImageSize

data class ImageSizeDto(
    val width: Int,
    val height: Int
) : DataMapper<ImageSize> {
    override fun toDomain() = ImageSize(
        width, height
    )
}
