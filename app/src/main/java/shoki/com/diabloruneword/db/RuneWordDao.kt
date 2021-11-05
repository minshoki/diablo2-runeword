package shoki.com.diabloruneword.db

import androidx.room.Dao
import androidx.room.Query

@Dao
interface RuneWordDao {
    @Query("select * from rune_word")
    suspend fun getRuneWord(): List<RuneWordEntity>
}