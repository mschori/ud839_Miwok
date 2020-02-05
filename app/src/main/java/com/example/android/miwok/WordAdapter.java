package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        Word word = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Lookup view for data population
        TextView firstWord = (TextView) convertView.findViewById(R.id.first_word);
        TextView secondWord = (TextView) convertView.findViewById(R.id.second_word);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);

        // Populate the data into the template view using the data object
        firstWord.setText(word.getFirstWord());
        secondWord.setText(word.getSecondWord());
        image.setImageResource(word.getImageId());

        // Return the completed view to render on screen
        return convertView;
    }
}
