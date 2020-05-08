package class28.androidchallenge01.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Restaurant implements Parcelable {
    public static final Creator<Restaurant> CREATOR = new Creator<Restaurant>() {
        @Override
        public Restaurant createFromParcel(Parcel in) {
            return new Restaurant(in);
        }

        @Override
        public Restaurant[] newArray(int size) {
            return new Restaurant[size];
        }
    };
    private String name;
    private String address;
    private String closeAt;
    private Integer restaurantImage;
    private ArrayList<Plate> plateList;

    public Restaurant(String name, String address, String closeAt, Integer restaurantImage, ArrayList<Plate> plateList) {
        this.name = name;
        this.address = address;
        this.closeAt = closeAt;
        this.restaurantImage = restaurantImage;
        this.plateList = plateList;
    }

    protected Restaurant(Parcel in) {
        name = in.readString();
        address = in.readString();
        closeAt = in.readString();
        if (in.readByte() == 0) {
            restaurantImage = null;
        } else {
            restaurantImage = in.readInt();
        }
        plateList = in.createTypedArrayList(Plate.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(address);
        dest.writeString(closeAt);
        if (restaurantImage == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(restaurantImage);
        }
        dest.writeTypedList(plateList);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCloseAt() {
        return closeAt;
    }

    public void setCloseAt(String closeAt) {
        this.closeAt = closeAt;
    }

    public Integer getRestaurantImage() {
        return restaurantImage;
    }

    public void setRestaurantImage(Integer restaurantImage) {
        this.restaurantImage = restaurantImage;
    }

    public ArrayList<Plate> getPlateList() {
        return plateList;
    }

    public void setPlateList(ArrayList<Plate> plateList) {
        this.plateList = plateList;
    }
}
