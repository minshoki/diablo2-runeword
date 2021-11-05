package shoki.com.diabloruneword.db.rune

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.Executors

@Database(entities = [RuneEntity::class], version = 3)
abstract class RuneDatabase: RoomDatabase() {

    abstract fun runeDao(): RuneDao

    companion object {
        fun getInstance(context: Context): RuneDatabase {
            return Room
                .databaseBuilder(context, RuneDatabase::class.java, "rune.db")
                .setJournalMode(JournalMode.TRUNCATE)
                .createFromAsset("rune_default.db")
                .build()
        }
    }
}