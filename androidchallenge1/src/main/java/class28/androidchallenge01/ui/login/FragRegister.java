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

public class FragRegister extends Fragment {

    private ImageButton registerBackButton;
    private TextInputLayout tilRegisterUserName, tilRegisterUserEmail, tilRegisterUserPassword, tilRegisterUserRepeatPassword;
    private EditText etRegisterUserName, etRegisterUserEmail, etRegisterUserPassword, etRegisterUserRepeatPassword;
    private Button btCreateAccount;

    private ActivityContract activity;

    public FragRegister() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_register, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = (ActivityContract) context;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bindViews(view);
        registerBackButton.setVisibility(View.VISIBLE);
        registerBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });

        btCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                removeErrorOnTextInputLayout(tilRegisterUserName, tilRegisterUserEmail, tilRegisterUserPassword, tilRegisterUserRepeatPassword);
                if (editTextIsNotEmpty(etRegisterUserName, etRegisterUserEmail, etRegisterUserPassword, etRegisterUserRepeatPassword)) {
                    startActivity(new Intent(view.getContext(), ActRestaurantsList.class));
                } else {
                    if (!editTextIsNotEmpty(etRegisterUserName)) {
                        tilRegisterUserName.setError(getString(R.string.error_field_must_be_filled));
                    }
                    if (!editTextIsNotEmpty(etRegisterUserEmail)) {
                        tilRegisterUserEmail.setError(getString(R.string.error_field_must_be_filled));
                    }
                    if (!editTextIsNotEmpty(etRegisterUserPassword)) {
                        tilRegisterUserPassword.setError(getString(R.string.error_field_must_be_filled));
                    }
                    if (!editTextIsNotEmpty(etRegisterUserRepeatPassword)) {
                        tilRegisterUserRepeatPassword.setError(getString(R.string.error_field_must_be_filled));
                    }
                }
            }
        });
    }

    private void bindViews(View view) {
        registerBackButton = getActivity().findViewById(R.id.toolbar_back_button);
        tilRegisterUserName = view.findViewById(R.id.tilRegisterUserName);
        tilRegisterUserEmail = view.findViewById(R.id.tilRegisterUserEmail);
        tilRegisterUserPassword = view.findViewById(R.id.tilRegisterUserPassword);
        tilRegisterUserRepeatPassword = view.findViewById(R.id.tilRegisterUserRepeatPassword);
        etRegisterUserName = view.findViewById(R.id.etRegisterUserName);
        etRegisterUserEmail = view.findViewById(R.id.etRegisterUserEmail);
        etRegisterUserPassword = view.findViewById(R.id.etRegisterUserPassword);
        etRegisterUserRepeatPassword = view.findViewById(R.id.etRegisterUserRepeatPassword);
        btCreateAccount = view.findViewById(R.id.btCreateAccount);
    }
}
