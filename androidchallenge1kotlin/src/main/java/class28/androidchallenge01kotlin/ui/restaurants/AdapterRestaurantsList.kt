package class28.androidchallenge01kotlin.ui.restaurants

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import class28.androidchallenge01kotlin.R
import class28.androidchallenge01kotlin.model.Restaurant
import class28.androidchallenge01kotlin.ui.plates.ActRestaurantPlates
import class28.androidchallenge01kotlin.ui.restaurants.FragRestaurants.Companion.CHOSEN_RESTAURANT

class AdapterRestaurantsList(
    private val restaurantList: List<Restaurant>,
    listener: OnRestaurantItemClickCallback
) : RecyclerView.Adapter<RestaurantsListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = RestaurantsListViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_restaurant_list, parent, false)
    )

    override fun getItemCount(): Int = restaurantList.size

    override fun onBindViewHolder(holder: RestaurantsListViewHolder, position: Int) {
        restaurantList[position].run {

            holder.apply {
                restaurantImage.setImageResource(restaurantImageRes)
                restaurantName.text = name
                restaurantAddress.text = address
                restaurantClosesAt.text = itemView.context.getString(R.string.close_at_hhmm, closeAt)

                itemView.setOnClickListener { v ->
                    val activity = v.context
                    //Para usar interface, dessa forma seria a melhor
//                    ((OnRestaurantItemClickCallback) activity).onRestaurantItemClickCallback(position);
                    activity.startActivity(Intent(activity, ActRestaurantPlates::class.java).putExtra(CHOSEN_RESTAURANT, this@run))
                }
            }
        }
    }
}