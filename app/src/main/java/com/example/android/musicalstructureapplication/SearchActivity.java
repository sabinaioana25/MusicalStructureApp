package com.example.android.musicalstructureapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_search);

        //These buttons intent allow the user to navigate to the next screen of the app,
        // depending on whether they search artists/band or they wish to explore genres;
        //the user is taken directly to the "Albums" page if they search for artist/band;
        //otherwise, they are taken to the next screen which is "Genres"
        Button genres = (Button) findViewById(R.id.explore_btn);
        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent genresIntent = new Intent(SearchActivity.this, GenresActivity.class);
                startActivity(genresIntent);
            }
        });

        Button albums = (Button) findViewById(R.id.albums_btn);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(SearchActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        //Toast message appears when clicking on the logo image
        ImageView logoApp = (ImageView) findViewById(R.id.logo);
        logoApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This activity shows the user the possibility of either searching for his/her favourite artists or exploring different types of music. Later, additional to the existing buttons, there would be two more buttons added for the user, for them to access their saved albums or playlists.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
