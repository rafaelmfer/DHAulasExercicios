package com.my_utils.baseviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

interface ActivityContract {

    val activity get() = this as AppCompatActivity

    val activityContract get() = this as AppCompatActivity

    val container: Int

    fun bundleRouter(fragID: Int, bundle: Bundle? = null) {}

    fun onBackPress() = activityContract.onBackPressed()

    fun popBackStack() = activityContract.supportFragmentManager.popBackStack()

    fun startFragment(fragment: Fragment) {}
}