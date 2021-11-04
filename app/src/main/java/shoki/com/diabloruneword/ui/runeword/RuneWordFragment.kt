package shoki.com.diabloruneword.ui.runeword

import androidx.appcompat.widget.SearchView
import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import shoki.com.diabloruneword.R
import shoki.com.diabloruneword.databinding.FragmentRunewordBinding
import shoki.com.diabloruneword.ui.base.BaseBindingFragment
import shoki.com.diabloruneword.viewmodel.HomeViewModel
import shoki.com.diabloruneword.viewmodel.RuneWordViewModel

class RuneWordFragment: BaseBindingFragment<FragmentRunewordBinding>() {

    private val runeWordViewModel: RuneWordViewModel by hiltNavGraphViewModels(R.id.mobile_navigation)

    override val layoutId: Int
        get() = R.layout.fragment_runeword

    override fun initViewModel() {
        super.initViewModel()
    }

    override fun initListener() {
        super.initListener()
        binding.run {
            searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    query ?: return false
                    runeWordViewModel.searchRuneWord(query)
                    return false
                }

                override fun onQueryTextChange(newText: String?) = false
            })
        }
    }
}