package webservice.androidchallenge2.ui

import androidx.lifecycle.Observer
import com.my_utils.baseviews.ActBind
import com.my_utils.dialog.newPanel
import com.my_utils.extensions.viewModel
import com.my_utils.recyclerview.setupViewBinding
import com.my_utils.recyclerview.update
import kotlinx.android.synthetic.main.popup_profile.*
import webservice.androidchallenge2.R
import webservice.androidchallenge2.databinding.ActHomeBinding
import webservice.androidchallenge2.model.pojo.Results
import webservice.androidchallenge2.viewmodel.ViewModelComicList

class ActHome : ActBind<ActHomeBinding>() {

    override val bindClass by lazy { ActHomeBinding::class.java }
    private val viewModel by lazy { viewModel<ViewModelComicList>() }
    val set = mutableSetOf<Results>()

    override fun ActHomeBinding.onBoundView() {
        recyclerComics.setupViewBinding<ItemViewHQ>(set)

        profile.setOnClickListener {
            it.newPanel(layout = R.layout.popup_profile) {
                profile_toolbar.setButtonLeftAction { dismiss() }
            }
        }

        viewModel.comicsResponse.observe(this@ActHome, Observer { comics ->
            comics?.let {
                it.data.run {
                    results.forEach { result ->
                        if (!result.thumbnail.path.contains("image_not_available")) {
                            set.add(result)
                        }
                    }
                }
                recyclerComics.update()
            }
        })
        viewModel.getComics()
    }
}
