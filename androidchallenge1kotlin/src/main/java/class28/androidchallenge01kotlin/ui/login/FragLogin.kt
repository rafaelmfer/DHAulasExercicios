package class28.androidchallenge01kotlin.ui.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import class28.androidchallenge01kotlin.R
import class28.androidchallenge01kotlin.ui.restaurants.ActRestaurantsList
import class28.androidchallenge01kotlin.utils.ActivityContract
import class28.androidchallenge01kotlin.utils.editTextIsNotEmpty
import class28.androidchallenge01kotlin.utils.removeErrorOnTextInputLayout
import kotlinx.android.synthetic.main.fragment_login.*

class FragLogin : Fragment() {

    private lateinit var registerBackButton: ImageButton
    private lateinit var activity: ActivityContract

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activity = context as ActivityContract
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registerBackButton = getActivity()?.findViewById(R.id.toolbar_back_button)!!
        registerBackButton.visibility = View.GONE
        btLogin.setOnClickListener {
            removeErrorOnTextInputLayout(tilLoginUserEmail, tilLoginUserPassword)
            if (editTextIsNotEmpty(etLoginUserEmail, etLoginUserPassword)) {
                startActivity(Intent(it.context, ActRestaurantsList::class.java))
            } else {
                if (!editTextIsNotEmpty(etLoginUserEmail)) {
                    tilLoginUserEmail.error = getString(R.string.error_field_must_be_filled)
                }
                if (!editTextIsNotEmpty(etLoginUserPassword)) {
                    tilLoginUserPassword.error = getString(R.string.error_field_must_be_filled)
                }
            }
        }
        btRegister.setOnClickListener { activity.startFragment(FragRegister()) }
    }
}