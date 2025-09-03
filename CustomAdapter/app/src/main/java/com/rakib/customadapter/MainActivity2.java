package com.rakib.customadapter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {


    int imgg;

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);




        ImageView img=findViewById(R.id.imageView1);
        TextView nameTv = findViewById(R.id.nameTxt);

        Intent i=getIntent();

        imgg =i.getExtras().getInt("imae");
        name =i.getExtras().getString("namee");


        img.setImageResource(imgg);
        nameTv.setText(name);
    }
}