package class28.androidchallenge01.utils;

import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.textfield.TextInputLayout;

public class Utils {

    public static boolean editTextIsNotEmpty(EditText... editTexts) {
        for (EditText et : editTexts) {
            if (et.getText().toString().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static void removeErrorOnTextInputLayout(TextInputLayout... textInputLayouts) {
        for (TextInputLayout til : textInputLayouts) {
            til.setError(null);
        }
    }

    public static void startFragment(FragmentManager fragManager, Fragment fragment, int layout) {
        boolean fragBack = hasThisFragment(fragManager, fragment.getClass().getName());

        if (!fragBack) fragManager
                .beginTransaction()
                .replace(layout, fragment)
                .addToBackStack(fragment.getClass().getName())
                .commit();
    }

    private static boolean hasThisFragment(FragmentManager fragManager, String fragName) {
        return fragManager.popBackStackImmediate(fragName, 0);
    }
}
