package webservice.androidchallenge2.ui

import android.content.Intent
import com.my_utils.recyclerview.ItemViewBuilderViewBinding
import com.squareup.picasso.Picasso
import webservice.androidchallenge2.databinding.ItemHqBinding
import webservice.androidchallenge2.model.pojo.Results

class ItemViewHQ : ItemViewBuilderViewBinding<Results, ItemHqBinding>() {

    override val bindClass by lazy { ItemHqBinding::class.java }

    override fun ItemHqBinding.onBind(position: Int) {
        (collection as Set<Results>).elementAt(position).run {
            hqNameOnList.text = title
            Picasso.get().load("${thumbnail.path}.${thumbnail.extension}").into(hqImageOnList)
            placeholderHq.setOnClickListener {
                context.startActivity(Intent(context, ActHQDetail::class.java).apply {
                putExtra(COMIC_KEY,this@run)
            }) }
        }
    }

    companion object {
        const val COMIC_KEY = "COMIC"
    }
}