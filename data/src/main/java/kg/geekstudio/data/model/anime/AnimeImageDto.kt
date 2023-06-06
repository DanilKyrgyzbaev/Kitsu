package kg.geekstudio.data.model.anime

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.anime.AnimeImage

data class AnimeImageDto(
    val tiny: String,
    val large: String,
    val small: String,
    val medium: String,
    val original: String,
    val meta: ImageMetaDto
) : DataMapper<AnimeImage> {
    override fun toDomain() = AnimeImage(
        tiny, large, small, medium, original, meta.toDomain()
    )
}
