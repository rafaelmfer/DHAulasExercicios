package androidstudio.class20.java;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;
import com.rafaelmfer.codeclasses.R;

public class RegisterActivity extends AppCompatActivity {

    TextInputLayout tilRegisterName, tilRegisterEmail;
    EditText etRegisterName, etRegisterEmail;
    FloatingActionButton fabRegister;
    Button btBack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        tilRegisterName = findViewById(R.id.tilRegisterName);
        tilRegisterEmail = findViewById(R.id.tilRegisterEmail);
        etRegisterName = findViewById(R.id.etRegisterName);
        etRegisterEmail = findViewById(R.id.etRegisterEmail);
        fabRegister = findViewById(R.id.fabRegisterUser);
        btBack = findViewById(R.id.btBackRegister);

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        fabRegister.setOnClickListener(view -> {
            tilRegisterName.setError(null);
            tilRegisterEmail.setError(null);
            if (editTextIsNotEmpty(etRegisterName, etRegisterEmail)) {
                Snackbar.make(view, getString(R.string.user_successfully_registered), Snackbar.LENGTH_LONG).show();
            } else {
                if (!editTextIsNotEmpty(etRegisterName)) {
                    tilRegisterName.setError(getString(R.string.error_field_must_be_filled));
                }
                if (!editTextIsNotEmpty(etRegisterEmail)) {
                    tilRegisterEmail.setError(getString(R.string.error_field_must_be_filled));
                }
            }
        });
    }

    private boolean editTextIsNotEmpty(EditText... editTexts) {
        for (EditText et : editTexts) {
            if (et.getText().toString().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
