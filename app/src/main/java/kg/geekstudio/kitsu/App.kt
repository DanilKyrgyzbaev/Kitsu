package kg.geekstudio.kitsu

import android.app.Application
import kg.geekstudio.data.di.dataModule
import kg.geekstudio.domain.di.domainModule
import kg.geekstudio.main.di.mainModule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.koin.core.context.startKoin
import kotlin.time.ExperimentalTime

@ExperimentalTime
@ExperimentalCoroutinesApi
@ExperimentalStdlibApi
class App: Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                listOf(
                    domainModule,
                    dataModule,
                    mainModule
                )
            )
        }
    }
}