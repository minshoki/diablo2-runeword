package shoki.com.diabloruneword.ui.base

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import shoki.com.diabloruneword.databinding.NavHeaderMainBinding

abstract class BaseBindingFragment<BINDING: ViewDataBinding>: Fragment() {
    protected lateinit var binding: BINDING

    abstract val layoutId: Int

    open fun initView() {}
    open fun initViewModel() {}
    open fun initListener() {}
    open fun afterViewCreated() {}

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initViewModel()
        initListener()
        afterViewCreated()
    }
}