package kg.geekstudio.main.ui.viewPager.manga

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kg.geekstudio.core.util.ResultStatus
import kg.geekstudio.core_ui.base.BaseViewModel
import kg.geekstudio.core_ui.state.UIState
import kg.geekstudio.domain.model.manga.MangaItem
import kg.geekstudio.domain.useCase.GetMangaUseCase
import kotlinx.coroutines.launch

class MangaViewModel(private val getMangaUseCase: GetMangaUseCase) : BaseViewModel() {
    private val _mangaList = MutableLiveData<UIState<List<MangaItem>>>()
    val mangaList: LiveData<UIState<List<MangaItem>>> = _mangaList

    fun fetchManga(){
        viewModelScope.launch {
            val result = getMangaUseCase()
            when(result){
                is ResultStatus.Success ->{
                    val mangaDataList = result.data ?: emptyList()
                    _mangaList.value = UIState.Success(mangaDataList)
                    Log.e("Success", "${result.data}")
                }
                is ResultStatus.Error -> {
                    _mangaList.value = UIState.Error(result.message ?: "")
                    Log.e("Error", "${result.message}")
                }
                is ResultStatus.Loading -> {
                    // Обработка состояния загрузки
                }
            }
        }
    }
}