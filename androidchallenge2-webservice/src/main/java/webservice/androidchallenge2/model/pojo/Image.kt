package webservice.androidchallenge2.model.pojo

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Image(
    @SerializedName("path") val path: String = "",
    @SerializedName("extension") val extension: String = ""
) : Parcelable