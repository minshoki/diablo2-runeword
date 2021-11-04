package shoki.com.diabloruneword.viewmodel

import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import shoki.com.diabloruneword.repository.RuneRepository
import shoki.com.diabloruneword.viewmodel.base.BaseViewModel
import javax.inject.Inject

@HiltViewModel
class RuneViewModel @Inject constructor(
    private val runeRepository: RuneRepository
): BaseViewModel() {
    init {
        viewModelScope.launch {
            runeRepository.getRunes()
        }
    }
}