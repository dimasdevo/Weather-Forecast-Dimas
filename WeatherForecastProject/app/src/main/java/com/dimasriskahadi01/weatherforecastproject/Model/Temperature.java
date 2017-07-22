package com.dimasriskahadi01.weatherforecastproject.Model;

/**
 * Created by Dimas on 7/22/2017.
 */
public class Temperature {
    public double temperatureCurrent;
    public double temperatureMin;
    public double temperatureMax;

    public Temperature(double temperatureCurrent, double temperatureMin, double temperatureMax) {
        this.temperatureCurrent = temperatureCurrent;
        this.temperatureMin = temperatureMin;
        this.temperatureMax = temperatureMax;
    }

    public double getTemperatureCurrent() {
        return temperatureCurrent;
    }

    public double getTemperatureMin() {
        return temperatureMin;
    }

    public double getTemperatureMax() {
        return temperatureMax;
    }
}
