package androidstudio.class29.kotlin

import android.view.View
import androidstudio.class29.java.pojo.Music
import androidstudio.class29.kotlin.recycler.AdapterMusics
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.my_utils.baseviews.FragBase
import com.rafaelmfer.codeclasses.R

class FragMusics : FragBase(R.layout.frag_class29_musics) {

    private val musicList: MutableList<Music> = mutableListOf()

    override fun View.onView() {
        val recyclerMusics = findViewById<RecyclerView>(R.id.class29_recycler_musics)

        musicList.addAll(
            listOf(
                Music("Let Her Go", "Passenger"),
                Music("Marry You", "Bruno Mars"),
                Music("Your Love Never Fails", "Jesus Culture"),
                Music("God's Not Dead", "Newsboys")
            )
        )

        recyclerMusics.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerMusics.adapter = AdapterMusics(musicList)

        //Criação do RecyclerAdapter muito mais rápido pela Entension function
//        recyclerMusics.setup<MusicsViewBuilder>(musicList)
//        recyclerMusics.setupViewBinding<MusicsViewBuilderViewBinding>(musicList)
    }
}