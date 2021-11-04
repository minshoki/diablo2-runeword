package shoki.com.diabloruneword.db.rune

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [RuneEntity::class], version = 1)
abstract class RuneDatabase: RoomDatabase() {

    abstract fun runeDao(): RuneDao
}