package com.jeffhanke.rackm8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Nearby extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby);
    }

    public void goToSearch (View view){
        Intent intent = new Intent(this, Building.class);
        startActivity(intent);
    }

    public void goToMap (View view){
        Intent intent = new Intent(this, Maps.class);
        startActivity(intent);
    }
}
