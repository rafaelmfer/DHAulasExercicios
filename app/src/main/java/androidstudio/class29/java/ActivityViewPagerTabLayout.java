package androidstudio.class29.java;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.rafaelmfer.codeclasses.databinding.ActivityViewpagerTablayoutBinding;

import java.util.ArrayList;
import java.util.List;

public class ActivityViewPagerTabLayout extends AppCompatActivity {

    ActivityViewpagerTablayoutBinding viewpagerTabLayoutBinding;
    MusicCatalogPagerAdapter musicCatalogPagerAdapter;
    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> names = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewpagerTabLayoutBinding = ActivityViewpagerTablayoutBinding.inflate(getLayoutInflater());
        setContentView(viewpagerTabLayoutBinding.getRoot());

        names.add("Músicas");
        names.add("Imagens");
        names.add("Álbuns");
        fragmentList.add(new FragmentMusics());
        fragmentList.add(new FragmentImageLibrary());
        fragmentList.add(new FragmentAlbums());

        //Jeito normal de setAdapter ao viewpager
        musicCatalogPagerAdapter = new MusicCatalogPagerAdapter(fragmentList, names, getSupportFragmentManager());
        viewpagerTabLayoutBinding.viewPager.setAdapter(musicCatalogPagerAdapter);
        viewpagerTabLayoutBinding.tabLayout.setupWithViewPager(viewpagerTabLayoutBinding.viewPager);

        //SetAdapter usando uma Extension Function
//        CustomPagerAdapterKt.setupPagerAdapter(viewpagerTabLayoutBinding.viewPager, fragmentList, names);

        // Usado para não destruir o fragment, e evitar o erro de adicionar itens novamente no adapter da recycler no primeiro fragment
        viewpagerTabLayoutBinding.viewPager.setOffscreenPageLimit(fragmentList.size());
    }
}
