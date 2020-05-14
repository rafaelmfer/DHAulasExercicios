package androidstudio.class29.java;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.rafaelmfer.codeclasses.databinding.FragClass29ImageBinding;

import static androidstudio.class29.java.FragmentImageLibrary.IMAGE;

public class FragmentImage extends Fragment {

    private FragClass29ImageBinding fragClass29ImageBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragClass29ImageBinding = FragClass29ImageBinding.inflate(inflater, container, false);
        return fragClass29ImageBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragClass29ImageBinding.imageView.setBackgroundResource(getArguments().getInt(IMAGE));
    }
}
