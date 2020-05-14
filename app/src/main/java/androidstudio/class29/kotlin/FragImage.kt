package androidstudio.class29.kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidstudio.class29.kotlin.FragImageLibrary.Companion.IMAGE
import androidx.fragment.app.Fragment
import com.rafaelmfer.codeclasses.databinding.FragClass29ImageBinding

class FragImage : Fragment() {

    private lateinit var fragClass29ImageBinding: FragClass29ImageBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragClass29ImageBinding = FragClass29ImageBinding.inflate(inflater, container, false)
        return fragClass29ImageBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let { fragClass29ImageBinding.imageView.setBackgroundResource(it.getInt(IMAGE)) }
    }
}