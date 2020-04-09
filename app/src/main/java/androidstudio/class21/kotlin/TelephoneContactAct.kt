package androidstudio.class21.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rafaelmfer.codeclasses.R
import kotlinx.android.synthetic.main.activity_telephone_contact.*

class TelephoneContactAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telephone_contact)

        intent.extras.let {
            tvTelephoneName.text = intent.extras?.getString("Name")
            tvTelephonePhone.text = intent.extras?.getString("Telephone")
        }

        btBackToTelephoneBook.setOnClickListener { onBackPressed() }
    }
}