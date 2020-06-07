package webservice.androidchallenge2.ui

import android.content.Context
import android.content.Intent
import com.my_utils.baseviews.ActivityContract
import com.my_utils.baseviews.FragBind
import com.my_utils.extensions.editTextIsNotEmpty
import com.my_utils.extensions.removeErrorOnTextInputLayout
import com.my_utils.extensions.replaceFragment
import webservice.androidchallenge2.R
import webservice.androidchallenge2.databinding.FragLoginBinding

class FragLogin : FragBind<FragLoginBinding>() {

    override val bindClass by lazy { FragLoginBinding::class.java }

    private var activity: ActivityContract? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity = context as ActivityContract
    }

    override fun FragLoginBinding.onBoundView() {
        signUp.setOnClickListener {
                removeErrorOnTextInputLayout(inputLabelEmail, inputLabelPassword)
                if (editTextIsNotEmpty(inputEmail, inputPassword)) {
                    startActivity(Intent(it.context, ActHome::class.java))
                } else {
                    if (!editTextIsNotEmpty(inputEmail)) {
                        inputLabelEmail.error = getString(R.string.error_field_must_be_filled)
                    }
                    if (!editTextIsNotEmpty(inputPassword)) {
                        inputLabelPassword.error = getString(R.string.error_field_must_be_filled)
                    }
                }
        }
        createAccount.setOnClickListener { activity?.replaceFragment(new<FragRegister>(bundle = null), stackAdd = true) }

    }
}
