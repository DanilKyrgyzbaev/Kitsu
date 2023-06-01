package kg.geekstudio.domain.model

data class AnimeImage(
    val tiny: String,
    val large: String,
    val small: String,
    val medium: String,
    val original: String,
    val meta: ImageMeta
)
