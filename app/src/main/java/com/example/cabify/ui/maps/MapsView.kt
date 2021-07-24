package com.example.cabify.ui.maps

import com.google.android.gms.maps.model.LatLng

interface MapsView {
    fun showNearbyCabs(latLngList: List<LatLng>)

}