package shoki.com.diabloruneword.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rune_word")
data class RuneWordEntity(
    @PrimaryKey val index: Int
)