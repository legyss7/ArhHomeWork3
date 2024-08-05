package org.lesson3;

import java.awt.*;

public class Harvester extends Car implements Fueling, Wiping {

//    private RefuelingStation refuelingStation;
    private Refueling refueling;

    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
    }

//    public void setRefuelingStation(RefuelingStation refuelingStation) {
//        this.refuelingStation = refuelingStation;
//    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    public void sweeping() {
        System.out.println("Атомобиль метет улицу.");
    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel() {
        if (refueling != null) {
            refueling.fuel(fuelType);
        }
    }

    @Override
    public void wipMirrors() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }
}
