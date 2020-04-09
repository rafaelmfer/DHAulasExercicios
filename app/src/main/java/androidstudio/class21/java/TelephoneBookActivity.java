package androidstudio.class21.java;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;
import com.rafaelmfer.codeclasses.R;

public class TelephoneBookActivity extends AppCompatActivity {

    TextInputLayout tilTelephoneBookName, tilTelephoneBookPhone;
    EditText etTelephoneBookName, etTelephoneBookPhone;
    FloatingActionButton fabTelephone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telephone_book);

        tilTelephoneBookName = findViewById(R.id.tilTelephoneBookName);
        tilTelephoneBookPhone = findViewById(R.id.tilTelephoneBookPhone);
        etTelephoneBookName = findViewById(R.id.etTelephoneBookName);
        etTelephoneBookPhone = findViewById(R.id.etTelephoneBookPhone);
        fabTelephone = findViewById(R.id.fabTelephoneBookUser);

        fabTelephone.setOnClickListener(view -> {
            tilTelephoneBookName.setError(null);
            tilTelephoneBookPhone.setError(null);
            if (editTextIsNotEmpty(etTelephoneBookName, etTelephoneBookPhone)) {
                Toast.makeText(view.getContext(), getString(R.string.user_successfully_registered), Toast.LENGTH_LONG).show();
                startActivity(
                        new Intent(view.getContext(), TelephoneContactActivity.class)
                                .putExtra("Name", etTelephoneBookName.getText().toString())
                                .putExtra("Telephone", etTelephoneBookPhone.getText().toString())
                );
            } else {
                if (!editTextIsNotEmpty(etTelephoneBookName)) {
                    tilTelephoneBookName.setError(getString(R.string.error_field_must_be_filled));
                }
                if (!editTextIsNotEmpty(etTelephoneBookPhone)) {
                    tilTelephoneBookPhone.setError(getString(R.string.error_field_must_be_filled));
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
