package kg.geekstudio.domain.repository

import kg.geekstudio.core.util.ResultStatus
import kg.geekstudio.domain.model.auth.AccessTokenResponse
import kg.geekstudio.domain.model.auth.Auth

interface AuthRepository {
    suspend fun auth(auth: Auth): ResultStatus<AccessTokenResponse>
}