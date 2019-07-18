package com.custom;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private Double temperature;
    private Double pressure;
    private Double humidity;
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        //通知观察者们
        for (Observer o : observers) {
            o.update(temperature, pressure, humidity);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(Double temperature, Double pressure, Double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }
}
