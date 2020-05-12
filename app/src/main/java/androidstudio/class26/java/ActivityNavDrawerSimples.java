package androidstudio.class26.java;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;
import com.rafaelmfer.codeclasses.R;

public class ActivityNavDrawerSimples extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private FragmentManager manager = getSupportFragmentManager();
    private ImageButton menuHamburger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_drawer_simple);
        bindViews();

        navigationView.setNavigationItemSelectedListener(this);
        menuHamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    private void bindViews() {
        menuHamburger = findViewById(R.id.menu_hamburger);
        navigationView = findViewById(R.id.nav_view);
        drawerLayout = findViewById(R.id.drawer_layout);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_camera:
                loadFragment(new FragCamera());
                break;
            case R.id.menu_gallery:
                loadFragment(new FragGallery());
                break;
            case R.id.menu_slideshow:
                loadFragment(new FragSlideshow());
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return false;
    }

    public void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.class26_frame_layout_nav_drawer, fragment);
        transaction.commit();
    }
}
