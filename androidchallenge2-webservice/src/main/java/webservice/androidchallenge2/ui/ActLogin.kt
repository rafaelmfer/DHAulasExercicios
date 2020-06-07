package webservice.androidchallenge2.ui

import com.my_utils.baseviews.ActBind
import com.my_utils.baseviews.ActivityContract
import com.my_utils.baseviews.FragBase.Companion.new
import com.my_utils.databinding.ActFrameBinding
import com.my_utils.extensions.replaceFragment
import webservice.androidchallenge2.R

class ActLogin(override val container: Int = R.id.act_frame_container) : ActBind<ActFrameBinding>(),
    ActivityContract {

    override val bindClass by lazy { ActFrameBinding::class.java }

    override fun ActFrameBinding.onBoundView() {
        replaceFragment(new<FragLogin>(bundle = null), stackAdd = false)
    }

}
