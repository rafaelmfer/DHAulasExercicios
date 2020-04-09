package androidstudio.class21.kotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rafaelmfer.codeclasses.R
import kotlinx.android.synthetic.main.activity_telephone_book.*

class TelephoneBookAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telephone_book)

        fabTelephoneBookUser.setOnClickListener { view: View ->
            tilTelephoneBookName.error = null
            tilTelephoneBookPhone.error = null
            if (editTextIsNotEmpty(etTelephoneBookName, etTelephoneBookPhone)) {
                Toast.makeText(view.context, getString(R.string.user_successfully_registered), Toast.LENGTH_LONG).show()
                startActivity(
                    Intent(view.context, TelephoneContactAct::class.java).apply {
                        putExtra("Name", etTelephoneBookName.text.toString())
                        putExtra("Telephone", etTelephoneBookPhone.text.toString())
                    }
                )
            } else {
                if (!editTextIsNotEmpty(etTelephoneBookName)) {
                    tilTelephoneBookName.error = getString(R.string.error_field_must_be_filled)
                }
                if (!editTextIsNotEmpty(etTelephoneBookPhone)) {
                    tilTelephoneBookPhone.error = getString(R.string.error_field_must_be_filled)
                }
            }
        }
    }

    private fun editTextIsNotEmpty(vararg editTexts: EditText): Boolean {
        for (et in editTexts) {
            if (et.text.toString().isEmpty()) {
                return false
            }
        }
        return true
    }
}