package androidstudio.class29.kotlin.recycler

import androidstudio.class29.java.pojo.Music
import com.my_utils.extensions.get
import com.my_utils.recyclerview.ItemViewBuilderViewBinding
import com.rafaelmfer.codeclasses.databinding.ItemClass29MusicsBinding

class MusicsViewBuilderViewBinding : ItemViewBuilderViewBinding<Music, ItemClass29MusicsBinding>() {

    override val bindClass: Class<ItemClass29MusicsBinding>
        get() = ItemClass29MusicsBinding::class.java

    override fun ItemClass29MusicsBinding.onBind(position: Int) {
        collection.get(position).run {
            musicTitleClass29.text = name
            bandNameClass29.text = bandArtist
        }
    }
}