package kg.geekstudio.data.model.anime

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.anime.AnimeData

data class AnimeDataDto(
    val id: String,
    val type: String,
    val links: AnimeLinksDto,
    val attributes: AnimeAttributesDto,
    val relationships: AnimeRelationshipsDto
) : DataMapper<AnimeData> {
    override fun toDomain() = AnimeData(
        id, type, links.toDomain(), attributes.toDomain(), relationships.toDomain()
    )
}
