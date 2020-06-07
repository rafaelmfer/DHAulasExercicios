package webservice.androidchallenge2.model.pojo

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "comic")
@Parcelize
data class ResultsRoom(
    @PrimaryKey(autoGenerate = false)
    @SerializedName("id") val id: Int = 0,

    @ColumnInfo(name = "title")
    @SerializedName("title") val title: String = "",

    @ColumnInfo(name = "variantDescription")
    @SerializedName("variantDescription") val variantDescription: String = "",

    @ColumnInfo(name = "description")
    @SerializedName("description") val description: String = "",

    @ColumnInfo(name = "pageCount")
    @SerializedName("pageCount") val pageCount: Int = 0

//    @ColumnInfo(name = "dates")
//    @SerializedName("dates") val dates: List<Date> = listOf(),

//    @ColumnInfo(name = "prices")
//    @SerializedName("prices") val prices: List<Price> = listOf(),

//    @ColumnInfo(name = "thumbnail")
//    @SerializedName("thumbnail") val thumbnail: Thumbnail = Thumbnail(),
//
//    @ColumnInfo(name = "images")
//    @SerializedName("images") val images: List<Image> = listOf()
) : Parcelable