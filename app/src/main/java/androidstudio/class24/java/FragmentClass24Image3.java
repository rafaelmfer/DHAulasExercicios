package androidstudio.class24.java;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.rafaelmfer.codeclasses.R;

public class FragmentClass24Image3 extends Fragment {

    public FragmentClass24Image3() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_class24_3, container, false);
    }

}
