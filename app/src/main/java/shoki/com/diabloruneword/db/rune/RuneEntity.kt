package shoki.com.diabloruneword.db.rune

import android.content.Context
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.json.JSONArray
import java.io.IOException
import java.io.InputStream
import java.nio.charset.Charset

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
) {


    companion object {
        fun createRunes(context: Context): List<RuneEntity> {
            context.openFileOutput("rune14.json", Context.MODE_PRIVATE).use {
                val input = context.assets.open("rune.json")
                it.write(input.readBytes())
            }
            val data = context.openFileInput("rune14.json").bufferedReader().readLines().toString()
            val jsonArray = JSONArray(data.replace("\n","")
                .replace(",,", ",")
                .replace(", ]]", "]")
                .replace("[[", "[")
                .replace(", }]", "}]")
            )
            return (1..jsonArray.length()).map { index ->
                val rune = jsonArray.getJSONObject(index - 1)
                RuneEntity(
                    index = index,
                    korName = rune.getString("이름"),
                    enName = rune.getString("이름"),
                    korWeaponEffect = rune.getString("무기장착시"),
                    enWeaponEffect = rune.getString("무기장착시"),
                    korEtcEffect = rune.getString("기타 장착시"),
                    enEtcEffect = rune.getString("기타 장착시"),
                    imagePath = ""
                )
            }.toList()
        }
    }
}