package com.rakib.java_chatbox_datapass;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        EditText ex1 = findViewById(R.id.et1);
        EditText ex2 = findViewById(R.id.et2);
        EditText ex3 = findViewById(R.id.et3);

        String value1 = getIntent().getExtras().getString("grade1");
        ex1.setText(value1);

        String value2 = getIntent().getExtras().getString("grade2");
        ex2.setText(value2);

        String value3 = getIntent().getExtras().getString("grade3");
        ex3.setText(value3);

    }
}