package shoki.com.diabloruneword

import android.app.Application
import com.facebook.stetho.Stetho
import dagger.hilt.android.HiltAndroidApp
import shoki.com.diabloruneword.db.AppDatabase
import javax.inject.Inject

@HiltAndroidApp
class App: Application() {

    @Inject lateinit var appDatabase: AppDatabase

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        AppDatabase.getInstance(this)
    }
}