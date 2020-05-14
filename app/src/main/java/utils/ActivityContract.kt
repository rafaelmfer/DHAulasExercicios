package utils

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

interface ActivityContract {

    val activity get() = this as AppCompatActivity

    fun startFragment(fragment: Fragment)
}