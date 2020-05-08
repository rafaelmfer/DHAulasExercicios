package class28.androidchallenge01.ui.platesdetails;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import class28.androidchallenge01.R;
import class28.androidchallenge01.model.Plate;

import static class28.androidchallenge01.ui.plates.ActRestaurantPlates.CHOSEN_PLATE;

public class ActPlateDetails extends AppCompatActivity {

    ImageButton plateDetailsBackButton;
    ImageView plateDetailsImage;
    TextView plateDetailsName, plateDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plate_details);
        plateDetailsBackButton = findViewById(R.id.plate_details_back);
        plateDetailsImage = findViewById(R.id.plate_details_image);
        plateDetailsName = findViewById(R.id.plate_details_name);
        plateDescription = findViewById(R.id.plate_description);

        plateDetailsBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Plate plate = getIntent().getParcelableExtra(CHOSEN_PLATE);
        plateDetailsImage.setImageResource(plate.getPlateImage());
        plateDetailsName.setText(plate.getName());
        plateDescription.setText(plate.getDescription());
    }
}
