package class28.androidchallenge01kotlin.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import class28.androidchallenge01kotlin.R
import class28.androidchallenge01kotlin.utils.ActivityContract
import class28.androidchallenge01kotlin.utils.startFragment

class ActLoginRegister : AppCompatActivity(), ActivityContract {

    private val fragManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_register)
    }

    override fun onResume() {
        super.onResume()
        val comeFromRestaurant: Boolean = intent.getBooleanExtra(COME_FROM_RESTAURANT, false)
        if (comeFromRestaurant) {
            startFragment(fragManager, FragRegister(), R.id.frame_login_register_container)
        } else {
            startFragment(fragManager, FragLogin(), R.id.frame_login_register_container)
        }
    }

    override fun startFragment(fragment: Fragment) {
        startFragment(fragManager, fragment, R.id.frame_login_register_container)
    }

    override fun onBackPressed() {
        var selectedFragment: Fragment? = null
        for (fragment in fragManager.fragments) {
            if (fragment.isVisible) {
                selectedFragment = fragment
                break
            }
            return
        }
        if (selectedFragment is FragLogin) {
            finish()
        } else {
            startFragment(FragLogin())
        }
    }

    companion object {
        var COME_FROM_RESTAURANT = "COME_FROM_RESTAURANT"
    }
}