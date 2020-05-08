package class28.androidchallenge01kotlin.ui.plates

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import class28.androidchallenge01kotlin.R
import class28.androidchallenge01kotlin.model.Plate
import class28.androidchallenge01kotlin.ui.plates.ActRestaurantPlates.Companion.CHOSEN_PLATE
import class28.androidchallenge01kotlin.ui.platesdetails.ActPlateDetails

class AdapterRestaurantPlates(private val plates: List<Plate>) : RecyclerView.Adapter<PlatesRestaurantsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PlatesRestaurantsViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_restaurant_plates, parent, false)
    )

    override fun getItemCount(): Int = plates.size

    override fun onBindViewHolder(holder: PlatesRestaurantsViewHolder, position: Int) {
        plates[position].run {
            holder.apply {

                plateImage.setImageResource(plateImageRes)
                plateName.text = name

                itemView.setOnClickListener { v ->
                    val activity = v.context
                    activity.startActivity(Intent(activity, ActPlateDetails::class.java).putExtra(CHOSEN_PLATE, this@run))
                }
            }
        }
    }
}