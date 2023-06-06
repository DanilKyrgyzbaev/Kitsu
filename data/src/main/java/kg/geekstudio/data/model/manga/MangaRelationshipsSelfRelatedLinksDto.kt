package kg.geekstudio.data.model.manga

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.manga.MangaRelationshipsSelfRelatedLinks

data class MangaRelationshipsSelfRelatedLinksDto(
    val self: String,
    val related: String
) : DataMapper<MangaRelationshipsSelfRelatedLinks> {
    override fun toDomain() = MangaRelationshipsSelfRelatedLinks(
        self, related
    )
}
