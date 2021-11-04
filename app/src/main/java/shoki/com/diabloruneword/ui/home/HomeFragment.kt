package shoki.com.diabloruneword.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import shoki.com.diabloruneword.R
import shoki.com.diabloruneword.databinding.FragmentHomeBinding
import shoki.com.diabloruneword.ui.base.BaseBindingFragment

class HomeFragment : BaseBindingFragment<FragmentHomeBinding>() {

    private val homeViewModel: HomeViewModel by hiltNavGraphViewModels(R.id.mobile_navigation)

    override val layoutId: Int
        get() = R.layout.fragment_home


    override fun initView() {
        super.initView()
        homeViewModel
    }
}