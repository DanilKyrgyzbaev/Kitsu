package kg.geekstudio.domain.model.manga

data class MangaRelationships(
    val genres: MangaRelationshipsLinks,
    val categories: MangaRelationshipsLinks,
    val castings: MangaRelationshipsLinks,
    val installments: MangaRelationshipsLinks,
    val mappings: MangaRelationshipsLinks,
    val reviews: MangaRelationshipsLinks,
    val mediaRelationships: MangaRelationshipsLinks,
    val characters: MangaRelationshipsLinks,
    val staff: MangaRelationshipsLinks,
    val productions: MangaRelationshipsLinks,
    val quotes: MangaRelationshipsLinks,
    val chapters: MangaRelationshipsLinks,
    val mangaCharacters: MangaRelationshipsLinks,
    val mangaStaff: MangaRelationshipsLinks
)
