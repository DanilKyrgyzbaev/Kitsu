package kg.geekstudio.main.ui.signin

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kg.geekstudio.core.util.ResultStatus
import kg.geekstudio.core_ui.base.BaseViewModel
import kg.geekstudio.core_ui.state.UIState
import kg.geekstudio.data.local.TokenPreferences
import kg.geekstudio.domain.model.auth.AccessTokenResponse
import kg.geekstudio.domain.model.auth.Auth
import kg.geekstudio.domain.useCase.AuthUseCase
import kotlinx.coroutines.launch

class SigninViewModel(private val authUseCase: AuthUseCase) : BaseViewModel(){
    private val _token = MutableLiveData<UIState<AccessTokenResponse>>()
    val token: LiveData<UIState<AccessTokenResponse>> = _token

    fun auth(auth: Auth){
        viewModelScope.launch {
            val result = authUseCase.invoke(auth)
            when (result){
                is ResultStatus.Success -> {
                    Log.e("Response", "${result.data}")
                    TokenPreferences.userAccessToken = result.data!!.access_token
                    TokenPreferences.userRefreshToken = result.data!!.refresh_token
                    _token.value = UIState.Success(result.data!!)
                }
                is ResultStatus.Error -> {

                    _token.value = UIState.Error(result.message ?: "")
                    Log.e("Error", "${result.message}")
                }
                is ResultStatus.Loading ->{

                }
            }
        }
    }
}