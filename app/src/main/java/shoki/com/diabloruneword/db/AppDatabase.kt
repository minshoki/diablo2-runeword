package shoki.com.diabloruneword.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [RuneEntity::class, RuneWordEntity::class], version = 10)
abstract class AppDatabase: RoomDatabase() {

    abstract fun runeDao(): RuneDao
    abstract fun runeWordDao(): RuneWordDao

    companion object {
        fun getInstance(context: Context): AppDatabase {
            return Room
                .databaseBuilder(context, AppDatabase::class.java, "diablo2.db")
                .setJournalMode(JournalMode.TRUNCATE)
                .addCallback(object: RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        db.execSQL("INSERT INTO rune VALUES(1,'El(1)','El(1)','+50 To Attack Rating, +1 Light Radius','+50 To Attack Rating, +1 Light Radius','+15 Defense, +1 To Light Radius','+15 Defense, +1 To Light Radius','');")
                        db.execSQL("INSERT INTO rune VALUES(2,'Eld(2)','Eld(2)','+75% Damage To Undead, +50 Attack Rating Against Undead','+75% Damage To Undead, +50 Attack Rating Against Undead','15% Slower Stamina D비 (Rain)/7% Increased Chance of Blocking(Shields)','15% Slower Stamina D비 (Rain)/7% Increased Chance of Blocking(Shields)','');")
                        db.execSQL("INSERT INTO rune VALUES(3,'Tir(3)','Tir(3)','+2 To Mana After Each Kill','+2 To Mana After Each Kill','+2 To Mana After Each Kill','+2 To Mana After Each Kill','');")
                        db.execSQL("INSERT INTO rune VALUES(4,'Nef(4)','Nef(4)','Knockback','Knockback','+30 Defense Vs. Missile','+30 Defense Vs. Missile','');")
                        db.execSQL("INSERT INTO rune VALUES(5,'Eth(5)','Eth(5)','-25% To Target Defense','-25% To Target Defense','Regenerate Mana 15%','Regenerate Mana 15%','');")
                        db.execSQL("INSERT INTO rune VALUES(6,'Ith(6)','Ith(6)','+9 To Maximum Damage','+9 To Maximum Damage','15% Damage Taken Goes to Mana','15% Damage Taken Goes to Mana','');")
                        db.execSQL("INSERT INTO rune VALUES(7,'Tal(7)','Tal(7)','+75 Poison Damage Over 5 Seconds','+75 Poison Damage Over 5 Seconds','Poison Resist 30%/Poison Resist 35%(Shields)','Poison Resist 30%/Poison Resist 35%(Shields)','');")
                        db.execSQL("INSERT INTO rune VALUES(8,'Ral(8)','Ral(8)','Adds 5-30 Fire Damage','Adds 5-30 Fire Damage','Fire Resist 30%/Fire Resist 35%(Shields)','Fire Resist 30%/Fire Resist 35%(Shields)','');")
                        db.execSQL("INSERT INTO rune VALUES(9,'Ort(9)','Ort(9)','Adds 1-50 Lightning Damage','Adds 1-50 Lightning Damage','Lightning Resist 30%/Lightning Resist 35%(Shields)','Lightning Resist 30%/Lightning Resist 35%(Shields)','');")
                        db.execSQL("INSERT INTO rune VALUES(10,'Thul(10)','Thul(10)','Adds 3-14 Cold Damage - 3 Second Duration','Adds 3-14 Cold Damage - 3 Second Duration','Cold Resist 30%/Cold Resist 35%(Shields)','Cold Resist 30%/Cold Resist 35%(Shields)','');")
                        db.execSQL("INSERT INTO rune VALUES(11,'Amn(11)','Amn(11)','7% Life Stolen Per Hit','7% Life Stolen Per Hit','Attacker Takes Damage of 14','Attacker Takes Damage of 14','');")
                        db.execSQL("INSERT INTO rune VALUES(12,'Sol(12)','Sol(12)','+9 To Minimum Damage','+9 To Minimum Damage','Damage Reduced By 7','Damage Reduced By 7','');")
                        db.execSQL("INSERT INTO rune VALUES(13,'Shael(13)','Shael(13)','20% Increased Attack Speed','20% Increased Attack Speed','20% Faster Hit Recovery/20% Faster Block Rate(Shields)','20% Faster Hit Recovery/20% Faster Block Rate(Shields)','');")
                        db.execSQL("INSERT INTO rune VALUES(14,'Dol(14)','Dol(14)','Hit Causes Monster To Flee 25%','Hit Causes Monster To Flee 25%','Replenish Life +7','Replenish Life +7','');")
                        db.execSQL("INSERT INTO rune VALUES(15,'Hel(15)','Hel(15)','Requirements -20%','Requirements -20%','Requirements -15%','Requirements -15%','');")
                        db.execSQL("INSERT INTO rune VALUES(16,'Io(16)','Io(16)','+10 To Vitality','+10 To Vitality','+10 To Vitality','+10 To Vitality','');")
                        db.execSQL("INSERT INTO rune VALUES(17,'Lum(17)','Lum(17)','+10 To Energy','+10 To Energy','+10 To Energy','+10 To Energy','');")
                        db.execSQL("INSERT INTO rune VALUES(18,'Ko(18)','Ko(18)','+10 To Dexterity','+10 To Dexterity','+10 To Dexterity','+10 To Dexterity','');")
                        db.execSQL("INSERT INTO rune VALUES(19,'Fal(19)','Fal(19)','+10 To 스트렝쓰(Strength)','+10 To 스트렝쓰(Strength)','+10 To 스트렝쓰(Strength)','+10 To 스트렝쓰(Strength)','');")
                        db.execSQL("INSERT INTO rune VALUES(20,'Lem(20)','Lem(20)','75% Extra Gold From Monsters','75% Extra Gold From Monsters','50% Extra Gold From Monsters','50% Extra Gold From Monsters','');")
                        db.execSQL("INSERT INTO rune VALUES(21,'Pul(21)','Pul(21)','+75% Damage To Demons, +100 Attack Rating Against Demons','+75% Damage To Demons, +100 Attack Rating Against Demons','+30% Enhanced Defense','+30% Enhanced Defense','');")
                        db.execSQL("INSERT INTO rune VALUES(22,'Um(22)','Um(22)','25% Chance of Open Wounds','25% Chance of Open Wounds','All Resistances +15(Armor/Helms) +22(Shields)','All Resistances +15(Armor/Helms) +22(Shields)','');")
                        db.execSQL("INSERT INTO rune VALUES(23,'Mal(23)','Mal(23)','Prevent Monster Heal','Prevent Monster Heal','Magic Damage Reduced By 7','Magic Damage Reduced By 7','');")
                        db.execSQL("INSERT INTO rune VALUES(24,'Ist(24)','Ist(24)','30% Better Chance of Getting Magic Items','30% Better Chance of Getting Magic Items','25% Better Chance of Getting Magic Items','25% Better Chance of Getting Magic Items','');")
                        db.execSQL("INSERT INTO rune VALUES(25,'Gul(25)','Gul(25)','20% Bonus To Attack Rating','20% Bonus To Attack Rating','5% To Maximum Poison Resist','5% To Maximum Poison Resist','');")
                        db.execSQL("INSERT INTO rune VALUES(26,'Vex(26)','Vex(26)','7% Mana Stolen Per Hit','7% Mana Stolen Per Hit','5% To Maximum Fire Resist','5% To Maximum Fire Resist','');")
                        db.execSQL("INSERT INTO rune VALUES(27,'Ohm(27)','Ohm(27)','+50% Enhanced Damage','+50% Enhanced Damage','5% To Maximum Cold Resist','5% To Maximum Cold Resist','');")
                        db.execSQL("INSERT INTO rune VALUES(28,'Lo(28)','Lo(28)','20% Deadly Strike','20% Deadly Strike','5% To Maximum Lightning Resist','5% To Maximum Lightning Resist','');")
                        db.execSQL("INSERT INTO rune VALUES(29,'Sur(29)','Sur(29)','Hit Blinds Target','Hit Blinds Target','Maximum Mana 5%/+50 To Mana (Shields)','Maximum Mana 5%/+50 To Mana (Shields)','');")
                        db.execSQL("INSERT INTO rune VALUES(30,'Ber(30)','Ber(30)','20% Chance of Crushing Blow','20% Chance of Crushing Blow','Damage Reduced by 8%','Damage Reduced by 8%','');")
                        db.execSQL("INSERT INTO rune VALUES(31,'Jah(31)','Jah(31)','Ignore Target''s Defense','Ignore Target''s Defense','Increase Maximum Life 5%/+50 Life (Shields)','Increase Maximum Life 5%/+50 Life (Shields)','');")
                        db.execSQL("INSERT INTO rune VALUES(32,'Cham(32)','Cham(32)','Freeze Target +3','Freeze Target +3','Cannot Be Frozen','Cannot Be Frozen','');")
                        db.execSQL("INSERT INTO rune VALUES(33,'Zod(33)','Zod(33)','Indestructible','Indestructible','Indestructible','Indestructible','');")
                    }
                })
                .build()
        }
    }
}