package uz.unzosoft.fastfoodbecasel

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import uz.unzosoft.fastfoodbecasel.di.fastModule

class MyKoinApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MyKoinApplication)
            modules(fastModule)
        }
    }

}