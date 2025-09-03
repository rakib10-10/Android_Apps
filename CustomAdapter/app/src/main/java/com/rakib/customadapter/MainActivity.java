package com.rakib.customadapter;

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

    ListView list;

    String[] district = {
            "টাঙ্গাইল",
            "দিনাজপুর",
            "সিরাজগঞ্জ",
            "নওগাঁ",
            "নেত্রকোনা",
            "জামালপুর",
            "মাগুরা",
            "খুলনা",
            "যশোর",
            "বাগেরহাট",
            "মাগুরা",
            "ময়মনসিংহ",
            "শেরপুর",
            "নাটোর",
            "বাগেরহাট",
            "শেরপুর",
            "খুলনা",
            "ঝিনাইদহ",
            "শেরপুর",
            "শেরপুর",
            "শেরপুর",
            "শেরপুর",
            "ঝিনাইদহ",
            "জয়পুরহাট",
            "জয়পুরহাট",
            "রাজশাহী",
            "নাটোর",
            "পাবনা",
            "নাটোর",
            "রাজশাহী",
            "নাটোর",
            "পাবনা"
    };


    Integer[] imageId = {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);

        CustomAdapter listAdapter = new CustomAdapter(MainActivity.this, district, imageId);
        list.setAdapter(listAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                int imagesvv = imageId[position];
                String namevv = district[position];

                Intent i = new Intent(getApplicationContext(), MainActivity2.class);

                //PASS INDEX OR POS
                i.putExtra("imae", imagesvv);
                i.putExtra("nameee", namevv);


                startActivity(i);

                Toast.makeText(getApplicationContext(), "You Clicked at " + district[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}