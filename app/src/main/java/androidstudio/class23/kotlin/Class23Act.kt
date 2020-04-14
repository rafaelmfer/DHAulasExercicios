package androidstudio.class23.kotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.rafaelmfer.codeclasses.R
import kotlinx.android.synthetic.main.activity_class23.*

class Class23Act : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class23)

        //Chamada Simples apenas com uma extração de método
        btFragmentOne.setOnClickListener(loadFragment(Class23FragOne()))

        //Chamada Mais complexa com mais de uma extração de método
        btFragmentTwo.loadThisFragment(Class23FragTwo())
    }

    private fun View.loadThisFragment(frag: Fragment) = setOnClickListener(loadFragment(frag))

    private fun loadFragment(fragment: Fragment) =
        View.OnClickListener { supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit() }
}