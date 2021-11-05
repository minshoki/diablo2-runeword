package shoki.com.diabloruneword.di.modules

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import androidx.sqlite.db.SupportSQLiteQuery
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import shoki.com.diabloruneword.db.rune.RuneDao
import shoki.com.diabloruneword.db.rune.RuneDatabase
import shoki.com.diabloruneword.db.rune.RuneEntity
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RoomRuneModule {

    @Singleton
    @Provides
    fun provideRuneDatabase(@ApplicationContext context: Context): RuneDatabase = RuneDatabase.getInstance(context)

    @Singleton
    @Provides
    fun provideRuneDao(database: RuneDatabase): RuneDao = database.runeDao()
}