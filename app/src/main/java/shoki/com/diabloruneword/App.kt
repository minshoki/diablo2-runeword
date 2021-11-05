package shoki.com.diabloruneword

import android.app.Application
import androidx.room.Room
import com.facebook.stetho.Stetho
import dagger.hilt.android.HiltAndroidApp
import shoki.com.diabloruneword.db.rune.RuneDatabase
import javax.inject.Inject

@HiltAndroidApp
class App: Application() {

    @Inject lateinit var runeDatabase: RuneDatabase

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        RuneDatabase.getInstance(this)
    }
}