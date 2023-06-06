package kg.geekstudio.data.model.anime

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.anime.AnimeTitles

data class AnimeTitlesDto(
    val en: String,
    val en_jp: String,
    val ja_jp: String
) : DataMapper<AnimeTitles> {
    override fun toDomain() = AnimeTitles(
        en, en_jp, ja_jp
    )
}
