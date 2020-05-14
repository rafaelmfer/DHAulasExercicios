package androidstudio.class29.kotlin.recycler

import androidstudio.class29.java.pojo.Music
import com.rafaelmfer.codeclasses.databinding.ItemClass29MusicsBinding
import utils.get
import utils.recyclerview.RecyclerViewBuilderViewBinding

class MusicsViewBuilderViewBinding : RecyclerViewBuilderViewBinding<Music, ItemClass29MusicsBinding>() {

    override val bindClass: Class<ItemClass29MusicsBinding>
        get() = ItemClass29MusicsBinding::class.java

    override fun ItemClass29MusicsBinding.onBind(position: Int) {
        collection.get(position).run {
            musicTitleClass29.text = name
            bandNameClass29.text = bandArtist
        }
    }
}