package class28.androidchallenge01.ui.login;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import class28.androidchallenge01.R;
import class28.androidchallenge01.utils.ActivityContract;
import class28.androidchallenge01.utils.Utils;

public class ActLoginRegister extends AppCompatActivity implements ActivityContract {

    public static String COME_FROM_RESTAURANT = "COME_FROM_RESTAURANT";
    private FragmentManager fragManager = getSupportFragmentManager();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);
    }

    @Override
    protected void onResume() {
        super.onResume();
        boolean comeFromRestaurant;
        comeFromRestaurant = getIntent().getBooleanExtra(COME_FROM_RESTAURANT, false);
        if (comeFromRestaurant) {
            Utils.startFragment(fragManager, new FragRegister(), R.id.frame_login_register_container);
        } else {
            Utils.startFragment(fragManager, new FragLogin(), R.id.frame_login_register_container);
        }
    }

    @Override
    public void startFragment(Fragment fragment) {
        Utils.startFragment(fragManager, fragment, R.id.frame_login_register_container);
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
        if (selectedFragment instanceof FragLogin) {
            finish();
        } else {
            startFragment(new FragLogin());
        }
    }
}
