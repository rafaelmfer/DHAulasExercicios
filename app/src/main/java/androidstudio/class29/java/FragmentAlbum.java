package androidstudio.class29.java;

import android.os.Bundle;

import com.my_utils.baseviews.FragBind;
import com.rafaelmfer.codeclasses.R;
import com.rafaelmfer.codeclasses.databinding.FragClass29AlbumBinding;

import org.jetbrains.annotations.NotNull;

import static androidstudio.class29.java.FragmentAlbums.ALBUM_IMAGE;
import static androidstudio.class29.java.FragmentAlbums.ALBUM_NAME;
import static androidstudio.class29.java.FragmentAlbums.ALBUM_RELEASE;

public class FragmentAlbum extends FragBind<FragClass29AlbumBinding> {

    private int albumImage;
    private String albumName, albumRelease;

    public FragmentAlbum() {
    }

    @NotNull
    @Override
    public Class<FragClass29AlbumBinding> getBindClass() {
        return FragClass29AlbumBinding.class;
    }

    @Override
    public void onArguments(@NotNull Bundle extras) {
        super.onArguments(extras);
        albumImage = extras.getInt(ALBUM_IMAGE);
        albumName = extras.getString(ALBUM_NAME);
        albumRelease = extras.getString(ALBUM_RELEASE);
    }

    @Override
    public void onBoundView(@NotNull FragClass29AlbumBinding binding) {
        binding.imageView.setImageResource(albumImage);
        binding.albumTitle.setText(albumName);
        binding.releaseDateAlbum.setText(getString(R.string.year_album_release, albumRelease));
    }
}
