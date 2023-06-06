package kg.geekstudio.data.remoteData

import kg.geekstudio.core.util.ResultStatus
import kg.geekstudio.data.apiservices.AnimeApiService
import kg.geekstudio.domain.model.anime.AnimeData
import kg.geekstudio.domain.repository.AnimeRepository
import java.lang.Exception

class AnimeRepositoryImpl(private val animeApiService: AnimeApiService): AnimeRepository {

    override suspend fun getAnime(limit: Int, offset: Int): ResultStatus<List<AnimeData>>{
        return try {
            val response = animeApiService.getAnime(limit, offset)
            if(response.isSuccessful){
                val animeResponse = response.body()
                animeResponse?.data?.let {
                    ResultStatus.Success(it)
                }?: ResultStatus.Error(null, "Пустые данные ответа")
            } else {
                ResultStatus.Error(null, "Не удалось получить данные об аниме.")
            }
        } catch (e: Exception) {
            ResultStatus.Error(null, e.message)
        }
    }
}

//class BooksRepositoryImpl(
//    private val bookService: BooksApiService
//) : BooksRepository, BaseRepository() {
//    override fun getBooks(
//        query: String,
//        maxResult: Int
//    ): Flow<Resource<List<BooksLibrary>>> = doReguest {
//        listOf(bookService.bookSearch(query, maxResult).toDomain())
//    }
//}