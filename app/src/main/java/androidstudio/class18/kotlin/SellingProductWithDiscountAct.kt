package androidstudio.class18.kotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rafaelmfer.codeclasses.R
import kotlinx.android.synthetic.main.activity_selling_product_with_discount.*

class SellingProductWithDiscountAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selling_product_with_discount)

        btCalculateDiscountSellingProduct.setOnClickListener {
            if (etProductNameSellingProduct.text.isNotEmpty() && etPriceProductSellingProduct.text.isNotEmpty()) {
                val priceProduct = etPriceProductSellingProduct.editableText.toString().toDouble()
                val discount = etDiscountSellingProduct.editableText.toString().toDoubleOrNull()
                val totalAmountPayable = discount?.let { priceProduct * (100 - discount) / 100 } ?: priceProduct
                Toast.makeText(this, totalAmountPayable.toString(), Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, getString(R.string.fill_name_and_price_of_the_product), Toast.LENGTH_LONG).show()
            }
        }
    }
}
