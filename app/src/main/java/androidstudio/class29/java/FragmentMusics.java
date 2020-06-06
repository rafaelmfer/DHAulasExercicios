package androidstudio.class29.java;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.my_utils.baseviews.FragBase;
import com.rafaelmfer.codeclasses.R;
import com.rafaelmfer.codeclasses.databinding.FragClass29MusicsBinding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import androidstudio.class29.java.pojo.Music;

public class FragmentMusics extends FragBase {

    public FragmentMusics() {
        super(R.layout.frag_class29_musics);
    }

    private FragClass29MusicsBinding fragClass29MusicsBinding;
    private List<Music> musicList = new ArrayList<>();

    @Override
    public void onView(@NotNull View view) {
        super.onView(view);
        RecyclerView recyclerMusics = view.findViewById(R.id.class29_recycler_musics);

        musicList.add(new Music("Let Her Go", "Passenger"));
        musicList.add(new Music("Marry You", "Bruno Mars"));
        musicList.add(new Music("Your Love Never Fails", "Jesus Culture"));
        musicList.add(new Music("God's Not Dead", "Newsboys"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);

        recyclerMusics.setLayoutManager(layoutManager);
        recyclerMusics.setAdapter(new AdapterMusics(musicList));
    }
}
