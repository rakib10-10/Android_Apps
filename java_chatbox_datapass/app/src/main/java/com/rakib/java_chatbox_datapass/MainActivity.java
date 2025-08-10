package com.rakib.java_chatbox_datapass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



        Button b1=(Button)findViewById(R.id.button_login);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CheckBox ch1 = findViewById(R.id.checkBox1);
                CheckBox ch2 = findViewById(R.id.checkBox2);
                CheckBox ch3 = findViewById(R.id.checkBox3);
                Intent intent =new Intent(MainActivity.this,MainActivity2.class);

                if(ch1.isChecked()){
                    String result = "Wrong Answer ";

                    intent.putExtra("grade1", result);
                }

                if(ch2.isChecked()){
                    String result2 = "Wrong Answer";

                    intent.putExtra("grade2", result2);
                }
                if(ch3.isChecked()){
                    String result3 = "Right Answer";

                    intent.putExtra("grade3", result3);
                }
               startActivity(intent);

            }
        });
    }
}