package androidstudio

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rafaelmfer.codeclasses.R

class ActivityManager: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manager)
    }
}