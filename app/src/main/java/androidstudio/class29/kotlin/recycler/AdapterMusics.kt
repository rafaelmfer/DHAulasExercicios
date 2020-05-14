package androidstudio.class29.kotlin.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidstudio.class29.java.pojo.Music
import androidx.recyclerview.widget.RecyclerView
import com.rafaelmfer.codeclasses.databinding.ItemClass29MusicsBinding

class AdapterMusics(private val musicList: List<Music>) : RecyclerView.Adapter<AdapterMusics.MusicsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicsViewHolder =
        MusicsViewHolder(ItemClass29MusicsBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount(): Int = musicList.size

    override fun onBindViewHolder(holder: MusicsViewHolder, position: Int) {
        musicList[position].run {
            holder.apply {
                musicTitleClass29.text = name
                bandNameClass29.text = bandArtist
            }
        }
    }

    class MusicsViewHolder(itemClass29MusicsBinding: ItemClass29MusicsBinding) : RecyclerView.ViewHolder(itemClass29MusicsBinding.root) {
        var musicTitleClass29: TextView = itemClass29MusicsBinding.musicTitleClass29
        var bandNameClass29: TextView = itemClass29MusicsBinding.bandNameClass29
    }
}