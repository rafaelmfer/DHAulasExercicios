package androidstudio.class24.java;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.rafaelmfer.codeclasses.R;

public class Class24Activity extends AppCompatActivity implements InterfaceFragments {

    private FragmentManager fragManager = getSupportFragmentManager();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_frame);
        startFragment(new FragmentClass24Input1());

    }

    @Override
    public void startFragment(final Fragment fragment) {
        boolean fragBack = hasThisFragment(fragment.getClass().getName());

        if (!fragBack) fragManager
                .beginTransaction()
                .replace(R.id.act_frame_container, fragment)
                .addToBackStack(fragment.getClass().getName())
                .commit();
    }

    private boolean hasThisFragment(String fragName) {
        return fragManager.popBackStackImmediate(fragName, 0);
    }
}
