package kg.geekstudio.data.apiservices

import kg.geekstudio.domain.model.auth.AccessTokenResponse
import kg.geekstudio.domain.model.auth.Auth
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.create
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApiService {
    @POST("oauth/token")
    suspend fun authenticate(@Body auth: Auth): Response<AccessTokenResponse>

    companion object {
        operator fun invoke(retrofit: Retrofit) = retrofit.create<AuthApiService>()
    }
}