package androidstudio.class24.java;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.rafaelmfer.codeclasses.R;

public class Class24Activity2 extends AppCompatActivity implements InterfaceFragments {

    private Button btFrag3Car1, btFrag3Car2;

    private FragmentManager fragManager = getSupportFragmentManager();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class24_2);
        bindViews();

        startFragment(new FragmentClass24Image3());

        btFrag3Car1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startFragment(new FragmentClass24Image3());
            }
        });

        btFrag3Car2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startFragment(new FragmentClass24Image4());
            }
        });
    }

    private void bindViews() {
        btFrag3Car1 = findViewById(R.id.btFrag3Car1);
        btFrag3Car2 = findViewById(R.id.btFrag3Car2);
    }

    @Override
    public void startFragment(Fragment fragment) {
        boolean fragBack = hasThisFragment(fragment.getClass().getName());

        if (!fragBack) fragManager
                .beginTransaction()
                .replace(R.id.ivFrag3Car1, fragment)
                .addToBackStack(fragment.getClass().getName())
                .commit();
    }

    private boolean hasThisFragment(String fragName) {
        return fragManager.popBackStackImmediate(fragName, 0);
    }
}
