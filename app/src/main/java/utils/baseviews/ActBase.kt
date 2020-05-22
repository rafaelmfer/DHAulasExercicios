package utils.baseviews

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import utils.debugging.ExceptionHandler

open class ActBase(val layout: Any? = null) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.setDefaultUncaughtExceptionHandler(exceptionHandler)
        when (layout) {
            is Int -> setContentView(layout)
            is View -> setContentView(layout)
        }
        intent?.extras?.onExtras()
        onView()
    }

    override fun onResume() {
        super.onResume()
        currentActivity = this
    }

    open fun Bundle.onExtras() {}

    open fun onView() {}

    companion object {
        @JvmStatic lateinit var currentActivity: AppCompatActivity
        @JvmStatic var exceptionHandler = ExceptionHandler()
    }
}