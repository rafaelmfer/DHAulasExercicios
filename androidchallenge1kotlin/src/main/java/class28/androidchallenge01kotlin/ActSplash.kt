package class28.androidchallenge01kotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import class28.androidchallenge01kotlin.ui.login.ActLoginRegister

class ActSplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, ActLoginRegister::class.java))
        finish()
    }
}