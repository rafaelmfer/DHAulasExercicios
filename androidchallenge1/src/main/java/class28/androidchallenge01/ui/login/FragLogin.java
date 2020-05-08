package class28.androidchallenge01.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputLayout;

import class28.androidchallenge01.R;
import class28.androidchallenge01.ui.restaurants.ActRestaurantsList;
import class28.androidchallenge01.utils.ActivityContract;

import static class28.androidchallenge01.utils.Utils.editTextIsNotEmpty;
import static class28.androidchallenge01.utils.Utils.removeErrorOnTextInputLayout;

public class FragLogin extends Fragment {

    private ImageButton registerBackButton;
    private TextInputLayout tilLoginUserEmail, tilLoginUserPassword;
    private EditText etLoginUserEmail, etLoginUserPassword;
    private Button btLogin, btRegister;

    private ActivityContract activity;

    public FragLogin() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = (ActivityContract) context;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bindViews(view);
        registerBackButton.setVisibility(View.GONE);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                removeErrorOnTextInputLayout(tilLoginUserEmail, tilLoginUserPassword);
                if (editTextIsNotEmpty(etLoginUserEmail, etLoginUserPassword)) {
                    startActivity(new Intent(view.getContext(), ActRestaurantsList.class));
                } else {
                    if (!editTextIsNotEmpty(etLoginUserEmail)) {
                        tilLoginUserEmail.setError(getString(R.string.error_field_must_be_filled));
                    }
                    if (!editTextIsNotEmpty(etLoginUserPassword)) {
                        tilLoginUserPassword.setError(getString(R.string.error_field_must_be_filled));
                    }
                }
            }
        });

        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.startFragment(new FragRegister());
            }
        });
    }

    private void bindViews(View view) {
        registerBackButton = getActivity().findViewById(R.id.toolbar_back_button);
        tilLoginUserEmail = view.findViewById(R.id.tilLoginUserEmail);
        tilLoginUserPassword = view.findViewById(R.id.tilLoginUserPassword);
        etLoginUserEmail = view.findViewById(R.id.etLoginUserEmail);
        etLoginUserPassword = view.findViewById(R.id.etLoginUserPassword);
        btLogin = view.findViewById(R.id.btLogin);
        btRegister = view.findViewById(R.id.btRegister);
    }
}
