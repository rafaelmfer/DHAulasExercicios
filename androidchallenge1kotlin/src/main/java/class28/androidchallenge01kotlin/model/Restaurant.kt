package class28.androidchallenge01kotlin.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Restaurant(
    var name: String,
    var address: String,
    var closeAt: String,
    var restaurantImageRes: Int,
    var plateList: List<Plate> = listOf()
) : Parcelable