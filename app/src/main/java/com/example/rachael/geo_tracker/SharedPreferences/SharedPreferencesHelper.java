package com.example.rachael.geo_tracker.SharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;

import com.example.rachael.geo_tracker.Models.GeoTracker;
import com.example.rachael.geo_tracker.R;

public class SharedPreferencesHelper {

    public static void saveApplicationState(Context context, GeoTracker state){

        SharedPreferences.Editor editor = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE).edit();
        Gson gson = new Gson();
        String json = gson.toJson(state);
        editor.putString("APPLICATION_STATE", json);
        editor.apply();
    }

    public static GeoTracker loadApplicationState(Context context){
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE);
        Gson gson = new Gson();
        GeoTracker applicationState = gson.fromJson(sharedPreferences.getString("APPLICATION_STATE", "{}"), GeoTracker.class );
        return applicationState;
    }
}
