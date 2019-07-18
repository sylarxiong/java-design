package com.jdk;

import com.common.DisplayElement;

import java.util.Observable;
import java.util.Observer;
//注意这里的Observer 来自java.util.Observer
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Double temperature;
    private Double pressure;
    private Double humidity;
    private Observable observable;
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs,Object object) {
        if(obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.pressure = weatherData.getPressure();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("温度："+temperature+"\n气压："+pressure+"\n湿度："+humidity);
    }
}
