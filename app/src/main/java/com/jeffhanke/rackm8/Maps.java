package com.jeffhanke.rackm8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Maps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
    }

    public void goToNearby (View view){
        Intent intent = new Intent(this, Nearby.class);
        startActivity(intent);
    }

    public void goToSearch (View view){
        Intent intent = new Intent(this, Building.class);
        startActivity(intent);
    }
}
