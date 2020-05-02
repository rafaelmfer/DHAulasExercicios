package androidstudio.class27.java.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rafaelmfer.codeclasses.R;

import java.util.ArrayList;
import java.util.List;

import androidstudio.class27.java.model.Student;

public class ActivityClass27StudentsList extends AppCompatActivity {

    RecyclerView rvStudentsList;
    List<Student> studentList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class27);
        rvStudentsList = findViewById(R.id.rvStudentsList);

        studentList.add(new Student("Rafinha", "486513"));
        studentList.add(new Student("Leonardo", "554984"));
        studentList.add(new Student("Raquel", "186756"));
        studentList.add(new Student("Leticia", "168487"));
        studentList.add(new Student("Danny", "741654"));
        studentList.add(new Student("Junior", "645612"));

        rvStudentsList.setLayoutManager(new LinearLayoutManager(this));
        rvStudentsList.setAdapter(new AdapterStudentList(studentList));
    }
}
