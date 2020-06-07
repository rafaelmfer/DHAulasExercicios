package webservice.androidchallenge2.ui

import android.os.Bundle
import com.my_utils.baseviews.ActBind
import com.my_utils.dialog.newPanel
import com.my_utils.extensions.formatMarvelDate
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.popup_image_expansion.*
import webservice.androidchallenge2.R
import webservice.androidchallenge2.databinding.ActHqDetailBinding
import webservice.androidchallenge2.model.pojo.Results
import webservice.androidchallenge2.ui.ItemViewHQ.Companion.COMIC_KEY

class ActHQDetail : ActBind<ActHqDetailBinding>() {

    override val bindClass by lazy { ActHqDetailBinding::class.java }
    private var comic: Results = Results()

    override fun ActHqDetailBinding.onBoundView() {
        comic.run {
            hqTitle.text = title
            hqDescription.text =
                if (description.isNullOrEmpty()) getString(R.string.no_description_available) else description
            hqPages.text =
                if (pageCount == 0) getString(R.string.pages_quantity_not_available) else getString(
                    R.string.pages_quantity,
                    pageCount.toString()
                )

            for (price in prices) {
                if (price.type == getString(R.string.printed_comic_price) && price.price != 0.0) {
                    hqPrice.text = getString(R.string.comic_price, price.price.toString())
                    break
                } else {
                    hqPrice.text = getString(R.string.no_information_available)
                }
            }
            for (date in dates) {
                if (date.type == getString(R.string.publication_date_key_api)) {
                    hqPublishedDate.text =
                        getString(
                            R.string.publication_date,
                            date.date.formatMarvelDate(
                                serverPattern = DATE_TIME_PATTERN_MARVEL,
                                pattern = DATE_PATTERN_MONTH_DD_YYYY
                            )
                        )
                    break
                } else {
                    hqPublishedDate.text = getString(R.string.no_information_available)
                }

            }

            Picasso.get().run {
                load("${thumbnail.path}.${thumbnail.extension}")
                    .into(hqImage)

                if (images.isNotEmpty()) {
                    load("${images[0].path}.${images[0].extension}").into(banner)
                }
            }

            hqImage.setOnClickListener {
                it.newPanel(layout = R.layout.popup_image_expansion) {
                    Picasso.get().load("${thumbnail.path}.${thumbnail.extension}")
                        .into(image_at_expansion)
                    expansion_toolbar.setCloseButtonAction { dismiss() }
                }
            }
        }
    }

    override fun Bundle.onExtras() {
        comic = get(COMIC_KEY) as Results
    }

    companion object {
        private const val DATE_TIME_PATTERN_MARVEL = "yyyy-MM-dd'T'HH:mm:ss-SSSS"
        private const val DATE_PATTERN_MONTH_DD_YYYY = "MMM dd, yyyy"
    }
}
