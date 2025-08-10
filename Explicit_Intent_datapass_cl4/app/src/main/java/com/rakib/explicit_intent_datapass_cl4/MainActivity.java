package com.rakib.explicit_intent_datapass_cl4;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText et_name;
    EditText et_mobile;
    EditText et_email;
    EditText et_price;
    EditText et_quantity;


    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        et_name=findViewById(R.id.et_text);
        et_mobile=findViewById(R.id.et_mobile);
        et_email=findViewById(R.id.et_email);
        et_price=findViewById(R.id.et_price);
        et_quantity =findViewById(R.id.et_quantity);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                String name = et_name.getText().toString().trim();
                String mobile = et_mobile.getText().toString().trim();
                String email= et_email.getText().toString().trim();
                String price=et_price.getText().toString().trim();
                String quantity=et_quantity.getText().toString();

                Double v_price = Double.valueOf(price);
                Double v_quantity =Double.valueOf(quantity);

                Double total= v_price * v_quantity;
                String v_total=String.valueOf(total);


                intent.putExtra("key_name",name);
                intent.putExtra("key_mobile",mobile);
                intent.putExtra("key_email",email);
                intent.putExtra("key_total",v_total);
                startActivity(intent);
            }
        });


    }
}