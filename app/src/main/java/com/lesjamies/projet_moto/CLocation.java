package com.lesjamies.projet_moto;

import android.location.Location;

public class CLocation extends Location {

    private boolean bUseMetricUnits = false;

    public CLocation(Location location) {
        this(Location,
                true);
    }

    public CLocation(Location location, boolean bUseMetricUnits) {
        super(location);
        this.bUseMetricUnits = bUseMetricUnits;
    }

    public boolean getUseMetricUnits() {
        return this.bUseMetricUnits;
    }

    public void setUnsMetricUnits(boolean bUseMetricUnits) {
        this.bUseMetricUnits = bUseMetricUnits;
    }

    @Override
    public float distanceTo(Location dest) {
        float nDistance = super.distanceTo(dest);

        if(!this.getUseMetricUnits()) {
            //askip ca converti les metres en feet donc on pourra add l'option
            nDistance = nDistance * 3.28083989501312f;
        }

        return nDistance;
    }

    @Override
    public double getAltitude() {
        double nAltitude = super.getAltitude();

        if(!this.getUseMetricUnits()) {
            //askip ca converti les metres en feet donc on pourra add l'option
            nAltitude = nAltitude * 3.28083989501312d;
        }

        return nAltitude;
    }

    @Override
    public float getSpeed() {
        float nSpeed = super.getSpeed() *3.6f;

        if(!this.getUseMetricUnits()) {
            //askip ca converti les metres/secs en miles/h donc on pourra add l'option
            nSpeed = super.getSpeed() * 2.23693629f;
        }

        return nSpeed;
    }

    @Override
    public float getAccuracy() {
        float nAccuracy = super.getAccuracy();

        if(!this.getUseMetricUnits()) {
            //askip ca converti les metres en feet donc on pourra add l'option
            nAccuracy = nAccuracy * 3.28083989501312f;
        }

        return nAccuracy;
    }
}
