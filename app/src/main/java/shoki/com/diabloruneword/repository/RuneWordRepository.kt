package shoki.com.diabloruneword.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RuneWordRepository @Inject constructor() {

    fun selectRuneWordLikeKeyword(keyword: String): Flow<Any> {
        return flow {

        }
    }
}