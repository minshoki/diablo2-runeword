package shoki.com.diabloruneword.ui.base

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseBindingActivity<BINDING : ViewDataBinding> : AppCompatActivity() {
    protected lateinit var binding: BINDING
    abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        beforeSetContentView()
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId)
        initView()
        initViewModel()
        initListener()

        afterOnCreate()
    }

    open fun beforeSetContentView() {}
    open fun initView() {}
    open fun initViewModel() {}
    open fun initListener() {}
    open fun afterOnCreate() {}

}