package class28.androidchallenge01.ui.restaurants;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import class28.androidchallenge01.R;

class RestaurantsListViewHolder extends RecyclerView.ViewHolder {

    ImageView restaurantImage;
    TextView restaurantName, restaurantAddress, restaurantClosesAt;

    RestaurantsListViewHolder(@NonNull View itemView) {
        super(itemView);

        restaurantImage = itemView.findViewById(R.id.restaurant_image);
        restaurantName = itemView.findViewById(R.id.restaurant_name);
        restaurantAddress = itemView.findViewById(R.id.tvRestaurantAddress);
        restaurantClosesAt = itemView.findViewById(R.id.tvRestaurantClosesAt);
    }
}
