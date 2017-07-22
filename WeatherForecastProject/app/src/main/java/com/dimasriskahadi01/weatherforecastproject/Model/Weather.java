package com.dimasriskahadi01.weatherforecastproject.Model;

/**
 * Created by Dimas on 7/22/2017.
 */
public class Weather {
    String weatherName;
    String description;
    String icon;
    double windSpeed;
    double humidity;
    double pressure;
    Temperature temperature;

    public Weather(String weatherName, String description, String icon, double windSpeed, double humidity, double pressure, double temperatureCur, double temperatureMin, double temperaturMax) {
        this.weatherName = weatherName;
        this.description = description;
        this.icon = icon;
        this.windSpeed = windSpeed;
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = new Temperature(temperatureCur,temperatureMin,temperaturMax);
    }

    public String getWeatherName() {
        return weatherName;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public Temperature getTemperature() {
        return temperature;
    }
}
