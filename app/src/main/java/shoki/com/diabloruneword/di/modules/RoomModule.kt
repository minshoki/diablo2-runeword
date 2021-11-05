package shoki.com.diabloruneword.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import shoki.com.diabloruneword.db.RuneDao
import shoki.com.diabloruneword.db.AppDatabase
import shoki.com.diabloruneword.db.RuneWordDao
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RoomModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase = AppDatabase.getInstance(context)

    @Singleton
    @Provides
    fun provideRuneDao(database: AppDatabase): RuneDao = database.runeDao()

    @Singleton
    @Provides
    fun provideRuneWordDao(database: AppDatabase): RuneWordDao = database.runeWordDao()
}