package kg.geekstudio.data.apiservices

import kg.geekstudio.data.model.anime.AnimeModelDto
import kg.geekstudio.domain.model.anime.AnimeModel
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Query

interface AnimeApiService {

    @GET("edge/anime")
    suspend fun getAnime(
        @Query("page[limit]") limit: Int,
        @Query("page[offset]") offset: Int
    ): Response<AnimeModel>

//    @GET("edge/anime")
//    suspend fun getAnime(
//        @Query("page[limit]") limit: Int,
//        @Query("page[offset]") offset: Int
//    ): Response<AnimeModelDto>

    companion object {
        operator fun invoke(retrofit: Retrofit) = retrofit.create<AnimeApiService>()
    }
}