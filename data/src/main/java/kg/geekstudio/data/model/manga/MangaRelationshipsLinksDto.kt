package kg.geekstudio.data.model.manga

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.manga.MangaRelationshipsLinks

data class MangaRelationshipsLinksDto(
    val links: MangaRelationshipsSelfRelatedLinksDto

) : DataMapper<MangaRelationshipsLinks> {
    override fun toDomain() = MangaRelationshipsLinks(
        links.toDomain()
    )
}