package com.rakib.food_feedback;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
RadioGroup radiofoodGroup;
RadioButton radiofoodbutton;
    Button btnsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        radiofoodGroup=findViewById(R.id.deliveryGroup);
        btnsubmit =findViewById(R.id.btnSubmit);
        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox cbBurger = findViewById(R.id.cbBurger);
                CheckBox cbPizza = findViewById(R.id.cbPizza);
                CheckBox cbCoke = findViewById(R.id.cbCoke);
                Intent intent = new Intent(MainActivity.this,Final_page.class);

                if (cbBurger.isChecked()){
                    intent.putExtra("burger",cbBurger.getText().toString());
                }
                if (cbPizza.isChecked()){
                    intent.putExtra("pizza",cbPizza.getText().toString());
                }
                if (cbCoke.isChecked()){
                    intent.putExtra("coke",cbCoke.getText().toString());
                }

                RatingBar ratingBar = findViewById(R.id.ratingBar);
                float rating = ratingBar.getRating();
                intent.putExtra("rating", rating);

                int selectedId = radiofoodGroup.getCheckedRadioButtonId();
                radiofoodbutton = findViewById(selectedId);

                Toast.makeText(MainActivity.this, radiofoodbutton.getText().toString(), Toast.LENGTH_SHORT).show();
                intent.putExtra("delivery",radiofoodbutton.getText().toString());
                startActivity(intent);
            }
        });

    }//slb

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();
//        ImageView iv = (ImageView) findViewById(R.id.iv);


        if (id == R.id.action_food){
            Intent ii = new Intent(this, Food.class);
            startActivity(ii);
            //iv.setImageResource(R.drawable.pic1);
            return true;
        }
        else if (id == R.id.action_review){
            Intent ii = new Intent(this, review_activity.class);
            startActivity(ii);
//            iv.setImageResource(R.drawable.pic2);
            return true;
        }
        else if (id == R.id.action_payment){
            Intent ii = new Intent(this, Payment_Activity.class);
            startActivity(ii);
//            iv.setImageResource(R.drawable.pic3);
            return true;
        }
        else if (id == R.id.action_profile){
            Intent ii = new Intent(this, Profile.class);
            startActivity(ii);
//            iv.setImageResource(R.drawable.pic4);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }



}//mlb