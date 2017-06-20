package com.example.android.musicalstructureapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sabina on 5/17/2017.
 */

class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(Context context, String[] genres) {
        super(context, R.layout.item_list_view, genres);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater sabinaInflater = LayoutInflater.from(getContext());

        View customView = sabinaInflater.inflate(R.layout.item_list_view, parent, false);

        String singleGenreItem = getItem(position);
        TextView textViewGenre = (TextView) customView.findViewById(R.id.adapter_text_view);
        ImageView musicBoxView = (ImageView) customView.findViewById(R.id.adapter_image_view);

        textViewGenre.setText(singleGenreItem);
        musicBoxView.setImageResource(R.drawable.music_box);
        return customView;
    }
}
