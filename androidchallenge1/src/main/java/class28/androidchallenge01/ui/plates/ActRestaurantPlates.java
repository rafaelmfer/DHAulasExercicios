package class28.androidchallenge01.ui.plates;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import class28.androidchallenge01.R;
import class28.androidchallenge01.model.Restaurant;

import static class28.androidchallenge01.ui.restaurants.FragRestaurants.CHOSEN_RESTAURANT;


public class ActRestaurantPlates extends AppCompatActivity {

    public static final String CHOSEN_PLATE = "CHOSEN_PLATE";
    ImageButton restaurantDetailsBackButton;
    ImageView restaurantDetailsImage;
    TextView restaurantName;
    RecyclerView rvRestaurantPlates;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_details);
        bindViews();
        restaurantDetailsBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Restaurant restaurant = getIntent().getParcelableExtra(CHOSEN_RESTAURANT);

        restaurantDetailsImage.setImageResource(restaurant.getRestaurantImage());
        restaurantName.setText(restaurant.getName());
        rvRestaurantPlates.setLayoutManager(new GridLayoutManager(this, 2));
        rvRestaurantPlates.setAdapter(new AdapterRestaurantPlates(restaurant.getPlateList()));
    }

    private void bindViews() {
        restaurantDetailsBackButton = findViewById(R.id.restaurant_details_back_button);
        restaurantDetailsImage = findViewById(R.id.restaurant_details_image);
        restaurantName = findViewById(R.id.restaurant_details_name_title);
        rvRestaurantPlates = findViewById(R.id.rvRestaurantPlates);
    }
}
