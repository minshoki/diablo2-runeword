package shoki.com.diabloruneword.db.rune

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RuneDao {

    @Query("select * from rune")
    suspend fun getRunes(): List<RuneEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRunes(vararg rune: RuneEntity)
}