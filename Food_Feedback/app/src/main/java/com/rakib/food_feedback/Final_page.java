package com.rakib.food_feedback;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Final_page extends AppCompatActivity {

    TextView tvOrderSummary, tvFoods, tvDelivery, tvRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_final_page);

        tvOrderSummary = findViewById(R.id.tvOrderSummary);
        tvFoods = findViewById(R.id.tvFoods);
        tvDelivery = findViewById(R.id.tvDelivery);
        tvRating = findViewById(R.id.tvRating);

        String burger = getIntent().getStringExtra("burger");
        String pizza = getIntent().getStringExtra("pizza");
        String coke = getIntent().getStringExtra("coke");

        String message =
                (burger != null ?   burger  : "") +
                        (pizza != null ?  " ," +pizza : "") +
                        (coke != null ?  " ," + coke : "");

        // Set it to the TextView
        tvFoods.setText(message.trim());
        tvDelivery.setText(getIntent().getStringExtra("delivery"));
        tvRating.setText(String.valueOf(getIntent().getFloatExtra("rating", 0)));

    }
}