package androidstudio

import android.content.Intent
import android.os.Bundle
import androidstudio.class18.java.ProductWithDiscountActivity
import androidstudio.class18.kotlin.ProductWithDiscountAct
import androidstudio.class20.java.RegisterActivity
import androidstudio.class20.kotlin.RegisterAct
import androidstudio.class21.java.TelephoneBookActivity
import androidstudio.class21.kotlin.TelephoneBookAct
import androidstudio.class23.java.Class23Activity
import androidx.appcompat.app.AppCompatActivity
import com.rafaelmfer.codeclasses.R
import kotlinx.android.synthetic.main.activity_manager.*

class ActivityManager : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manager)

        btJavaClass18.setOnClickListener {
            startActivity(Intent(this@ActivityManager, ProductWithDiscountActivity::class.java))
        }
        btKotlinClass18.setOnClickListener {
            startActivity(Intent(this@ActivityManager, ProductWithDiscountAct::class.java))
        }
        btJavaClass20.setOnClickListener {
            startActivity(Intent(this@ActivityManager, RegisterActivity::class.java))
        }
        btKotlinClass20.setOnClickListener {
            startActivity(Intent(this@ActivityManager, RegisterAct::class.java))
        }
        btJavaClass21.setOnClickListener {
            startActivity(Intent(this@ActivityManager, TelephoneBookActivity::class.java))
        }
        btKotlinClass21.setOnClickListener {
            startActivity(Intent(this@ActivityManager, TelephoneBookAct::class.java))
        }
        btJavaClass23.setOnClickListener {
            startActivity(Intent(this@ActivityManager, Class23Activity::class.java))
        }
    }
}