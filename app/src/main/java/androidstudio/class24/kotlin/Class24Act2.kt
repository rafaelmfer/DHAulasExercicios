package androidstudio.class24.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.rafaelmfer.codeclasses.R
import kotlinx.android.synthetic.main.activity_class24_2.*

class Class24Act2 : AppCompatActivity(), InterfaceFragments {
    
    private val fragManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class24_2)
        startFragment(FragmentClass24Image3())
        btFrag3Car1.setOnClickListener { startFragment(FragmentClass24Image3()) }
        btFrag3Car2.setOnClickListener { startFragment(FragmentClass24Image4()) }
    }

    override fun startFragment(fragment: Fragment) {
        val fragBack = hasThisFragment(fragment.javaClass.name)

        if (!fragBack) fragManager
            .beginTransaction()
            .replace(R.id.ivFrag3Car1, fragment)
            .addToBackStack(fragment.javaClass.name)
            .commit()
    }

    private fun hasThisFragment(fragName: String): Boolean {
        return fragManager.popBackStackImmediate(fragName, 0)
    }
}