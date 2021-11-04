package shoki.com.diabloruneword.di.modules

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import shoki.com.diabloruneword.db.rune.RuneDao
import shoki.com.diabloruneword.db.rune.RuneDatabase
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RoomRuneModule {

    @Singleton
    @Provides
    fun provideRuneDatabase(@ApplicationContext context: Context): RuneDatabase =
        Room
            .databaseBuilder(context, RuneDatabase::class.java, "rune.db")
            .addCallback(object: RoomDatabase.Callback() {
                override fun onCreate(db: SupportSQLiteDatabase) {
                    super.onCreate(db)
                }
            })
            .build()

    @Singleton
    @Provides
    fun provideRuneDao(database: RuneDatabase): RuneDao = database.runeDao()
}