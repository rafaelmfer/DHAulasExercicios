package androidstudio.class29.kotlin

import androidx.fragment.app.Fragment
import com.my_utils.baseviews.FragBind
import com.my_utils.extensions.newInstance
import com.my_utils.viewpager.setupPagerAdapter
import com.rafaelmfer.codeclasses.R
import com.rafaelmfer.codeclasses.databinding.FragClass29AlbumLibraryBinding

class FragAlbums : FragBind<FragClass29AlbumLibraryBinding>() {

    override val bindClass: Class<FragClass29AlbumLibraryBinding>
        get() = FragClass29AlbumLibraryBinding::class.java

    private val fragmentList: MutableList<Fragment> = mutableListOf()

    override fun FragClass29AlbumLibraryBinding.onBoundView() {
        fragmentList.addAll(
            listOf(FragAlbum().newInstance {
                putInt(ALBUM_IMAGE, R.drawable.image6)
                putString(ALBUM_NAME, "Album 1")
                putString(ALBUM_RELEASE, "2000")
            },
                FragAlbum().newInstance {
                    putInt(ALBUM_IMAGE, R.drawable.image7)
                    putString(ALBUM_NAME, "Album 2")
                    putString(ALBUM_RELEASE, "2012")
                })
        )
        binding.viewPager.setupPagerAdapter(frags = fragmentList, titles = null, fragManager = childFragmentManager)
    }

    companion object {
        const val ALBUM_IMAGE = "ALBUM"
        const val ALBUM_NAME = "ALBUM_NAME"
        const val ALBUM_RELEASE = "ALBUM_RELEASE"
    }
}