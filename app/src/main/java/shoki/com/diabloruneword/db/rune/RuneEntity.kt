package shoki.com.diabloruneword.db.rune

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rune")
data class RuneEntity(
    @PrimaryKey val index: Int,
    @ColumnInfo(name = "kor_name") val korName: String,
    @ColumnInfo(name = "en_name") val enName: String,

    @ColumnInfo(name = "kor_weapon_effect") val korWeaponEffect: String,
    @ColumnInfo(name = "en_weapon_effect") val enWeaponEffect: String,

    @ColumnInfo(name = "kor_etc_effect") val korEtcEffect: String,
    @ColumnInfo(name = "en_etc_effect") val enEtcEffect: String,

    @ColumnInfo(name = "image_path") val imagePath: String
)