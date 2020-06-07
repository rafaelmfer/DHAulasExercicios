package webservice.androidchallenge2.model.pojo

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Results(
    @SerializedName("id") val id: Int = 0,
    @SerializedName("title") val title: String = "",
    @SerializedName("variantDescription") val variantDescription: String = "",
    @SerializedName("description") val description: String? = "",
    @SerializedName("pageCount") val pageCount: Int = 0,
    @SerializedName("dates") val dates: List<Date> = listOf(),
    @SerializedName("prices") val prices: List<Price> = listOf(),
    @SerializedName("thumbnail") val thumbnail: Thumbnail = Thumbnail(),
    @SerializedName("images") val images: List<Image> = listOf()
) : Parcelable