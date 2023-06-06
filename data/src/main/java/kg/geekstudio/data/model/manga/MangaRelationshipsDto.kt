package kg.geekstudio.data.model.manga

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.manga.MangaRelationships

data class MangaRelationshipsDto(
    val genres: MangaRelationshipsLinksDto,
    val categories: MangaRelationshipsLinksDto,
    val castings: MangaRelationshipsLinksDto,
    val installments: MangaRelationshipsLinksDto,
    val mappings: MangaRelationshipsLinksDto,
    val reviews: MangaRelationshipsLinksDto,
    val mediaRelationships: MangaRelationshipsLinksDto,
    val characters: MangaRelationshipsLinksDto,
    val staff: MangaRelationshipsLinksDto,
    val productions: MangaRelationshipsLinksDto,
    val quotes: MangaRelationshipsLinksDto,
    val chapters: MangaRelationshipsLinksDto,
    val mangaCharacters: MangaRelationshipsLinksDto,
    val mangaStaff: MangaRelationshipsLinksDto
) : DataMapper<MangaRelationships> {
    override fun toDomain() = MangaRelationships(
        genres.toDomain(),
        categories.toDomain(),
        castings.toDomain(),
        installments.toDomain(),
        mappings.toDomain(),
        reviews.toDomain(),
        mediaRelationships.toDomain(),
        characters.toDomain(),
        staff.toDomain(),
        productions.toDomain(),
        quotes.toDomain(),
        chapters.toDomain(),
        mangaCharacters.toDomain(),
        mangaStaff.toDomain()
    )
}
