package kg.geekstudio.data.model.manga

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.manga.MangaLinks

data class MangaLinksDto(
    val self: String
) : DataMapper<MangaLinks> {
    override fun toDomain() = MangaLinks(
        self
    )
}
