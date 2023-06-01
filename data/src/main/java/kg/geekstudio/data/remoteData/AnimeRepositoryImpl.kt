package kg.geekstudio.data.remoteData

import kg.geekstudio.core.util.ResultStatus
import kg.geekstudio.data.apiservices.AnimeApiService
import kg.geekstudio.domain.model.anime.AnimeData
import kg.geekstudio.domain.repository.AnimeRepository
import java.lang.Exception

class AnimeRepositoryImpl(private val apiService: AnimeApiService): AnimeRepository {

    override suspend fun getAnime(): ResultStatus<List<AnimeData>>{
        return try {
            val response = apiService.getAnime()
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