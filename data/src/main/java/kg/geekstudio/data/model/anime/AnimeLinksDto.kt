package kg.geekstudio.data.model.anime

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.anime.AnimeLinks

data class AnimeLinksDto(
    val self: String
) : DataMapper<AnimeLinks> {
    override fun toDomain() = AnimeLinks(
        self
    )
}
