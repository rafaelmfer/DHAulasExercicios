package androidstudio.class27.kotlin.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rafaelmfer.codeclasses.R

class AdapterStudentListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvStudentName: TextView = itemView.findViewById(R.id.tvStudentName)
    var tvStudentRa: TextView = itemView.findViewById(R.id.tvStudentRa)
}