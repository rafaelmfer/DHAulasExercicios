package utils.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

inline fun <reified T : RecyclerViewBuilderViewBinding<*, *>>
        RecyclerView.setRecyclerAdapterViewBinding(list: Collection<*>) {
    adapter = recyclerAdapterViewBinding<T>(list)
}

inline fun <reified BuilderViewBinding : RecyclerViewBuilderViewBinding<*, *>> recyclerAdapterViewBinding(collection: Collection<*>) =
    object : RecyclerView.Adapter<RecyclerViewHolderViewBinding>() {

        override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int) =
            RecyclerViewHolderViewBinding(
                BuilderViewBinding::class.java.newInstance().init(viewGroup, collection)
            )

        override fun getItemCount() = collection.size

        override fun onBindViewHolder(viewHolder: RecyclerViewHolderViewBinding, position: Int) =
            viewHolder.builder.bind(position)
    }

open class RecyclerViewHolderViewBinding(val builder: RecyclerViewBuilderViewBinding<*, *>) :
    RecyclerView.ViewHolder(builder.build())

abstract class RecyclerViewBuilderViewBinding<Data, Binding : ViewBinding> {

    abstract val bindClass: Class<Binding>
    private lateinit var binding: Binding
    lateinit var collection: Collection<Data>

    private lateinit var viewGroup: ViewGroup

    @Suppress("UNCHECKED_CAST")
    fun init(viewGroup: ViewGroup, collection: Collection<*>): RecyclerViewBuilderViewBinding<Data, Binding> {
        this.viewGroup = viewGroup
        this.collection = collection as Collection<Data>
        return this
    }

    fun build(): View {
        binding = inflate()
        return binding.root
    }

    @Suppress("UNCHECKED_CAST")
    fun inflate() =
        bindClass.getMethod("inflate", LayoutInflater::class.java).invoke(
            null, ((viewGroup.context) as AppCompatActivity).layoutInflater
        ) as Binding


    fun bind(position: Int) = binding.onBind(position)

    abstract fun Binding.onBind(position: Int)
}