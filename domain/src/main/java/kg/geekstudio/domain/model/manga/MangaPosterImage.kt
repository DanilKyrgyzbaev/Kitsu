package kg.geekstudio.domain.model.manga

data class MangaPosterImage(
    val tiny: String,
    val large: String,
    val small: String,
    val medium: String,
    val original: String,
    val meta: MangaImageMeta
)
