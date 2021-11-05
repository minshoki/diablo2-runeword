package shoki.com.diabloruneword.db.rune

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.runBlocking
import java.util.concurrent.Executors

@Database(entities = [RuneEntity::class], version = 2)
abstract class RuneDatabase: RoomDatabase() {

    abstract fun runeDao(): RuneDao

    companion object {
        fun getInstance(context: Context): RuneDatabase {
            return Room
                .databaseBuilder(context, RuneDatabase::class.java, "rune.db")
                .fallbackToDestructiveMigration()
                .addCallback(object: RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        Executors.newSingleThreadExecutor().execute {
                            runBlocking {
                                getInstance(context).runeDao().insertRunes(*RuneEntity.createRunes(context).toTypedArray())
                            }
                        }
                    }
                })
                .build()
        }
    }
}