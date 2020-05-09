package androidstudio.class24.java;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.rafaelmfer.codeclasses.R;

import static androidstudio.class24.java.FragmentClass24Input1.NAME_KEY;

public class FragmentClass24Output2 extends Fragment {

    TextView tvWelcomeName;
    Button btFrag2LetsGo;

    private InterfaceFragments activity;

    public FragmentClass24Output2() {
    }

    public static FragmentClass24Output2 newInstance(Bundle bundle) {
        FragmentClass24Output2 frag = new FragmentClass24Output2();
        frag.setArguments(bundle);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_class24_2, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = (InterfaceFragments) context;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bindViews(view);

        tvWelcomeName.setText(getString(R.string.welcome_name, getArguments().get(NAME_KEY)));
        btFrag2LetsGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), Class24Activity2.class));
            }
        });
    }

    private void bindViews(View view) {
        tvWelcomeName = view.findViewById(R.id.tvWelcomeName);
        btFrag2LetsGo = view.findViewById(R.id.btFrag2LetsGo);
    }
}

