package class28.androidchallenge01.ui.restaurants;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import class28.androidchallenge01.R;
import class28.androidchallenge01.model.Restaurant;
import class28.androidchallenge01.ui.plates.ActRestaurantPlates;

import static class28.androidchallenge01.ui.restaurants.FragRestaurants.CHOSEN_RESTAURANT;

class AdapterRestaurantsList extends RecyclerView.Adapter<RestaurantsListViewHolder> {

    private List<Restaurant> restaurantList;

    AdapterRestaurantsList(ArrayList<Restaurant> restaurantList, OnRestaurantItemClickCallback listener) {
        this.restaurantList = restaurantList;
    }

    @NonNull
    @Override
    public RestaurantsListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RestaurantsListViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_restaurant_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantsListViewHolder holder, final int position) {
        final Restaurant restaurantItem = restaurantList.get(position);

        holder.restaurantImage.setImageResource(restaurantItem.getRestaurantImage());
        holder.restaurantName.setText(restaurantItem.getName());
        holder.restaurantAddress.setText(restaurantItem.getAddress());
        holder.restaurantClosesAt.setText(holder.itemView.getContext().getString(R.string.close_at_hhmm, restaurantItem.getCloseAt()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context activity = v.getContext();
//                Para usar interface, dessa forma seria a melhor
//                ((OnRestaurantItemClickCallback) activity).onRestaurantItemClickCallback(position);
                activity.startActivity(new Intent(activity, ActRestaurantPlates.class)
                        .putExtra(CHOSEN_RESTAURANT, restaurantItem));
            }
        });
    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }
}
