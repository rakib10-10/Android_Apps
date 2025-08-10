package com.example.java_eventhandling_cl5;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b1;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.imageView);
        b1 = findViewById(R.id.onclick);

        // OnClickListener → Set pic1
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setImageResource(R.drawable.pic1);
            }
        });

        // OnTouchListener → Set pic2
        b1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    iv.setImageResource(R.drawable.pic2);
                }
                return false; // false = allow other events (like click) to fire
            }
        });

        // OnLongClickListener → Set pic3
        b1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                iv.setImageResource(R.drawable.pic3);
                return true; // true = consume long click, no click after this
            }
        });
    }
}
