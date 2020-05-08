package class28.androidchallenge01kotlin.ui.plates

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import class28.androidchallenge01kotlin.R

class PlatesRestaurantsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val plateImage: ImageView = itemView.findViewById(R.id.plate_image)
    val plateName: TextView = itemView.findViewById(R.id.plate_name)
}