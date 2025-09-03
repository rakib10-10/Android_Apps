package com.rakib.englishnewspaper;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_title);

        String title = getIntent().getStringExtra("title");
        String subtitle = getIntent().getStringExtra("subtitle");
        String time = getIntent().getStringExtra("time");
        String fullStory =getIntent().getStringExtra("fullstory");

        TextView titleTextView = findViewById(R.id.news_title);
        titleTextView.setText(title);
        titleTextView.setTextSize(35);

        TextView subtitleTextView = findViewById(R.id.news_subtitle);
        subtitleTextView.setVisibility(View.GONE);


        TextView timeTextView = findViewById(R.id.news_time);
        timeTextView.setText(time);

        TextView fullStoryTextView = findViewById(R.id.news_fullstory);
        fullStoryTextView.setText(fullStory);
        fullStoryTextView.setTextSize(25);

        if (fullStory != null && !fullStory.isEmpty()) {
            fullStoryTextView.setText(fullStory);
            fullStoryTextView.setVisibility(View.VISIBLE);
        }




    }
}