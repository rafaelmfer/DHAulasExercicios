package utils

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager
import android.widget.Toast

fun Activity.hideKeyBoard() =
    (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager?)?.run {
        if (currentFocus != null && isAcceptingText) {
            hideSoftInputFromWindow(currentFocus?.windowToken, 0)
        }
    }

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}
