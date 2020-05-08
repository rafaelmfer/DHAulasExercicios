package class28.androidchallenge01kotlin.ui.restaurants

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import class28.androidchallenge01kotlin.R
import class28.androidchallenge01kotlin.model.Plate
import class28.androidchallenge01kotlin.model.Restaurant
import class28.androidchallenge01kotlin.utils.ActivityContract
import kotlinx.android.synthetic.main.fragment_restaurant.*

class FragRestaurants : Fragment(), OnRestaurantItemClickCallback {

    private lateinit var restaurantsBackButton: ImageButton
    private lateinit var restaurantOptionsMenu: ImageButton
    private var activity: ActivityContract? = null

    private var plateList = listOf<Plate>()
    private var restaurantList = listOf<Restaurant>()

    override fun onRestaurantItemClickCallback(index: Int) {
        val restaurant = restaurantList[index]
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.fragment_restaurant, container, false)

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity = context as ActivityContract
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        restaurantsBackButton = getActivity()?.findViewById(R.id.toolbar_back_button)!!
        restaurantOptionsMenu = getActivity()?.findViewById(R.id.restaurant_options_menu)!!
        restaurantsBackButton.visibility = View.GONE
        restaurantOptionsMenu.visibility = View.VISIBLE

        //Cada parametro da instância criado de uma maneira diferente, string direta, getString e setado diretamente na classe modelo.
        plateList = listOf(
            Plate("Salada com Molho Gengibre", getString(R.string.plate_description)),
            Plate("Salada com Molho Gengibre", getString(R.string.plate_description)),
            Plate("Salada com Molho Gengibre", getString(R.string.plate_description)),
            Plate("Salada com Molho Gengibre", getString(R.string.plate_description)),
            Plate("Salada com Molho Gengibre", getString(R.string.plate_description)),
            Plate("Salada com Molho Gengibre", getString(R.string.plate_description)),
            Plate("Salada com Molho Gengibre", getString(R.string.plate_description)),
            Plate("Salada com Molho Gengibre", getString(R.string.plate_description)),
            Plate("Salada com Molho Gengibre", getString(R.string.plate_description)),
            Plate("Salada com Molho Gengibre", getString(R.string.plate_description)),
            Plate("Salada com Molho Gengibre", getString(R.string.plate_description)),
            Plate("Salada com Molho Gengibre", getString(R.string.plate_description))
        )

        restaurantList = listOf(
            Restaurant("Tony Roma's", "Av. Lavandisca, 717 - Indianópolis, São Paulo", "22:00", R.drawable.restaurant, plateList),
            Restaurant("Ayoama - Moema", "Alameda dos Arapanés, 532 - Moema", "23:00", R.drawable.restaurant_second, plateList),
            Restaurant("OutBack - Moema", "Av. Moaci, 187, 187 - Moema, São Paulo", "00:00", R.drawable.restaurant_third, plateList),
            Restaurant("Sí Señor", "Alameda Jauaperi, 626 - Moema", "01:00", R.drawable.restaurant_fourth, plateList)
        )

        rvRestaurantList.layoutManager = LinearLayoutManager(view.context)
        rvRestaurantList.adapter = AdapterRestaurantsList(restaurantList, this)
    }

    companion object {
        const val CHOSEN_RESTAURANT = "CHOSEN_RESTAURANT"
    }
}