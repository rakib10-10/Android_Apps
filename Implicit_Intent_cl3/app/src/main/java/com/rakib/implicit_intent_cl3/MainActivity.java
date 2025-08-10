package com.rakib.implicit_intent_cl3;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {
    Button v_contact;
    Button v_gallery;
    Button v_browser;
    EditText v_edittext;
    Button v_dialpad;
    Button v_camera;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        v_contact = findViewById(R.id.b_contact);
        //Gallary Section
        v_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("content://contacts/people"));
                startActivity(i);
            }
        });
        //Gallary Section
        v_gallery = findViewById(R.id.b_gallery);
        v_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("content://media/external/images/media/"));
                startActivity(i);
            }
        });
        //Browser Section

        v_browser=findViewById(R.id.b_browser);
        v_edittext=findViewById(R.id.b_edit);
        v_browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent();
                i.setAction(Intent.ACTION_VIEW);
//                i.setData(Uri.parse("https://www.stamasoft.com/"));
                //dynamic
                String url = v_edittext.getText().toString();
                i.setData(Uri.parse("https://www." + url));
                startActivity(Intent.createChooser(i, "Title"));

            }
        });

        //Browser End

        //Dialpad section
        v_dialpad = findViewById(R.id.b_dialpad);
        v_dialpad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" + v_edittext.getText()));
                startActivity(i);
            }
        });
     //End Dialpad
     //Camera
        v_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                //video capture
                //i.setAction(MediaStore.ACTION_VIDEO_CAPTURE);
                // image capture
                i.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(i);
            }
        });
     //end Camera
        //---------email---


        // The method is called when the user clicks on "Send Email" button.
        public void sendEmail(View view) {


        // List of recipients
  String[] recipients=new String[]{"stamaapps@gmail.com"};
       String subject="Hi, how are you!";
       String content ="This is my test email";
       Intent intentEmail = new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
       intentEmail.putExtra(Intent.EXTRA_EMAIL, recipients);
       intentEmail.putExtra(Intent.EXTRA_SUBJECT, subject);
       intentEmail.putExtra(Intent.EXTRA_TEXT, content);
       intentEmail.setType("text/plain");
       startActivity(Intent.createChooser(intentEmail, "Choose an email client from..."));






    }//slb


}//mlb
