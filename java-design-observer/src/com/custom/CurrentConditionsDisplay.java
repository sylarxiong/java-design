package com.custom;

import com.common.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Double temperature;
    private Double pressure;
    private Double humidity;
    private Subject weatherData;
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Double temperature, Double pressure, Double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("温度："+temperature+"\n气压："+pressure+"\n湿度："+humidity);
    }
}
