package androidstudio.class24.kotlin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidstudio.class24.kotlin.FragmentClass24Input1.Companion.NAME_KEY
import androidx.fragment.app.Fragment
import com.rafaelmfer.codeclasses.R
import kotlinx.android.synthetic.main.fragment_class24_2.*

class FragmentClass24Output2 : Fragment() {

    private var activity: InterfaceFragments? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_class24_2, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity = context as InterfaceFragments
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvWelcomeName.text = getString(R.string.welcome_name, arguments?.get(NAME_KEY))
        btFrag2LetsGo.setOnClickListener { startActivity(Intent(it.context, Class24Act2::class.java)) }
    }

    companion object {
        fun newInstance(bundle: Bundle?): FragmentClass24Output2 {
            val frag = FragmentClass24Output2()
            frag.arguments = bundle
            return frag
        }
    }
}