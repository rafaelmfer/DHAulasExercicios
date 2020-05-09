package utils

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

fun <T> Collection<T>.get(index: Int): T {
    forEachIndexed { indexed, element -> if (indexed == index) return element }
    throw IndexOutOfBoundsException()
}

inline fun <reified T : RecyclerViewBuilder<*, *>>
        RecyclerView.setRecyclerAdapter(list: Collection<*>) {
    adapter = recyclerAdapter<T>(list)
}

inline fun <reified Builder : RecyclerViewBuilder<*, *>> recyclerAdapter(collection: Collection<*>) =
    object : RecyclerView.Adapter<RecyclerViewHolder>() {

        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int) =
            RecyclerViewHolder(
                Builder::class.java.newInstance().init(viewGroup, collection)
            )

        override fun getItemCount() = collection.size

        override fun onBindViewHolder(viewHolder: RecyclerViewHolder, position: Int) =
            viewHolder.builder.bind(position)
    }
