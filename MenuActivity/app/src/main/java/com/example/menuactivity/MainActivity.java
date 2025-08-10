package com.example.menuactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }//slb
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();
        ImageView iv = (ImageView) findViewById(R.id.iv);


        if (id == R.id.action_elephant){

            Intent ii = new Intent(this, MainActivity2.class);
            startActivity(ii);
            //iv.setImageResource(R.drawable.pic1);
            return true;
        }
        else if (id == R.id.action_cat){

            iv.setImageResource(R.drawable.pic2);
            return true;
        }
        else if (id == R.id.action_dog){

            iv.setImageResource(R.drawable.pic3);
            return true;
        }
        else if (id == R.id.action_giraffe){

            iv.setImageResource(R.drawable.pic4);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

}//mlb