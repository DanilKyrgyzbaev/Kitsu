package kg.geekstudio.domain.model.manga

data class MangaItem(
    val id: String,
    val type: String,
    val links: MangaLinks,
    val attributes: MangaAttributes,
    val relationships: MangaRelationships
)
