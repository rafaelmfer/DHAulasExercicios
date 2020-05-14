package androidstudio.class29.java;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rafaelmfer.codeclasses.databinding.ItemClass29MusicsBinding;

import java.util.List;

import androidstudio.class29.java.pojo.Music;

public class AdapterMusics extends RecyclerView.Adapter<AdapterMusics.MusicsViewHolder> {

    private List<Music> musicList;

    AdapterMusics(List<Music> musicList) {
        this.musicList = musicList;
    }

    @NonNull
    @Override
    public MusicsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemClass29MusicsBinding itemClass29MusicsBinding = ItemClass29MusicsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MusicsViewHolder(itemClass29MusicsBinding);
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull MusicsViewHolder holder, int position) {
        Music music = musicList.get(position);

        holder.musicTitleClass29.setText(music.getName());
        holder.bandNameClass29.setText(music.getBandArtist());
    }

    static class MusicsViewHolder extends RecyclerView.ViewHolder {

        TextView musicTitleClass29, bandNameClass29;

        MusicsViewHolder(@NonNull ItemClass29MusicsBinding itemClass29MusicsBinding) {
            super(itemClass29MusicsBinding.getRoot());
            musicTitleClass29 = itemClass29MusicsBinding.musicTitleClass29;
            bandNameClass29 = itemClass29MusicsBinding.bandNameClass29;
        }
    }
}
