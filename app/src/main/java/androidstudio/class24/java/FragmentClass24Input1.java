package androidstudio.class24.java;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputLayout;
import com.rafaelmfer.codeclasses.R;

public class FragmentClass24Input1 extends Fragment {

    static final String NAME_KEY = "NAME";
    private TextInputLayout tilClass24UserName, tilClass24UserEmail, tilClass24UserPassword;
    private EditText etClass24UserName, etClass24UserEmail, etClass24UserPassword;
    private Button btFrag1SignIn;

    private InterfaceFragments activity;

    public FragmentClass24Input1() {
    }

    private static boolean editTextIsNotEmpty(EditText... editTexts) {
        for (EditText et : editTexts) {
            if (et.getText().toString().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private static void removeErrorOnTextInputLayout(TextInputLayout... textInputLayouts) {
        for (TextInputLayout til : textInputLayouts) {
            til.setError(null);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_class24_1, container, false);
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

        btFrag1SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                removeErrorOnTextInputLayout(tilClass24UserName, tilClass24UserEmail, tilClass24UserPassword);
                if (editTextIsNotEmpty(etClass24UserName, etClass24UserEmail, etClass24UserPassword)) {
                    Bundle bundle = new Bundle();
                    bundle.putString(NAME_KEY, etClass24UserName.getText().toString());
                    activity.startFragment(FragmentClass24Output2.newInstance(bundle));
                } else {
                    if (!editTextIsNotEmpty(etClass24UserName)) {
                        tilClass24UserName.setError(getString(R.string.error_field_must_be_filled));
                    }
                    if (!editTextIsNotEmpty(etClass24UserEmail)) {
                        tilClass24UserEmail.setError(getString(R.string.error_field_must_be_filled));
                    }
                    if (!editTextIsNotEmpty(etClass24UserPassword)) {
                        tilClass24UserPassword.setError(getString(R.string.error_field_must_be_filled));
                    }
                }
            }
        });
    }

    private void bindViews(View view) {
        tilClass24UserName = view.findViewById(R.id.tilClass24UserName);
        tilClass24UserEmail = view.findViewById(R.id.tilClass24UserEmail);
        tilClass24UserPassword = view.findViewById(R.id.tilClass24UserPassword);
        etClass24UserName = view.findViewById(R.id.etClass24UserName);
        etClass24UserEmail = view.findViewById(R.id.etClass24UserEmail);
        etClass24UserPassword = view.findViewById(R.id.etClass24UserPassword);
        btFrag1SignIn = view.findViewById(R.id.btFrag1SignIn);
    }
}
