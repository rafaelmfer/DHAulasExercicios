package androidstudio.class27.java.ui;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rafaelmfer.codeclasses.R;

class AdapterStudentListViewHolder extends RecyclerView.ViewHolder {

    TextView tvStudentName, tvStudentRa;

    AdapterStudentListViewHolder(@NonNull View itemView) {
        super(itemView);
        tvStudentName = itemView.findViewById(R.id.tvStudentName);
        tvStudentRa = itemView.findViewById(R.id.tvStudentRa);
    }
}
