package androidstudio.class21.java;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.rafaelmfer.codeclasses.R;

public class TelephoneContactActivity extends AppCompatActivity {

    TextView tvTelephoneName, tvTelephonePhone;
    Button btBack;
    String telephoneName, telephonePhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telephone_contact);

        if (getIntent().getExtras() != null) {
            telephoneName = getIntent().getExtras().getString("Name");
            telephonePhone = getIntent().getExtras().getString("Telephone");
        }

        tvTelephoneName = findViewById(R.id.tvTelephoneName);
        tvTelephonePhone = findViewById(R.id.tvTelephonePhone);
        btBack = findViewById(R.id.btBackToTelephoneBook);

        tvTelephoneName.setText(telephoneName);
        tvTelephonePhone.setText(telephonePhone);
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
