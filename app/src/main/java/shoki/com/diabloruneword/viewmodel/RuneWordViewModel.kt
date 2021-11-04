package shoki.com.diabloruneword.viewmodel

import dagger.hilt.android.lifecycle.HiltViewModel
import shoki.com.diabloruneword.repository.RuneWordRepository
import shoki.com.diabloruneword.viewmodel.base.BaseViewModel
import javax.inject.Inject

@HiltViewModel
class RuneWordViewModel @Inject constructor(
    private val runeWordRepository: RuneWordRepository
): BaseViewModel() {

    fun searchRuneWord(keyword: String) = runeWordRepository.selectRuneWordLikeKeyword(keyword = keyword)
}