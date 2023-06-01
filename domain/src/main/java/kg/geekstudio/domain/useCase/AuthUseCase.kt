package kg.geekstudio.domain.useCase

import kg.geekstudio.core.util.ResultStatus
import kg.geekstudio.domain.model.auth.AccessTokenResponse
import kg.geekstudio.domain.model.auth.Auth
import kg.geekstudio.domain.repository.AuthRepository

class AuthUseCase (private val authRepository: AuthRepository) {
    suspend operator fun invoke(auth: Auth): ResultStatus<AccessTokenResponse> {
        return authRepository.auth(auth)
    }
}