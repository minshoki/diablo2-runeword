package shoki.com.diabloruneword.ui.rune

import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import shoki.com.diabloruneword.R
import shoki.com.diabloruneword.databinding.FragmentRuneBinding
import shoki.com.diabloruneword.ui.base.BaseBindingFragment
import shoki.com.diabloruneword.ui.rune.adapter.RuneAdapter
import shoki.com.diabloruneword.viewmodel.RuneViewModel

class RuneFragment: BaseBindingFragment<FragmentRuneBinding>() {

    private val runeViewModel: RuneViewModel by hiltNavGraphViewModels(R.id.mobile_navigation)
    private val runeAdapter: RuneAdapter by lazy { RuneAdapter() }

    override val layoutId: Int
        get() = R.layout.fragment_rune

    override fun initViewModel() {
        super.initViewModel()
    }

    override fun initView() {
        super.initView()
        binding.rvRune.adapter = runeAdapter
    }

    override fun afterViewCreated() {
        super.afterViewCreated()
            runeViewModel.getRunes()
                .onEach { runeAdapter.submitList(it) }
                .launchIn(lifecycleScope)
    }
}