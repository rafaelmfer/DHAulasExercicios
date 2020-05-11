package utils.recyclerview

import android.view.LayoutInflater.from
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

inline fun <reified T : RecyclerViewBuilder<*>>
        RecyclerView.setRecyclerAdapter(list: Collection<*>) {
    adapter = recyclerAdapter<T>(list)
}

inline fun <reified Builder : RecyclerViewBuilder<*>> recyclerAdapter(collection: Collection<*>) =
    object : RecyclerView.Adapter<RecyclerViewHolder>() {

        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int) =
            RecyclerViewHolder(Builder::class.java.newInstance().init(viewGroup, collection))

        override fun getItemCount() = collection.size

        override fun onBindViewHolder(viewHolder: RecyclerViewHolder, position: Int) =
            viewHolder.builder.bind(position)
    }

open class RecyclerViewHolder(val builder: RecyclerViewBuilder<*>) : RecyclerView.ViewHolder(builder.build())

abstract class RecyclerViewBuilder<Type> {
    abstract val layout: Int
    lateinit var viewGroup: ViewGroup
    lateinit var view: View
    lateinit var collection: Collection<Type>

    @Suppress("UNCHECKED_CAST")
    fun init(viewGroup: ViewGroup, collection: Collection<*>): RecyclerViewBuilder<Type> {
        this.viewGroup = viewGroup
        this.collection = collection as Collection<Type>
        return this
    }

    fun build(): View {
        view = from(viewGroup.context).inflate(layout, viewGroup, false)
        return view
    }

    fun bind(position: Int) = view.onBind(position)

    abstract fun View.onBind(position: Int)
}