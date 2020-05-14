package androidstudio.class29.java;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.rafaelmfer.codeclasses.R;
import com.rafaelmfer.codeclasses.databinding.FragClass29AlbumLibraryBinding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import utils.ExtFragKt;
import utils.baseviews.FragBind;

public class FragmentAlbums extends FragBind<FragClass29AlbumLibraryBinding> {

    static final String ALBUM_IMAGE = "ALBUM";
    static final String ALBUM_NAME = "ALBUM_NAME";
    static final String ALBUM_RELEASE = "ALBUM_RELEASE";
    private AlbumsPageAdapter albumsPageAdapter;
    private List<Fragment> fragmentList = new ArrayList<>();

    public FragmentAlbums() {
        super(FragClass29AlbumLibraryBinding.class);
    }

    @Override
    public void onBoundView(@NotNull FragClass29AlbumLibraryBinding binding) {
        Bundle bundle1 = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle1.putInt(ALBUM_IMAGE, R.drawable.image6);
        bundle1.putString(ALBUM_NAME, "Album 1");
        bundle1.putString(ALBUM_RELEASE, "2000");

        bundle2.putInt(ALBUM_IMAGE, R.drawable.image7);
        bundle2.putString(ALBUM_NAME, "Album 2");
        bundle2.putString(ALBUM_RELEASE, "2012");

        fragmentList.add(ExtFragKt.newInstance(new FragmentAlbum(), bundle1));
        fragmentList.add(ExtFragKt.newInstance(new FragmentAlbum(), bundle2));

        albumsPageAdapter = new AlbumsPageAdapter(fragmentList, getChildFragmentManager());
        binding.viewPager.setAdapter(albumsPageAdapter);

    }
}
