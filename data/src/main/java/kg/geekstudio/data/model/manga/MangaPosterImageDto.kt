package kg.geekstudio.data.model.manga

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.manga.MangaPosterImage

data class MangaPosterImageDto(
    val tiny: String,
    val large: String,
    val small: String,
    val medium: String,
    val original: String,
    val meta: MangaImageMetaDto
) : DataMapper<MangaPosterImage> {
    override fun toDomain() = MangaPosterImage(
        tiny, large, small, medium, original, meta.toDomain()
    )
}
