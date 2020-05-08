package class28.androidchallenge01.ui.plates;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import class28.androidchallenge01.R;

class PlatesRestaurantsViewHolder extends RecyclerView.ViewHolder {

    ImageView plateImage;
    TextView plateName;

    public PlatesRestaurantsViewHolder(@NonNull View itemView) {
        super(itemView);
        plateImage = itemView.findViewById(R.id.plate_image);
        plateName = itemView.findViewById(R.id.plate_name);
    }
}
