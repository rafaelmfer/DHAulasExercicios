package class28.androidchallenge01kotlin.ui.platesdetails

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import class28.androidchallenge01kotlin.R
import class28.androidchallenge01kotlin.model.Plate
import class28.androidchallenge01kotlin.ui.plates.ActRestaurantPlates.Companion.CHOSEN_PLATE
import kotlinx.android.synthetic.main.activity_plate_details.*

class ActPlateDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plate_details)

        plate_details_back.setOnClickListener { onBackPressed() }

        val plate = intent.getParcelableExtra(CHOSEN_PLATE) as Plate

        plate_details_image.setImageResource(plate.plateImageRes)
        plate_details_name.text = plate.name
        plate_description.text = plate.description
    }
}