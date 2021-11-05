package shoki.com.diabloruneword.model

import shoki.com.diabloruneword.ext.isKorea

data class MultilingualModel(
    val kor: String,
    val en: String
) {
    fun display() = if(isKorea) kor else en
}