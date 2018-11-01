package com.example.maei;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class PostLogin extends Activity {

    public static final String TAG = "PostLogin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_login);
    }

    /**
     * @return the last know best location
     */
    private Location getLastBestLocation() {
        LocationManager locationManager = Context.getSystemService(LocationManager.class);
        
    }
}
