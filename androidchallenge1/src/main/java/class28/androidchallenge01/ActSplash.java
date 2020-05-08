package class28.androidchallenge01;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import class28.androidchallenge01.ui.login.ActLoginRegister;

public class ActSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, ActLoginRegister.class));
        finish();
    }
}
