package androidstudio.class18.java;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.rafaelmfer.codeclasses.R;

public class ProductWithDiscountActivity extends AppCompatActivity {

    EditText etProductName, etPriceProduct, etDiscount;
    Button btCalculate;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_with_discount);

        etProductName = findViewById(R.id.etProductName);
        etPriceProduct = findViewById(R.id.etPriceProduct);
        etDiscount = findViewById(R.id.etDiscountOfProduct);
        btCalculate = findViewById(R.id.btCalculateDiscountProduct);

        btCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editTextIsNotEmpty(etPriceProduct, etPriceProduct)) {
                    Toast.makeText(view.getContext(), calculateTotalValue(), Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(view.getContext(), getString(R.string.fill_name_and_price_of_the_product), Toast.LENGTH_LONG).show();
                }

//                Toast.makeText(view.getContext(),
//                        ((editTextIsEmpty(etProductName) || editTextIsEmpty(etPriceProduct))
//                                ? getString(R.string.fill_name_and_price_of_the_product)
//                                : calculateTotalValue()),
//                        Toast.LENGTH_LONG).show();

            }
        });
    }

    private boolean editTextIsNotEmpty(EditText... editTexts) {
        for (EditText et : editTexts) {
            if (et.getText().toString().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private String calculateTotalValue() {
        double price = Double.parseDouble(etPriceProduct.getText().toString());
        double discount;
        if (editTextIsNotEmpty(etDiscount)) {
            discount = Double.parseDouble(etDiscount.getText().toString());
        } else {
            discount = 0;
        }
        return String.valueOf(price * (100 - discount) / 100);
    }
}
