package androidstudio.class29.kotlin

import android.os.Bundle
import androidstudio.class29.kotlin.FragAlbums.Companion.ALBUM_IMAGE
import androidstudio.class29.kotlin.FragAlbums.Companion.ALBUM_NAME
import androidstudio.class29.kotlin.FragAlbums.Companion.ALBUM_RELEASE
import com.rafaelmfer.codeclasses.R
import com.rafaelmfer.codeclasses.databinding.FragClass29AlbumBinding
import utils.baseviews.FragBind

class FragAlbum : FragBind<FragClass29AlbumBinding>() {

    override val bindClass: Class<FragClass29AlbumBinding>
        get() = FragClass29AlbumBinding::class.java

    private var albumImage: Int = 0
    private lateinit var albumName: String
    private lateinit var albumRelease: String

    override fun Bundle.onArguments() {
        albumImage = getInt(ALBUM_IMAGE)
        albumName = getString(ALBUM_NAME) as String
        albumRelease = getString(ALBUM_RELEASE) as String
    }

    override fun FragClass29AlbumBinding.onBoundView() {
        binding.imageView.setImageResource(albumImage)
        binding.albumTitle.text = albumName
        binding.releaseDateAlbum.text = getString(R.string.year_album_release, albumRelease)
    }
}