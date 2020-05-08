package class28.androidchallenge01kotlin.ui.restaurants

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import class28.androidchallenge01kotlin.R

class RestaurantsListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var restaurantImage: ImageView = itemView.findViewById(R.id.restaurant_image)
    var restaurantName: TextView = itemView.findViewById(R.id.restaurant_name)
    var restaurantAddress: TextView = itemView.findViewById(R.id.tvRestaurantAddress)
    var restaurantClosesAt: TextView = itemView.findViewById(R.id.tvRestaurantClosesAt)
}