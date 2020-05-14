package androidstudio.class29.java;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class ImagesPageAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;

    ImagesPageAdapter(List<Fragment> fragments, @NonNull FragmentManager fragmentManager) {
        super(fragmentManager);
        this.fragmentList = fragments;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}