package shoki.com.diabloruneword.db.rune

import androidx.room.Dao
import androidx.room.Query

@Dao
interface RuneDao {

    @Query("select * from rune")
    suspend fun getRunes(): List<RuneEntity>
}