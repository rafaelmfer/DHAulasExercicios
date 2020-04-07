package androidstudio

import android.content.Intent
import android.os.Bundle
import androidstudio.class18.java.ProductWithDiscountActivity
import androidstudio.class18.kotlin.ProductWithDiscountAct
import androidstudio.class20.java.RegisterActivity
import androidstudio.class20.kotlin.RegisterAct
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
    }
}