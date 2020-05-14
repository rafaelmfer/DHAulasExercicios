package androidstudio.class29.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.rafaelmfer.codeclasses.databinding.ActivityViewpagerTablayoutBinding
import utils.adapter.setupPagerAdapter

class ActViewPagerTabLayout : AppCompatActivity() {

    private lateinit var viewpagerTabLayoutBinding: ActivityViewpagerTablayoutBinding

    private val fragmentList: MutableList<Fragment> = mutableListOf(FragMusics(), FragImageLibrary(), FragAlbums())
    private val names: MutableList<String> = mutableListOf("Músicas", "Imagens", "Álbuns")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewpagerTabLayoutBinding = ActivityViewpagerTablayoutBinding.inflate(layoutInflater)
        setContentView(viewpagerTabLayoutBinding.root)
        viewpagerTabLayoutBinding.apply {

            //Jeito normal de setAdapter ao viewpager
//            viewPager.adapter = MusicCatalogPagerAdapter(fragmentList, names, supportFragmentManager);
//            tabLayout.setupWithViewPager(viewPager)

            //Usado para não destruir o fragment, e evitar o erro de adicionar itens novamente no adapter da recycler no primeiro fragment
            viewPager.offscreenPageLimit = fragmentList.size

            //SetAdapter e configure TabLayout usando uma Extension Function
            viewPager.setupPagerAdapter(fragmentList, names, tabLayout)
        }
    }
}