package kg.geekstudio.data.model.auth

import kg.geekstudio.data.maper.DataMapper
import kg.geekstudio.domain.model.auth.Auth

data class AuthDto(
    val grant_type: String,
    val username: String,
    val password: String,
) : DataMapper<Auth> {
    override fun toDomain() = Auth(
        grant_type, username, password
    )
}
