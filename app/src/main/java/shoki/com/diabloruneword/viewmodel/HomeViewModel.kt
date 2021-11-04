package shoki.com.diabloruneword.viewmodel

import dagger.hilt.android.lifecycle.HiltViewModel
import shoki.com.diabloruneword.repository.HomeRepository
import shoki.com.diabloruneword.viewmodel.base.BaseViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val homeRepository: HomeRepository
) : BaseViewModel() {

}