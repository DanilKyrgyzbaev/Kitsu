package kg.geekstudio.data.model.manga

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.manga.MangaImageSize

data class MangaImageSizeDto(
    val width: Int,
    val height: Int
) : DataMapper<MangaImageSize> {
    override fun toDomain() = MangaImageSize(
        width, height
    )
}
