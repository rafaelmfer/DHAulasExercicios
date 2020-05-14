package androidstudio.class29.java;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class MusicCatalogPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;
    private List<String> namesTab;

    MusicCatalogPagerAdapter(List<Fragment> fragments, List<String> namesTab, @NonNull FragmentManager fragmentManager) {
        super(fragmentManager);
        this.fragmentList = fragments;
        this.namesTab = namesTab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return namesTab.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
