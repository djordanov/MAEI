package com.example.maei;

import android.content.Context;
import android.util.Log;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Fetch {
    private static final String TAG = "Fetch";
    private static final String OPEN_WEATHER_MAP_API = "http://api.openweathermap.org/data/2.5/weather?q=$CITY&units=metric";

    public static JSONObject getJSON(Context context, String city) {
        try {
            URL url = new URL(OPEN_WEATHER_MAP_API.replace("$CITY", city));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.addRequestProperty("x-api-key", context.getString(R.string.open_weather_maps_app_id));

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer json = new StringBuffer(1024);
            String tmp = "";
            while ((tmp = reader.readLine()) != null)
                json.append(tmp).append("\n");
            reader.close();

            JSONObject data = new JSONObject(json.toString());

            // This value will be 404 if the request was not
            // successful
            if (data.getInt("cod") != 200) {
                Log.e(TAG, data.toString(2));
                return null;
            }
            return data;

        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return null;
        }
    }
}
