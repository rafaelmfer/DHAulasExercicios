package webservice.androidchallenge2.model.pojo

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Price(
    @SerializedName("type") val type: String = "",
    @SerializedName("price") val price: Double = 0.0
) : Parcelable