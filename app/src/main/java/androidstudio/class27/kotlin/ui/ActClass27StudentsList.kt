package androidstudio.class27.kotlin.ui

import android.os.Bundle
import androidstudio.class27.java.model.Student
import androidstudio.class27.java.ui.AdapterStudentList
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.rafaelmfer.codeclasses.R
import kotlinx.android.synthetic.main.activity_class27.*

class ActClass27StudentsList : AppCompatActivity() {

    var studentList = mutableListOf(
        Student("Rafinha", "486513"),
        Student("Leonardo", "554984"),
        Student("Raquel", "186756"),
        Student("Leticia", "168487"),
        Student("Danny", "741654"),
        Student("Junior", "645612")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class27)

        rvStudentsList.layoutManager = LinearLayoutManager(this)
        rvStudentsList.adapter = AdapterStudentList(studentList)
    }
}