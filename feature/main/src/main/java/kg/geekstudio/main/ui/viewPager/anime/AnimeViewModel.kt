package kg.geekstudio.main.ui.viewPager.anime

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kg.geekstudio.core.util.ResultStatus
import kg.geekstudio.core_ui.base.BaseViewModel
import kg.geekstudio.core_ui.state.UIState
import kg.geekstudio.domain.model.AnimeData
import kg.geekstudio.domain.useCase.GetAnimeUseCase
import kotlinx.coroutines.launch

class AnimeViewModel(private val getAnimeUseCase: GetAnimeUseCase) : BaseViewModel() {
    private val _animeList = MutableLiveData<UIState<List<AnimeData>>>()
    val animeList: LiveData<UIState<List<AnimeData>>> = _animeList

    fun fetchAnime() {
        viewModelScope.launch {
            val result = getAnimeUseCase()
            when(result){
                is ResultStatus.Success ->{
                    val animeDataList = result.data ?: emptyList()
                    _animeList.value = UIState.Success(animeDataList)
                    Log.e("Success", "${result.data}")
                }
                is ResultStatus.Error -> {
                    _animeList.value = UIState.Error(result.message ?: "")
                    Log.e("Error", "${result.message}")
                }
                is ResultStatus.Loading -> {
                    // Обработка состояния загрузки
                }
            }
        }
    }
}