package androidstudio.class27.kotlin.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidstudio.class27.java.model.Student
import androidx.recyclerview.widget.RecyclerView
import com.rafaelmfer.codeclasses.R

class AdapterStudentList(
    private val studentList: List<Student>
) : RecyclerView.Adapter<AdapterStudentListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = AdapterStudentListViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_student_list, parent, false)
    )

    override fun onBindViewHolder(holder: AdapterStudentListViewHolder, position: Int) {
        studentList[position].run {

            holder.apply {
                tvStudentName.text = name
                tvStudentRa.text = holder.itemView.context.getString(R.string.ra_number, registerCode)
            }
        }
    }

    override fun getItemCount(): Int {
        return studentList.size
    }
}