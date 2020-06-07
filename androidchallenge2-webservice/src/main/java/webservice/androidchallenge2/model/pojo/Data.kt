package webservice.androidchallenge2.model.pojo

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(
    @SerializedName("offset") val offset: Int = 0,
    @SerializedName("limit") val limit: Int = 0,
    @SerializedName("total") val total: Int = 0,
    @SerializedName("count") val count: Int = 0,
    @SerializedName("results") val results: MutableSet<Results> = mutableSetOf()
) : Parcelable