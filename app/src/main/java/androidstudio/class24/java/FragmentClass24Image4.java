package androidstudio.class24.java;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.rafaelmfer.codeclasses.R;

public class FragmentClass24Image4 extends Fragment {

    public FragmentClass24Image4() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_class24_4, container, false);
    }
}
