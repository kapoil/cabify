package com.example.cabify

import android.app.Application
import com.google.maps.GeoApiContext
import com.google.android.libraries.places.api.Places

class Cabify : Application() {

    override fun onCreate() {
        super.onCreate()
        Places.initialize(applicationContext, R.string.google_maps_key)
        Simulator.geoApiContext = GeoApiContext.Builder()
            .apiKey(R.string.google_maps_key)
            .build();
    }
}