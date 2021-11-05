package shoki.com.diabloruneword.repository

import shoki.com.diabloruneword.db.rune.RuneDao
import shoki.com.diabloruneword.db.rune.RuneDatabase
import shoki.com.diabloruneword.model.RuneModel
import javax.inject.Inject

class RuneRepository @Inject constructor(private val runeDao: RuneDao) {


    suspend fun getRunes() = runeDao.getRunes()
        .map { rune -> RuneModel.convert(rune) }

}