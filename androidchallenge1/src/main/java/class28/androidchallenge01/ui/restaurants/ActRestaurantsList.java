package class28.androidchallenge01.ui.restaurants;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import class28.androidchallenge01.R;
import class28.androidchallenge01.ui.login.FragRegister;
import class28.androidchallenge01.utils.ActivityContract;
import class28.androidchallenge01.utils.Utils;

public class ActRestaurantsList extends AppCompatActivity implements ActivityContract, PopupMenu.OnMenuItemClickListener {

    private ImageButton restaurantOptionsMenu;
    private FragmentManager fragManager = getSupportFragmentManager();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        restaurantOptionsMenu = findViewById(R.id.restaurant_options_menu);

        restaurantOptionsMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(v.getContext(), v);
                popup.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener) v.getContext());
                popup.inflate(R.menu.navi);
                popup.show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        startFragment(new FragRestaurants());
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        if (item.getItemId() == R.id.menu_profile) {
            startFragment(new FragRegister());
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void startFragment(Fragment fragment) {
        Utils.startFragment(fragManager, fragment, R.id.frame_layout_container);
    }

    @Override
    public void onBackPressed() {
        Fragment selectedFragment = null;
        for (Fragment fragment : fragManager.getFragments()) {
            if (fragment.isVisible()) {
                selectedFragment = fragment;
                break;
            }
            return;
        }
        if (selectedFragment instanceof FragRestaurants) {
            finish();
        } else {
            startFragment(new FragRestaurants());
        }
    }
}

