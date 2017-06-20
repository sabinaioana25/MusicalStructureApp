package com.example.android.musicalstructureapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_play);

        //ImageView Intent shown as a spyglass /search icon, which takes the user back to the search screen, if clicked
        ImageView backToSearch1 = (ImageView) findViewById(R.id.search_tool1);
        backToSearch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnToSearchIntent1 = new Intent(PlayActivity.this, SearchActivity.class);
                startActivity(returnToSearchIntent1);
            }
        });

        ImageView albumImage = (ImageView) findViewById(R.id.imageViewDavidBowie);
        albumImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "The activity is the media player interface for songs. It has an upper bar containing a burger menu, the name of the singer or band and a search icon which, once clicked, takes the user back to the search screen. Lower, there is an ImageView of the album, the name of the song and below, of the album. Instead of implementing a seekbar and play buttons, I imported the assets created in Adobe XD. The play screen should have these implemented, so the user can play/pause a song, skip forward or backward or go back to search another singer.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
