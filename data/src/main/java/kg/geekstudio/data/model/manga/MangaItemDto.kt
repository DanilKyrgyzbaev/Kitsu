package kg.geekstudio.data.model.manga

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.manga.MangaItem

data class MangaItemDto(
    val id: String,
    val type: String,
    val links: MangaLinksDto,
    val attributes: MangaAttributesDto,
    val relationships: MangaRelationshipsDto
) : DataMapper<MangaItem> {
    override fun toDomain() = MangaItem(
        id, type, links.toDomain(), attributes.toDomain(), relationships.toDomain()
    )
}
