package androidstudio

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidstudio.class18.java.ProductWithDiscountActivity
import androidstudio.class18.kotlin.ProductWithDiscountAct
import androidstudio.class20.java.RegisterActivity
import androidstudio.class20.kotlin.RegisterAct
import androidstudio.class21.java.TelephoneBookActivity
import androidstudio.class21.kotlin.TelephoneBookAct
import androidstudio.class23.java.Class23Activity
import androidstudio.class23.kotlin.Class23Act
import androidstudio.class24.java.Class24Activity
import androidstudio.class24.kotlin.ActClass24
import androidstudio.class26.java.ActivityNavDrawerSimples
import androidstudio.class27.java.ui.ActivityClass27StudentsList
import androidstudio.class27.kotlin.ui.ActClass27StudentsList
import androidstudio.class29.java.ActivityViewPagerTabLayout
import androidstudio.class29.kotlin.ActViewPagerTabLayout
import androidstudio.class38mvvm.kotlin.ActArchitecture
import androidstudio.googlemaps.kotlin.ActGoogleMaps
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rafaelmfer.codeclasses.R
import kotlinx.android.synthetic.main.activity_manager.*
import kotlin.reflect.KClass

class ActivityManager : AppCompatActivity() {

    data class ClassExercises(
        var title: String,
        var javaActivity: KClass<out AppCompatActivity>? = null,
        var kotlinActivity: KClass<out AppCompatActivity>? = null
    )

    private var classExercises = listOf(
        ClassExercises(
            title = "AULA 18 - Layouts",
            javaActivity = ProductWithDiscountActivity::class,
            kotlinActivity = ProductWithDiscountAct::class
        ),
        ClassExercises(
            title = "AULA 20 - Material Design Especialista e Componentes",
            javaActivity = RegisterActivity::class,
            kotlinActivity = RegisterAct::class
        ),
        ClassExercises(
            title = "AULA 21 - Comunicação Entre Activitys",
            javaActivity = TelephoneBookActivity::class,
            kotlinActivity = TelephoneBookAct::class
        ),
        ClassExercises(
            title = "AULA 23 - Fragments",
            javaActivity = Class23Activity::class,
            kotlinActivity = Class23Act::class
        ),
        ClassExercises(
            title = "AULA 24 - Comunicação Entre Fragments",
            javaActivity = Class24Activity::class,
            kotlinActivity = ActClass24::class
        ),
        ClassExercises(
            title = "AULA 26 - NavigationView e DrawerLayout",
            javaActivity = ActivityNavDrawerSimples::class,
            kotlinActivity = ActivityNavDrawerSimples::class
        ),
        ClassExercises(
            title = "AULA 27 - RecyclerView",
            javaActivity = ActivityClass27StudentsList::class,
            kotlinActivity = ActClass27StudentsList::class
        ),
        ClassExercises(
            title = "AULA 29 - ViewPager e TabLayout",
            javaActivity = ActivityViewPagerTabLayout::class,
            kotlinActivity = ActViewPagerTabLayout::class
        ),
        ClassExercises(
            title = "AULA 38 - MVVM",
            kotlinActivity = ActArchitecture::class
        ),
        ClassExercises(
            title = "Google Maps",
            kotlinActivity = ActGoogleMaps::class
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manager)

        rvActsList.apply {
            layoutManager = LinearLayoutManager(this@ActivityManager)
            adapter = ActsListAdapter(classExercises)
        }

    }
}

class ActsListAdapter(var classExercises: List<ActivityManager.ClassExercises>) :
    RecyclerView.Adapter<ActsListAdapter.ActsListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ActsListViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_acts_list, parent, false)
    )

    override fun getItemCount() = classExercises.size

    override fun onBindViewHolder(holder: ActsListViewHolder, position: Int) {
        classExercises[position].run {
            holder.apply {
                tvTitleClassName.text = title

                javaActivity?.let { clazz ->
                    btJava.setOnClickListener {
                        it.context.startActivity(Intent(it.context, clazz.java))
                    }
                }

                kotlinActivity?.let { clazz ->
                    btKotlin.setOnClickListener {
                        it.context.startActivity(Intent(it.context, clazz.java))
                    }
                }
            }
        }
    }

    class ActsListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitleClassName: TextView = itemView.findViewById(R.id.tvTitleClassName)
        val btJava: Button = itemView.findViewById(R.id.btJava)
        val btKotlin: Button = itemView.findViewById(R.id.btKotlin)
    }
}