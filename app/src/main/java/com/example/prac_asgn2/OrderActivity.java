package com.example.prac_asgn2;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {

    CheckBox checkBoxLUCC, checkBoxCSE, checkBoxLUSC;
    Spinner spinnerSizeLUCC, spinnerSizeCSE, spinnerSizeLUSC;
    RatingBar ratingBar;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        // Initialize CheckBoxes for T-shirts
        checkBoxLUCC = findViewById(R.id.checkbox_lucc);
        checkBoxCSE = findViewById(R.id.checkbox_cse);
        checkBoxLUSC = findViewById(R.id.checkbox_lusc);

        // Initialize Spinners for T-shirt sizes
        spinnerSizeLUCC = findViewById(R.id.spinner_size_lucc);
        spinnerSizeCSE = findViewById(R.id.spinner_size_cse);
        spinnerSizeLUSC = findViewById(R.id.spinner_size_lusc);

        // Initialize RatingBar and Submit button
        ratingBar = findViewById(R.id.ratingBar);
        buttonSubmit = findViewById(R.id.button_submit);

        // Set the price for each T-shirt
        final int priceLUCC = 25;
        final int priceCSE = 30;
        final int priceLUSC = 35;

        // Submit button logic
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder receipt = new StringBuilder();
                int totalPrice = 0;

                // Check if LUCC T-shirt is selected
                if (checkBoxLUCC.isChecked()) {
                    String sizeLUCC = spinnerSizeLUCC.getSelectedItem().toString();
                    receipt.append("LUCC T-shirt - Size ").append(sizeLUCC).append(": $").append(priceLUCC).append("\n");
                    totalPrice += priceLUCC;
                }

                // Check if CSE T-shirt is selected
                if (checkBoxCSE.isChecked()) {
                    String sizeCSE = spinnerSizeCSE.getSelectedItem().toString();
                    receipt.append("CSE T-shirt - Size ").append(sizeCSE).append(": $").append(priceCSE).append("\n");
                    totalPrice += priceCSE;
                }

                // Check if LUSC T-shirt is selected
                if (checkBoxLUSC.isChecked()) {
                    String sizeLUSC = spinnerSizeLUSC.getSelectedItem().toString();
                    receipt.append("LUSC T-shirt - Size ").append(sizeLUSC).append(": $").append(priceLUSC).append("\n");
                    totalPrice += priceLUSC;
                }

                // Get the rating from the RatingBar
                float rating = ratingBar.getRating();
                receipt.append("Rating: ").append(rating).append("/5\n");

                // Display the total price
                receipt.append("Total Price: $").append(totalPrice);

                // Show the receipt using a Toast message
                Toast.makeText(OrderActivity.this, receipt.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
