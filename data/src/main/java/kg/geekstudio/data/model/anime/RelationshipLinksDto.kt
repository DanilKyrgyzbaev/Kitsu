package kg.geekstudio.data.model.anime

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.anime.RelationshipLinks

data class RelationshipLinksDto(
    val links: RelationshipLinkUrlsDto
) : DataMapper<RelationshipLinks> {
    override fun toDomain() = RelationshipLinks(
        links.toDomain()
    )
}