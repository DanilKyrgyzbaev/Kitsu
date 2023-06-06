package kg.geekstudio.data.model.anime

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.anime.AnimeRelationships

data class AnimeRelationshipsDto(
    val genres: RelationshipLinksDto,
    val categories: RelationshipLinksDto,
    val castings: RelationshipLinksDto,
    val installments: RelationshipLinksDto,
    val mappings: RelationshipLinksDto,
    val reviews: RelationshipLinksDto,
    val mediaRelationships: RelationshipLinksDto,
    val characters: RelationshipLinksDto,
    val staff: RelationshipLinksDto,
    val productions: RelationshipLinksDto,
    val quotes: RelationshipLinksDto,
    val episodes: RelationshipLinksDto,
    val streamingLinks: RelationshipLinksDto,
    val animeProductions: RelationshipLinksDto,
    val animeCharacters: RelationshipLinksDto,
    val animeStaff: RelationshipLinksDto
) : DataMapper<AnimeRelationships> {
    override fun toDomain() = AnimeRelationships(
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
        episodes.toDomain(),
        streamingLinks.toDomain(),
        animeProductions.toDomain(),
        animeCharacters.toDomain(),
        animeStaff.toDomain()
    )
}
