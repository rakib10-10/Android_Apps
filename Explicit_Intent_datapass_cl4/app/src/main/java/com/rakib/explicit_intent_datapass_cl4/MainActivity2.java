package com.rakib.explicit_intent_datapass_cl4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView v_name,v_mobile,v_email,v_total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        v_name = findViewById(R.id.tv_name);
        v_mobile=findViewById(R.id.tv_mobile);
        v_email =findViewById(R.id.tv_email);
        v_total =findViewById(R.id.tv_total);
        String name = getIntent().getStringExtra("key_name");
        String mobile = getIntent().getStringExtra("key_mobile");
        String email = getIntent().getStringExtra("key_email");
        String total = getIntent().getStringExtra("key_total");

        v_name.setText(name);
        v_mobile.setText(mobile);
        v_email.setText(email);
        v_total.setText(total);

    }
}