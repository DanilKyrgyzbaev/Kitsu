package kg.geekstudio.data.remoteData

import kg.geekstudio.core.util.ResultStatus
import kg.geekstudio.data.apiservices.AuthApiService
import kg.geekstudio.domain.model.auth.AccessTokenResponse
import kg.geekstudio.domain.model.auth.Auth
import kg.geekstudio.domain.repository.AuthRepository

class AuthRepositoryImpl(private val authApiService: AuthApiService): AuthRepository {

    override suspend fun auth(auth: Auth): ResultStatus<AccessTokenResponse> {
        return try {
            val response = authApiService.authenticate((auth))
            if (response.isSuccessful){
                val authResponse = response.body()
                authResponse?.let {
                    ResultStatus.Success(it)
                }?:ResultStatus.Error(null, "${response.errorBody()}")
            } else{
                ResultStatus.Error(null, "${response.errorBody()}")
            }
        } catch (e: Exception){
            ResultStatus.Error(null, e.message)
        }
    }
}