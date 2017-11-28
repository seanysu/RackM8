package com.jeffhanke.rackm8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.support.annotation.NonNull;




public class Maps extends AppCompatActivity {

    private BottomNavigationView mBottomNav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        mBottomNav = (BottomNavigationView) findViewById(R.id.navigation);
        mBottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Log.e("output", item.getTitle().toString());
                if (item.getTitle().toString().compareTo( "Nearby") == 0){
                    Intent intent = new Intent(getBaseContext(), Nearby.class);
                    startActivity(intent);
                }
                if (item.getTitle().toString().compareTo("Search") == 0) {
                    Intent intent = new Intent(getBaseContext(), Building.class);
                    startActivity(intent);
                }
                return true;
            }
        });



    }



}
