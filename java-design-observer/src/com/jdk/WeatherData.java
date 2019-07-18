package com.jdk;

import java.util.Observable;

public class WeatherData extends Observable {
    private Double temperature;
    private Double pressure;
    private Double humidity;

    public WeatherData() {
    }


    public void measurementsChanged() {
        setChanged();//改变通知状态
        notifyObservers();//通知观察者们
    }

    public void setMeasurements(Double temperature, Double pressure, Double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }

    public Double getTemperature() {
        return temperature;
    }

    public Double getPressure() {
        return pressure;
    }

    public Double getHumidity() {
        return humidity;
    }
}
