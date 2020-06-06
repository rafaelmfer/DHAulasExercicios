package androidstudio.class29.java;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.my_utils.extensions.ExtFragKt;
import com.rafaelmfer.codeclasses.R;
import com.rafaelmfer.codeclasses.databinding.FragClass29ImageLibraryBinding;

import java.util.ArrayList;
import java.util.List;

public class FragmentImageLibrary extends Fragment {

    static final String IMAGE = "IMAGE";
    private FragClass29ImageLibraryBinding fragClass29ImageLibraryBinding;
    private ImagesPageAdapter imagesPageAdapter;
    private List<Fragment> fragmentList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragClass29ImageLibraryBinding = FragClass29ImageLibraryBinding.inflate(inflater, container, false);
        return fragClass29ImageLibraryBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle1 = new Bundle();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        bundle1.putInt(IMAGE, R.drawable.image7);
        bundle2.putInt(IMAGE, R.drawable.image8);
        bundle3.putInt(IMAGE, R.drawable.image9);

        fragmentList.add(ExtFragKt.newInstance(new FragmentImage(), bundle1));
        fragmentList.add(ExtFragKt.newInstance(new FragmentImage(), bundle2));
        fragmentList.add(ExtFragKt.newInstance(new FragmentImage(), bundle3));

        imagesPageAdapter = new ImagesPageAdapter(fragmentList, getChildFragmentManager());
        fragClass29ImageLibraryBinding.viewPager.setAdapter(imagesPageAdapter);
    }
}
