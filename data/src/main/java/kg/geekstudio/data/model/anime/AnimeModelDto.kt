package kg.geekstudio.data.model.anime

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.anime.AnimeModel

data class AnimeModelDto(
    val data: List<AnimeDataDto>
) : DataMapper<AnimeModel> {
    override fun toDomain() = AnimeModel(
        data.map { it.toDomain() }
    )
}
