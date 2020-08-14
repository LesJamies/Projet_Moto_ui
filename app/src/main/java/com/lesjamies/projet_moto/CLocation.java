package com.lesjamies.projet_moto;

import android.location.Location;

public class CLocation extends Location {

    private boolean bUseMetricUnits = false;

    public CLocation(Location location) {
        this(Location, true);
    }

}
