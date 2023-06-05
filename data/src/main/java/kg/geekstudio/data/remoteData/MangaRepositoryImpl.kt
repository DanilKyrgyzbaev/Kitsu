package kg.geekstudio.data.remoteData

import kg.geekstudio.core.util.ResultStatus
import kg.geekstudio.data.apiservices.MangaApiServise
import kg.geekstudio.domain.model.manga.MangaItem
import kg.geekstudio.domain.repository.MangaRepository

class MangaRepositoryImpl(private val mangaapiServise: MangaApiServise): MangaRepository{
    override suspend fun getManga(): ResultStatus<List<MangaItem>> {
        return try {
            val response = mangaapiServise.getManga()
            if(response.isSuccessful){
                val animeResponse = response.body()
                animeResponse?.data?.let {
                    ResultStatus.Success(it)
                }?: ResultStatus.Error(null, "Пустые данные ответа")
            } else {
                ResultStatus.Error(null, "Не удалось получить данные об аниме.")
            }
        } catch (e: Exception) {
            ResultStatus.Error(null, e.message)
        }
    }
}