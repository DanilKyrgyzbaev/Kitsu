package kg.geekstudio.data.apiservices

import kg.geekstudio.domain.model.anime.AnimeModel
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.create
import retrofit2.http.GET

interface AnimeApiService {

    @GET("edge/anime")
    suspend fun getAnime(): Response<AnimeModel>

    companion object {
        operator fun invoke(retrofit: Retrofit) = retrofit.create<AnimeApiService>()
    }
}