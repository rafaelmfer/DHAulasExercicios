package class28.androidchallenge01.ui.restaurants;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import class28.androidchallenge01.R;
import class28.androidchallenge01.model.Plate;
import class28.androidchallenge01.model.Restaurant;
import class28.androidchallenge01.utils.ActivityContract;

public class FragRestaurants extends Fragment implements OnRestaurantItemClickCallback {

    public static final String CHOSEN_RESTAURANT = "CHOSEN_RESTAURANT";

    private ImageButton restaurantsBackButton;
    private RecyclerView rvRestaurantList;
    private ArrayList<Restaurant> restaurantList = new ArrayList<>();
    private ArrayList<Plate> plateList = new ArrayList<>();

    private ActivityContract activity;

    public FragRestaurants() {
    }

    @Override
    public void onRestaurantItemClickCallback(int index) {
        Restaurant restaurant = restaurantList.get(index);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_restaurant, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = (ActivityContract) context;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        restaurantsBackButton = getActivity().findViewById(R.id.toolbar_back_button);
        restaurantsBackButton.setVisibility(View.GONE);
        rvRestaurantList = view.findViewById(R.id.rvRestaurantList);

        //Cada parametro da instância criado de uma maneira diferente, string direta, getString e setado diretamente na classe modelo.
        for (int i = 0; i < 12; i++) {
            plateList.add(new Plate("Salada com Molho Gengibre", getString(R.string.plate_description)));
        }

        restaurantList.add(new Restaurant("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                "22:00", R.drawable.restaurant, plateList));
        restaurantList.add(new Restaurant("Ayoama - Moema", "Alameda dos Arapanés, 532 - Moema",
                "23:00", R.drawable.restaurant_second, plateList));
        restaurantList.add(new Restaurant("OutBack - Moema", "Av. Moaci, 187, 187 - Moema, São Paulo",
                "00:00", R.drawable.restaurant_third, plateList));
        restaurantList.add(new Restaurant("Sí Señor", "Alameda Jauaperi, 626 - Moema",
                "01:00", R.drawable.restaurant_fourth, plateList));

        rvRestaurantList.setLayoutManager(new LinearLayoutManager(view.getContext()));
        rvRestaurantList.setAdapter(new AdapterRestaurantsList(restaurantList, this));
    }
}
