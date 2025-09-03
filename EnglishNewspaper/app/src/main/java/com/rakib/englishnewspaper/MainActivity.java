package com.rakib.englishnewspaper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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

        String[] titles = getResources().getStringArray(R.array.news_titles);
        String[] subTitles = getResources().getStringArray(R.array.news_subtitles);
        String[] times = getResources().getStringArray(R.array.news_times);
        String[] fullStories = getResources().getStringArray(R.array.news_fullstories);

       ListView list = findViewById(R.id.list);
       CustomAdapter adapter = new CustomAdapter(MainActivity.this, titles, subTitles, times, fullStories);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                String title = titles[position];
                String subtitle = subTitles[position];
                String time = times[position];
                String fullStory = fullStories[position];





                Intent intent = new Intent(MainActivity.this, TitleActivity.class);
                intent.putExtra("title", title);
                intent.putExtra("subtitle", subtitle);
                intent.putExtra("time", time);
                intent.putExtra("fullstory", fullStory);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "You clicked " + title, Toast.LENGTH_SHORT).show();
            }
        });
    }
}