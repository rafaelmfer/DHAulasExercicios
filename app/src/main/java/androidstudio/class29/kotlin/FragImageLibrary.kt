package androidstudio.class29.kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.my_utils.extensions.newInstance
import com.my_utils.viewpager.setupPagerAdapter
import com.rafaelmfer.codeclasses.R
import com.rafaelmfer.codeclasses.databinding.FragClass29ImageLibraryBinding

class FragImageLibrary : Fragment() {

    private lateinit var fragClass29ImageLibraryBinding: FragClass29ImageLibraryBinding
    private val fragmentList: MutableList<Fragment> = mutableListOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragClass29ImageLibraryBinding = FragClass29ImageLibraryBinding.inflate(inflater, container, false)
        return fragClass29ImageLibraryBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentList.addAll(
            listOf(
                FragImage().newInstance { sendImageRes(R.drawable.image7) },
                FragImage().newInstance { sendImageRes(R.drawable.image8) },
                FragImage().newInstance { sendImageRes(R.drawable.image9) }
            )
        )
        fragClass29ImageLibraryBinding.viewPager.setupPagerAdapter(
            frags = fragmentList,
            fragManager = childFragmentManager
        )
    }

    private fun Bundle.sendImageRes(integerRes: Int) {
        putInt(IMAGE, integerRes)
    }

    companion object {
        const val IMAGE = "IMAGE"
    }
}