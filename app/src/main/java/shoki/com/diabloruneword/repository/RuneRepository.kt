package shoki.com.diabloruneword.repository

import shoki.com.diabloruneword.db.rune.RuneDao
import shoki.com.diabloruneword.db.rune.RuneDatabase
import javax.inject.Inject

class RuneRepository @Inject constructor(private val runeDao: RuneDao) {


    suspend fun getRunes() = runeDao.getRunes()

}