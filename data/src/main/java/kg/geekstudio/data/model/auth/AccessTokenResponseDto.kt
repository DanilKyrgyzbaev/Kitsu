package kg.geekstudio.data.model.auth

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.auth.AccessTokenResponse

data class AccessTokenResponseDto(
    val access_token: String,
    val token_type: String,
    val expires_in: Long,
    val refresh_token: String,
    val scope: String,
    val created_at: Long
) : DataMapper<AccessTokenResponse> {
    override fun toDomain() = AccessTokenResponse(
        access_token, token_type, expires_in, refresh_token, scope, created_at
    )
}