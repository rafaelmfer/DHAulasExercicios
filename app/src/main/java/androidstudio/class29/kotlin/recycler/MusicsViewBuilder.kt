package androidstudio.class29.kotlin.recycler

import android.view.View
import android.widget.TextView
import androidstudio.class29.java.pojo.Music
import com.rafaelmfer.codeclasses.R
import utils.get
import utils.recyclerview.RecyclerViewBuilder

class MusicsViewBuilder : RecyclerViewBuilder<Music>() {

    override val layout: Int
        get() = R.layout.item_class29_musics

    override fun View.onBind(position: Int) {
        collection.get(position).run {
            findViewById<TextView>(R.id.music_title_class29).text = name
            findViewById<TextView>(R.id.band_name_class29).text = bandArtist
        }
    }
}