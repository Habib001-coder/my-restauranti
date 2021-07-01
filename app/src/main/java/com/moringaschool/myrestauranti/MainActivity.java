package com.moringaschool.myrestauranti;

import android.content.Intent;
import android.location.Location;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;


public  class MainActivity extends AppCompatActivity {
   public static final String TAG = MainActivity.class.getSimpleName();
   private EditText mLocationEditText;
    private Button mFindRestaurantiButton;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
        mFindRestaurantiButton = (Button) findViewById(R.id. findRestaurantiButton);
            mFindRestaurantiButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String location = mLocationEditText.getText().toString();
//                    Log.d(TAG, "onClick: ");
//                    Log.d(TAG, "onClick: ");(TAG, location) ;


                   Intent intent = new Intent(MainActivity.this, RestaurantiActivity.class);
//                   intent.putExtra("location", location);

                   startActivity(intent);
//                    String Location = mLocationEditText.getText().toString();
//                    Toast.makeText(MainActivity.this, location, Toast.LENGTH_LONG).show();



                }
            });
        }
}

