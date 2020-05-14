package androidstudio.class26.kotlin

import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView
import com.rafaelmfer.codeclasses.R

class ActNavDrawerSimples : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    private var manager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav_drawer_simple)
        drawerLayout = findViewById(R.id.drawer_layout)
        findViewById<NavigationView>(R.id.nav_view).setNavigationItemSelectedListener(this)
        findViewById<ImageButton>(R.id.menu_hamburger).setOnClickListener { drawerLayout.openDrawer(GravityCompat.START) }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_camera -> loadFragment(FragCamera())
            R.id.menu_gallery -> loadFragment(FragGallery())
            R.id.menu_slideshow -> loadFragment(FragSlideshow())
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return false
    }

    private fun loadFragment(fragment: Fragment) {
        manager.beginTransaction()
            .replace(R.id.class26_frame_layout_nav_drawer, fragment)
            .commit()
    }
}