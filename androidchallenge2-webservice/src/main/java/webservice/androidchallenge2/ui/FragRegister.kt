package webservice.androidchallenge2.ui

import android.content.Intent
import com.my_utils.baseviews.FragBind
import com.my_utils.extensions.editTextIsNotEmpty
import com.my_utils.extensions.removeErrorOnTextInputLayout
import webservice.androidchallenge2.R
import webservice.androidchallenge2.databinding.FragRegisterBinding

class FragRegister : FragBind<FragRegisterBinding>() {

    override val bindClass by lazy { FragRegisterBinding::class.java }

    override fun FragRegisterBinding.onBoundView() {
        saveRegister.setOnClickListener{
            removeErrorOnTextInputLayout(inputLabelRegisterName, inputLabelRegisterEmail, inputLabelRegisterPassword)
            if (editTextIsNotEmpty(inputRegisterName, inputRegisterEmail, inputRegisterPassword)) {
                startActivity(Intent(it.context, ActHome::class.java))
            } else {
                if (!editTextIsNotEmpty(inputRegisterName)) {
                    inputLabelRegisterName.error = getString(R.string.error_field_must_be_filled)
                }
                if (!editTextIsNotEmpty(inputRegisterEmail)) {
                    inputLabelRegisterEmail.error = getString(R.string.error_field_must_be_filled)
                }
                if (!editTextIsNotEmpty(inputRegisterPassword)) {
                    inputLabelRegisterPassword.error = getString(R.string.error_field_must_be_filled)
                }
            }
        }
    }

}
