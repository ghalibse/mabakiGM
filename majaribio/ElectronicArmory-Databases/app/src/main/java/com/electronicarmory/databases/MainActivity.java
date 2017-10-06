package com.electronicarmory.databases;

import android.database.MatrixCursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.query.Delete;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ActiveAndroid.initialize(this);

        LocationModel newLocationModel = new LocationModel();
        newLocationModel.locationName = "Boise";
        newLocationModel.locationDescription = "Capital of Idaho";


        List<Coordinate> coordinates = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            Coordinate coordinate = new Coordinate();
            coordinate.latitude = i;
            coordinate.longitude = i;
            coordinates.add(coordinate);
        }

        newLocationModel.save();

        for(Coordinate e : coordinates) {

            e.save();
        }
        List<LocationModel>storedLocationModels = LocationModel.getAllLocations();

        for(LocationModel l : storedLocationModels){

            Log.d("LibuTAG_", "onCreate: " + String.format("name : %s , description : %s", l.locationName, l.locationDescription));
        }


//        LocationModel firstLocationModel = storedLocationModels.get(0);
//        firstLocationModel.locationName = "Blacksburg";
//        firstLocationModel.locationDescription = "Home of Virginia Tech!";
//
//        firstLocationModel.save();

//        LocationModel.delete(LocationModel.class, 1);

//        new Delete().from(LocationModel.class).where("location_name = ?", "Boise").execute();

//        storedLocationModels = LocationModel.getAllLocations();

        for(Coordinate co : Coordinate.getAllCoordinates()){

            Log.d("LibuTAG_", "onCreate: " + String.format("long : %s , lat : %s", co.longitude, co.latitude));
        }

        Log.d("EA", storedLocationModels.toString());
        Log.d("EA", "All done!");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
