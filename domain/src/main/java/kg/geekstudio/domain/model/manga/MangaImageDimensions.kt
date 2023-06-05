package kg.geekstudio.domain.model.manga

data class MangaImageDimensions(
    val tiny: MangaImageSize,
    val large: MangaImageSize,
    val small: MangaImageSize,
    val medium: MangaImageSize
)
