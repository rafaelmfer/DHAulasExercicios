package androidstudio.class18.java;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.rafaelmfer.codeclasses.R;

public class SellingProductWithDiscountActivity extends AppCompatActivity {

    EditText etProductName, etPriceProduct, etDiscount;
    Button btCalculate;

    Context context = this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selling_product_with_discount);

        etProductName = findViewById(R.id.etProductNameSellingProduct);
        etPriceProduct = findViewById(R.id.etPriceProductSellingProduct);
        etDiscount = findViewById(R.id.etDiscountSellingProduct);
        btCalculate = findViewById(R.id.btCalculateDiscountSellingProduct);

        btCalculate.setOnClickListener(v -> {

            Toast.makeText(context,
                    ((editTextIsEmpty(etPriceProduct) || editTextIsEmpty(etPriceProduct))
                            ? getString(R.string.fill_name_and_price_of_the_product)
                            : calculateTotalValue()),
                    Toast.LENGTH_LONG).show();

//                if (editTextIsEmpty(etPriceProduct) || editTextIsEmpty(etPriceProduct)) {
//                    Toast.makeText(context, getString(R.string.fill_name_and_price_of_the_product), Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(context, calculateTotalValue(), Toast.LENGTH_LONG).show();
//                }
        });
    }

    private boolean editTextIsEmpty(EditText et) {
        return et.getText().toString().isEmpty();
    }

    private String calculateTotalValue() {
        double price = Double.parseDouble(etPriceProduct.getText().toString());
        double discount;
        if (editTextIsEmpty(etDiscount)) {
            discount = 0;
        } else {
            discount = Double.parseDouble(etDiscount.getText().toString());
        }
        return String.valueOf(price * (100 - discount) / 100);
    }
}
