package class28.androidchallenge01kotlin.model

import android.os.Parcelable
import class28.androidchallenge01kotlin.R
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Plate(
    var name: String,
    var description: String,
    var plateImageRes: Int = R.drawable.restaurant_second
) : Parcelable