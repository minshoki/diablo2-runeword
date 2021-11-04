package shoki.com.diabloruneword.ui.rune

import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import shoki.com.diabloruneword.R
import shoki.com.diabloruneword.databinding.FragmentRuneBinding
import shoki.com.diabloruneword.ui.base.BaseBindingFragment
import shoki.com.diabloruneword.viewmodel.RuneViewModel

class RuneFragment: BaseBindingFragment<FragmentRuneBinding>() {

    private val runeViewModel: RuneViewModel by hiltNavGraphViewModels(R.id.mobile_navigation)

    override val layoutId: Int
        get() = R.layout.fragment_rune

    override fun initViewModel() {
        super.initViewModel()
            runeViewModel
    }
}