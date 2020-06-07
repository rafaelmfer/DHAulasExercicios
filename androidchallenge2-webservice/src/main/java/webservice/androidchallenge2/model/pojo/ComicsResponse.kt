package webservice.androidchallenge2.model.pojo

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ComicsResponse(
    @SerializedName("code") val code: Int = 0,
    @SerializedName("status") val status: String = "",
    @SerializedName("data") val `data`: Data = Data()
) : Parcelable