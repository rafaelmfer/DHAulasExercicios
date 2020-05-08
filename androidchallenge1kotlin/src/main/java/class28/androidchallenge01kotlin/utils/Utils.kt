package class28.androidchallenge01kotlin.utils

import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.textfield.TextInputLayout

fun editTextIsNotEmpty(vararg editTexts: EditText): Boolean {
    for (et in editTexts) {
        if (et.text.toString().isEmpty()) {
            return false
        }
    }
    return true
}

fun removeErrorOnTextInputLayout(vararg textInputLayouts: TextInputLayout) {
    for (til in textInputLayouts) {
        til.error = null
    }
}

fun startFragment(fragManager: FragmentManager, fragment: Fragment, layout: Int) {
    val fragBack = hasThisFragment(fragManager, fragment.javaClass.name)
    if (!fragBack) fragManager
        .beginTransaction()
        .replace(layout, fragment)
        .addToBackStack(fragment.javaClass.name)
        .commit()
}

private fun hasThisFragment(fragManager: FragmentManager, fragName: String): Boolean {
    return fragManager.popBackStackImmediate(fragName, 0)
}