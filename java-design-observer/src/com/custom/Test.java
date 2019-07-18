package com.custom;

public class Test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(1.0,2.0,3.0);
        //weatherData.removeObserver(currentConditionsDisplay);
        weatherData.setMeasurements(4.0,5.0,6.0);
    }
}
