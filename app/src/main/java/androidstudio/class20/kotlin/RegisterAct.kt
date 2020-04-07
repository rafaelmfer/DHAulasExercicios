package androidstudio.class20.kotlin

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.rafaelmfer.codeclasses.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btBackRegister.setOnClickListener { onBackPressed() }

        fabRegisterUser.setOnClickListener { view->
            tilRegisterName.error = null
            tilRegisterEmail.error = null
            if (editTextIsNotEmpty(etRegisterName, etRegisterEmail)) {
                Snackbar.make(view, getString(R.string.user_successfully_registered), Snackbar.LENGTH_LONG).show()
            } else {
                if (!editTextIsNotEmpty(etRegisterName)) {
                    tilRegisterName.error = getString(R.string.error_field_must_be_filled)
                }
                if (!editTextIsNotEmpty(etRegisterEmail)) {
                    tilRegisterEmail.error = getString(R.string.error_field_must_be_filled)
                }
            }
        }
    }

    private fun editTextIsNotEmpty(vararg editText: EditText): Boolean {
        editText.forEach { et ->
            if (et.text.isEmpty()) return false
        }
        return true
    }
}
