package com.moringaschool.myrestauranti;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


public  class RestaurantiActivity extends AppCompatActivity{
    @BindView(R.id.LocationTextView) TextView mLocationTextView;
    @BindView(R.id.ListView) ListView mListView;
//    private TextView mLocationTextView;
//    private ListView mListView;


    private String[] restauranti = new String[]{"Sweet Hereafter", "Cricket", "Hawthorne Fish House", "Viking Soul Food",
            "Red Square", "Horse Brass", "Dick's Kitchen", "Taco Bell", "Me Kha Noodle Bar",
            "La Bonita Taqueria", "Smokehouse Tavern", "Pembiche", "Kay's Bar", "Gnarly Grey", "Slappy Cakes", "Mi Mero Mole" };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        ButterKnife.bind(this);
        mListView = (ListView) findViewById(R.id.ListView);
        mLocationTextView = (TextView) findViewById(R.id.LocationTextView);

//        ArrayAdapter adapter =new ArrayAdapter(this, android.R.simple_list_item_1, restauranti)

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, restauranti);
        mListView.setAdapter(adapter);
      mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

              String restauranti = ((TextView)view).getText().toString();
              Toast.makeText(RestaurantiActivity.this, restauranti,Toast.LENGTH_LONG).show();

          }

      });

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Here are all the restaurants near: " + location);

}
}



