package shoki.com.diabloruneword.ui.home

import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import shoki.com.diabloruneword.R
import shoki.com.diabloruneword.databinding.FragmentHomeBinding
import shoki.com.diabloruneword.ui.base.BaseBindingFragment
import shoki.com.diabloruneword.viewmodel.HomeViewModel

class HomeFragment : BaseBindingFragment<FragmentHomeBinding>() {

    private val homeViewModel: HomeViewModel by hiltNavGraphViewModels(R.id.mobile_navigation)

    override val layoutId: Int
        get() = R.layout.fragment_home


    override fun initView() {
        super.initView()
    }
}