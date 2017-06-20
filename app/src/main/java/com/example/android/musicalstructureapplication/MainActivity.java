package com.example.android.musicalstructureapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //This intent lets the user navigate from the Login page to next page, after signing in with username & password
        Button search = (Button) findViewById(R.id.login);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//Create a new intent to open the {@Link NumbersActivity}
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                //Start new activity
                startActivity(searchIntent);
            }
        });

        //Toast message appears when clicking on the logo image
        ImageView logoApp = (ImageView) findViewById(R.id.logo);
        logoApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This activity shows the home screen of the app, appearing as the start screen.\n" +
                        "There are two EditText boxes in which the user enters their username and password and by pressing on the button, they are directed to the next screen.\n" +
                        "Above the fill in boxes and the login button, there is he logo of the app, which currently has no function.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
