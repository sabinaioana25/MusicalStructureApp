package com.example.android.musicalstructureapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_albums);

        //ImageView (the pink and white arrow) enables the user to start playing the album which was clicked, in the original order
        ImageView play1 = (ImageView) findViewById(R.id.arrow1);
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(AlbumsActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });

        //ImageView (the pink and white arrow) enables the user to start playing the album which was clicked, in the original order
        ImageView play2 = (ImageView) findViewById(R.id.arrow2);
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(AlbumsActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });

        //ImageView (the pink and white arrow) enables the user to start playing the album which was clicked, in the original order
        ImageView play3 = (ImageView) findViewById(R.id.arrow3);
        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(AlbumsActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });

        //ImageView (the pink and white arrow) enables the user to start playing the album which was clicked, in the original order
        ImageView play4 = (ImageView) findViewById(R.id.arrow4);
        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(AlbumsActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });

        //ImageView (the pink and white arrow) enables the user to start playing the album which was clicked, in the original order
        ImageView play5 = (ImageView) findViewById(R.id.arrow5);
        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(AlbumsActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });

        //ImageView (the pink and white arrow) enables the user to start playing the album which was clicked, in the original order
        ImageView play6 = (ImageView) findViewById(R.id.arrow6);
        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(AlbumsActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });

        //ImageView (the pink and white arrow) enables the user to start playing the album which was clicked, in the original order
        ImageView backToSearch3 = (ImageView) findViewById(R.id.search_tool3);
        backToSearch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnToSearchIntent3 = new Intent(AlbumsActivity.this, SearchActivity.class);
                startActivity(returnToSearchIntent3);
            }
        });

        TextView nameAlbumstScreen = (TextView) findViewById(R.id.textViewDavidBowie);
        nameAlbumstScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "The albums shown on this screen are sorted based on their low popularity; the app will take this information from the international world music charts and will select the songs and the albums that were least known or listened to. By clicking on the pink play arrow, the screen changes into the main play screen and the user can start listening to the album.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
