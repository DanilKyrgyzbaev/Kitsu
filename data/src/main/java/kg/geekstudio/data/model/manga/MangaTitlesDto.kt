package kg.geekstudio.data.model.manga

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.manga.MangaTitles

data class MangaTitlesDto(
    val en: String?,
    val en_jp: String,
    val en_us: String
) : DataMapper<MangaTitles> {
    override fun toDomain() = MangaTitles(
        en, en_jp, en_us
    )
}
