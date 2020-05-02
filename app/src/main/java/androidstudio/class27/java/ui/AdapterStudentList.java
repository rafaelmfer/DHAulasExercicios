package androidstudio.class27.java.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rafaelmfer.codeclasses.R;

import java.util.List;

import androidstudio.class27.java.model.Student;

public class AdapterStudentList extends RecyclerView.Adapter<AdapterStudentListViewHolder> {

    private List<Student> studentList;

    public AdapterStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AdapterStudentListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdapterStudentListViewHolder(LayoutInflater
                .from(parent.getContext()).inflate(R.layout.item_student_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterStudentListViewHolder holder, int position) {
        final Student student = studentList.get(position);

        holder.tvStudentName.setText(student.getName());
        holder.tvStudentRa.setText(holder.itemView.getContext().getString(R.string.ra_number, student.getRegisterCode()));
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}
