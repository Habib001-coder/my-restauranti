package com.moringaschool.myrestauranti;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public  class RestaurantiActivity extends AppCompatActivity{
    private String[] restauranti = new String[] {"Mi Mero Mole", "Mother's Bistro",
            "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil",
            "Slappy Cakes", "Equinox", "Miss Delta's", "Andina",
            "Lardo", "Portland City Grill", "Fat Head's Brewery",
            "Chipotle", "Subway"};

    private TextView mLocationTextView;
    private ListView mListView;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        mLocationTextView = (TextView) findViewById(R.id.LocationTextView);
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Here are all the restaurants near: " + location);

        mListView = (ListView) findViewById(R.id. ListView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, restauranti);
        mListView.setAdapter(adapter);
}
}



