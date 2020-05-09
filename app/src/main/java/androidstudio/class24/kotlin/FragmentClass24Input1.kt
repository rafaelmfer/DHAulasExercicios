package androidstudio.class24.kotlin

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputLayout
import com.rafaelmfer.codeclasses.R
import kotlinx.android.synthetic.main.fragment_class24_1.*

class FragmentClass24Input1 : Fragment() {

    private var activity: InterfaceFragments? = null
    
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_class24_1, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity = context as InterfaceFragments
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btFrag1SignIn.setOnClickListener {
            removeErrorOnTextInputLayout(tilClass24UserName, tilClass24UserEmail, tilClass24UserPassword)
            if (editTextIsNotEmpty(etClass24UserName, etClass24UserEmail, etClass24UserPassword)) {
                val bundle = Bundle()
                bundle.putString(NAME_KEY, etClass24UserName.text.toString())
                activity?.startFragment(FragmentClass24Output2.newInstance(bundle))
            } else {
                if (!editTextIsNotEmpty(etClass24UserName)) {
                    tilClass24UserName.error = getString(R.string.error_field_must_be_filled)
                }
                if (!editTextIsNotEmpty(etClass24UserEmail)) {
                    tilClass24UserEmail.error = getString(R.string.error_field_must_be_filled)
                }
                if (!editTextIsNotEmpty(etClass24UserPassword)) {
                    tilClass24UserPassword.error = getString(R.string.error_field_must_be_filled)
                }
            }
        }
    }

    companion object {
        const val NAME_KEY = "NAME"

        private fun editTextIsNotEmpty(vararg editTexts: EditText): Boolean {
            for (et in editTexts) {
                if (et.text.toString().isEmpty()) {
                    return false
                }
            }
            return true
        }

        private fun removeErrorOnTextInputLayout(vararg textInputLayouts: TextInputLayout) {
            for (til in textInputLayouts) {
                til.error = null
            }
        }
    }
}