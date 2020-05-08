package class28.androidchallenge01kotlin.ui.restaurants

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import class28.androidchallenge01kotlin.R
import class28.androidchallenge01kotlin.ui.login.FragRegister
import class28.androidchallenge01kotlin.utils.ActivityContract
import class28.androidchallenge01kotlin.utils.startFragment
import kotlinx.android.synthetic.main.activity_restaurant.*

class ActRestaurantsList : AppCompatActivity(), ActivityContract, PopupMenu.OnMenuItemClickListener {

    private val fragManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)

        restaurant_options_menu.setOnClickListener { v ->
            PopupMenu(v.context, v).apply {
                setOnMenuItemClickListener(v.context as PopupMenu.OnMenuItemClickListener)
                inflate(R.menu.restaurant_menu_options)
                show()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        startFragment(FragRestaurants())
    }

    override fun onMenuItemClick(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_profile) {
            restaurant_options_menu.visibility = View.GONE
            startFragment(FragRegister())
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun startFragment(fragment: Fragment) {
        startFragment(fragManager, fragment, R.id.frame_layout_container)
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
        if (selectedFragment is FragRestaurants) {
            finish()
        } else {
            startFragment(FragRestaurants())
        }
    }
}