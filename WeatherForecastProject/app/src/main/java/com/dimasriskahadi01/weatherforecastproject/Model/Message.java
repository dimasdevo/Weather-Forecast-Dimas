package com.dimasriskahadi01.weatherforecastproject.Model;

/**
 * Created by Dimas on 7/22/2017.
 */
public class Message {
    public String appID="5b537b33431750d98fd7faf4e24410eb";
    public String weatherCurrent="api.openweathermap.org/data/2.5/weather?";
    public String weatherforecastWeekly="http://api.openweathermap.org/data/2.5/forecast/daily";
    public String location;
    public double latitude;
    public double longtitude;

    public Message(String location) {
        this.location = location;
    }

    public Message(double latitude, double longtitude) {
        this.latitude = latitude;
        this.longtitude = longtitude;
    }

    public String getMessageCurrentCity(){
        if(location!=""){
            return weatherCurrent+"q="+location+"&APPID="+appID;
        }else
            return location;
    }

    public String getMessageCurrentCoordinate(){
        return weatherforecastWeekly+"lat="+latitude+"&lon="+latitude+"&APPID="+appID;
    }

    public String getMessageWeeklyCity() {
        if (location != "") {
            return weatherforecastWeekly + "q=" + location + "&APPID=" + appID;
        } else
            return location;
    }


}