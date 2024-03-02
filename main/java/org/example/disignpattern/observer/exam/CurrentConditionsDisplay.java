package org.example.disignpattern.observer.exam;


import java.util.ArrayList;
import java.util.List;

/**Observerの実装クラス(現在の観測値を表示)*/
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("現在の気温状況:温度" + this.temperature + "度"
                            + "温度" + this.humidity + "%");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.display();
    }
}
