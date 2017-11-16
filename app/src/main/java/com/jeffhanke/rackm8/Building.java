package com.jeffhanke.rackm8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Building extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building);

    }

    public void goToNearby (View view){
        Intent intent = new Intent(this, Nearby.class);
        startActivity(intent);
    }

    public void goToMap (View view){
        Intent intent = new Intent(this, Maps.class);
        startActivity(intent);
    }


}
