package androidstudio.class18.kotlin

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rafaelmfer.codeclasses.R
import kotlinx.android.synthetic.main.activity_product_with_discount.*

class ProductWithDiscountAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_with_discount)

        btCalculateDiscountSellingProduct.setOnClickListener {
            if (editTextIsNotEmpty(etProductName, etPriceProduct)) {
                Toast.makeText(this, totalAmountPayable().toString(), Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, getString(R.string.fill_name_and_price_of_the_product), Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun editTextIsNotEmpty(vararg editText: EditText): Boolean {
        editText.forEach { et ->
            if (et.text.isNotEmpty()) return true
        }
        return false
    }

    private fun totalAmountPayable(): Double {
        val priceProduct = etPriceProduct.editableText.toString().toDouble()
        val discount = etDiscountOfProduct.editableText.toString().toDoubleOrNull()
        return discount?.let { (priceProduct * (100 - discount) / 100) } ?: priceProduct
    }
}
