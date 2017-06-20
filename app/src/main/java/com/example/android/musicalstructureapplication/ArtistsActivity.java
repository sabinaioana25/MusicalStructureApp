package com.example.android.musicalstructureapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //etSupportActionBar().hide();
        setContentView(R.layout.activity_artists);

        //String that contains the elements of the list on ArtistsActivity
        String[] artists = {"U2", "Incubus", "David Bowie", "Kings of Leon", "Queen", "Pink Floyd", "Rolling Stones"};

        //Custom Adapter for converting the ArrayList of objects into View items loaded into the ListView container
        ListAdapter sabinas2adapter = new CustomAdapter(this, artists);
        ListView artists_listView = (ListView) findViewById(R.id.artists_listView);
        artists_listView.setAdapter(sabinas2adapter);

        artists_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 2) {
                    Intent play2Intent = new Intent(view.getContext(), AlbumsActivity.class);
                    startActivityForResult(play2Intent, 2);
                }
            }
        });

        //ImageView Intent shown as a spyglass /search icon, which takes the user back to the search screen, if clicked
        ImageView goToSearch4 = (ImageView) findViewById(R.id.search_tool4);
        goToSearch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSearchIntent4 = new Intent(ArtistsActivity.this, SearchActivity.class);
                startActivity(goToSearchIntent4);
            }
        });

        TextView titleScreenArtist = (TextView) findViewById(R.id.titleArtist);
        titleScreenArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "The Artists screen display almost all most know artists or bands belonging with a certain genre, under the shape of a ListView. For the purposes of the project, only the option ‘David Bowie’ can be selected and further show the late artist’s albums; but the app should allow the user to scroll through a large number of bands and be able to play their albums. The artists would be displayed using an ArrayAdapter", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
