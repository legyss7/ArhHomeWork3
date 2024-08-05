package org.lesson3;

import java.awt.*;

public abstract class Car {

    //region Constructors

    public Car(String make, String model, Color color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }


    //endregion

    //region Public Method

    //Движение
    public abstract void movement();

    // Обслуживаение
    public abstract void maintenance();

    // Переключение передач
    public abstract boolean gearShifting();

    // Включение фар
    public abstract boolean switchHeadlights();

    // Вклчючение дворников
    public abstract boolean switchWipers();

    // Подметать улицу
//    public abstract void sweeping();

    //
    public boolean switchFogLight() {
        fogLights = !fogLights;
        return fogLights;
    }

    protected void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    //endregion

    //region Private Fields

    // Марка автомобиля
    private String make;

    // Модель
    private String model;

    // Цвет
    private Color color;

    // Тип
    protected CarType type;

    // Число колёс
    private int wheelsCount;

    //Тип топлива
    protected FuelType fuelType;

    // Тип коробки передач
    private GearboxType gearboxType;

    // Объём двигателя
    private double engineCapacity;

    // Состояние противотуманных фар
    private boolean fogLights = false;

    //endregion

}
