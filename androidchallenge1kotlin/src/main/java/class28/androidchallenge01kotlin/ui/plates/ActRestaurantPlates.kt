package class28.androidchallenge01kotlin.ui.plates

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import class28.androidchallenge01kotlin.R
import class28.androidchallenge01kotlin.model.Restaurant
import class28.androidchallenge01kotlin.ui.restaurants.FragRestaurants.Companion.CHOSEN_RESTAURANT
import kotlinx.android.synthetic.main.activity_restaurant_details.*

class ActRestaurantPlates : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_details)
        findViewById<ImageButton>(R.id.restaurant_details_back_button).setOnClickListener { onBackPressed() }

        val restaurant = intent.getParcelableExtra(CHOSEN_RESTAURANT) as Restaurant

        findViewById<ImageView>(R.id.restaurant_details_image).setImageResource(restaurant.restaurantImageRes)
        findViewById<TextView>(R.id.restaurant_details_name_title).text = restaurant.name

        rvRestaurantPlates.layoutManager = GridLayoutManager(this, 2)
        rvRestaurantPlates.adapter = AdapterRestaurantPlates(restaurant.plateList)
    }

    companion object {
        const val CHOSEN_PLATE = "CHOSEN_PLATE"
    }
}