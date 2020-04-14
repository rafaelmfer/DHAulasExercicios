package androidstudio.class23.java;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.rafaelmfer.codeclasses.R;

import org.jetbrains.annotations.NotNull;

public class Class23Activity extends AppCompatActivity {

    Button btFragmentOne, btFragmentTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class23);

        btFragmentOne = findViewById(R.id.btFragmentOne);
        btFragmentTwo = findViewById(R.id.btFragmentTwo);

        //Chamada Simples apenas com uma extração de método
        btFragmentOne.setOnClickListener(loadFragment(new Class23FragmentOne()));

        //Chamada Mais complexa com mais de uma extração de método
        loadFragmentOn(btFragmentTwo, new Class23FragmentTwo());

    }

    private void loadFragmentOn(Button bt, Fragment frag) {
        bt.setOnClickListener(loadFragment(frag));
    }

    @NotNull
    private View.OnClickListener loadFragment(Fragment fragment) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentSetup(fragment);
            }
        };
    }

    private void fragmentSetup(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }

}
