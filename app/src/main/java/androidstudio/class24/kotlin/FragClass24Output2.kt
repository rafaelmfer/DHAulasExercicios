package androidstudio.class24.kotlin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidstudio.class24.kotlin.FragClass24Input1.Companion.NAME_KEY
import androidx.fragment.app.Fragment
import com.my_utils.baseviews.ActivityContract
import com.rafaelmfer.codeclasses.R
import kotlinx.android.synthetic.main.fragment_class24_2.*

class FragClass24Output2 : Fragment() {

    private var activity: ActivityContract? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_class24_2, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity = context as ActivityContract
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvWelcomeName.text = getString(R.string.welcome_name, arguments?.get(NAME_KEY))
        btFrag2LetsGo.setOnClickListener { startActivity(Intent(it.context, Act2Class24::class.java)) }
    }

    companion object {
        fun newInstance(bundle: Bundle?): FragClass24Output2 {
            val frag = FragClass24Output2()
            frag.arguments = bundle
            return frag
        }
    }
}