package shoki.com.diabloruneword.viewmodel

import android.util.Log
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import shoki.com.diabloruneword.repository.RuneRepository
import shoki.com.diabloruneword.viewmodel.base.BaseViewModel
import java.util.logging.LogRecord
import javax.inject.Inject

@HiltViewModel
class RuneViewModel @Inject constructor(
    private val runeRepository: RuneRepository
): BaseViewModel() {


    fun getRunes() = flow {
        val d = runeRepository.getRunes()
        Log.e("shokitest", "d $d")
        emit(d)
    }
}