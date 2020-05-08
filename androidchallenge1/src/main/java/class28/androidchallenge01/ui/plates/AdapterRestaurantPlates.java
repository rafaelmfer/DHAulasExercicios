package class28.androidchallenge01.ui.plates;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import class28.androidchallenge01.R;
import class28.androidchallenge01.model.Plate;
import class28.androidchallenge01.ui.platesdetails.ActPlateDetails;

import static class28.androidchallenge01.ui.plates.ActRestaurantPlates.CHOSEN_PLATE;

class AdapterRestaurantPlates extends RecyclerView.Adapter<PlatesRestaurantsViewHolder> {

    private List<Plate> plates;

    AdapterRestaurantPlates(List<Plate> plates) {
        this.plates = plates;
    }

    @NonNull
    @Override
    public PlatesRestaurantsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PlatesRestaurantsViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_restaurant_plates, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PlatesRestaurantsViewHolder holder, int position) {
        final Plate plate = plates.get(position);

        holder.plateImage.setImageResource(plate.getPlateImage());
        holder.plateName.setText(plate.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context activity = v.getContext();
                activity.startActivity(new Intent(activity, ActPlateDetails.class).putExtra(CHOSEN_PLATE, plate));
            }
        });
    }

    @Override
    public int getItemCount() {
        return plates.size();
    }
}
