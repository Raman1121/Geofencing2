package com.example.raman.geofencing2;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by raman on 11/7/17.
 */

public class constants {

    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS = 12 * 60 * 60 * 1000;
    public static final float GEOFENCE_RADIUS_IN_METERS = 20;

    public static final HashMap<String, LatLng> LANDMARKS = new HashMap<String, LatLng>();
    static {
        // San Francisco International Airport.
        LANDMARKS.put("Moscone South", new LatLng(37.783888,-122.4009012));

        // Googleplex.
        LANDMARKS.put("Japantown", new LatLng(37.785281,-122.4296384));

        // Test
        LANDMARKS.put("SFO", new LatLng(37.621313,-122.378955));

        LANDMARKS.put("HOME", new LatLng(28.6020440, 77.0539110));
    }
}
