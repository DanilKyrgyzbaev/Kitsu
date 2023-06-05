package kg.geekstudio.data.apiservices

import kg.geekstudio.domain.model.manga.MangaData
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.create
import retrofit2.http.GET

interface MangaApiServise {

    @GET("edge/manga")
    suspend fun getManga(): Response<MangaData>

    companion object {
        operator fun invoke(retrofit: Retrofit) = retrofit.create<MangaApiServise>()
    }
}