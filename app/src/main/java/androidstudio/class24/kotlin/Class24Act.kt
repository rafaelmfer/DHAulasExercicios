package androidstudio.class24.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.rafaelmfer.codeclasses.R

class Class24Act : AppCompatActivity(), InterfaceFragments {

    private val fragManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_frame)
        startFragment(FragmentClass24Input1())
    }

    override fun startFragment(fragment: Fragment) {
        val fragBack = hasThisFragment(fragment.javaClass.name)

        if (!fragBack) fragManager
            .beginTransaction()
            .replace(R.id.act_frame_container, fragment)
            .addToBackStack(fragment.javaClass.name)
            .commit()
    }

    private fun hasThisFragment(fragName: String): Boolean {
        return fragManager.popBackStackImmediate(fragName, 0)
    }
}