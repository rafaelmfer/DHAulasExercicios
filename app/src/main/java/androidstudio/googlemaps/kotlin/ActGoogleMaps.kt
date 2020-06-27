package androidstudio.googlemaps.kotlin

import com.my_utils.baseviews.ActBind
import com.my_utils.extensions.editTextIsNotEmpty
import com.my_utils.extensions.openGoogleMaps
import com.my_utils.extensions.string
import com.rafaelmfer.codeclasses.databinding.ActivityGoogleMapsBinding

class ActGoogleMaps : ActBind<ActivityGoogleMapsBinding>() {

    override val bindClass by lazy { ActivityGoogleMapsBinding::class.java }

    override fun ActivityGoogleMapsBinding.onBoundView() {

        goSearch.setOnClickListener {
            if (editTextIsNotEmpty(addressInput)) {
                openGoogleMaps(addressInput.string)
            }
        }
    }
}
