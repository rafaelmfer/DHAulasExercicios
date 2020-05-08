package class28.androidchallenge01.model;

import android.os.Parcel;
import android.os.Parcelable;

import class28.androidchallenge01.R;

public class Plate implements Parcelable {
    public static final Creator<Plate> CREATOR = new Creator<Plate>() {
        @Override
        public Plate createFromParcel(Parcel in) {
            return new Plate(in);
        }

        @Override
        public Plate[] newArray(int size) {
            return new Plate[size];
        }
    };
    private String name;
    private String description;
    private Integer plateImage = R.drawable.restaurant_second;

    public Plate(String name, String description) {
        this.name = name;
        this.description = description;
    }

    protected Plate(Parcel in) {
        name = in.readString();
        description = in.readString();
        if (in.readByte() == 0) {
            plateImage = null;
        } else {
            plateImage = in.readInt();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPlateImage() {
        return plateImage;
    }

    public void setPlateImage(Integer plateImage) {
        this.plateImage = plateImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(description);
        if (plateImage == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(plateImage);
        }
    }
}
