package kg.geekstudio.data.model.anime

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.anime.RelationshipLinkUrls

data class RelationshipLinkUrlsDto(
    val self: String,
    val related: String
) : DataMapper<RelationshipLinkUrls> {
    override fun toDomain() = RelationshipLinkUrls(
        self, related
    )
}
