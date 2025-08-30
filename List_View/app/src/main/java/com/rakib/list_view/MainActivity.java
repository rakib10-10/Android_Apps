package com.rakib.list_view;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

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

        //  Find ListView instead of TextView
        ListView listView = findViewById(R.id.listViewid);

        //  Create adapter with built-in layout
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                R.layout.list_item,      // custom row layout
                R.id.textViewid,       // TextView inside that layout
                getResources().getStringArray(R.array.CTGTANA)
        );

        //  Attach adapter to ListView
        listView.setAdapter(adapter);
    }
}