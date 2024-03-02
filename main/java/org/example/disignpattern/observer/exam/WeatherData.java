package org.example.disignpattern.observer.exam;


import java.util.ArrayList;
import java.util.List;

/**Subjectの実装クラス*/
public class WeatherData implements Subject {

    private List<Observer> observers;

    /**温度*/
    private float temperature;
    /**湿気*/
    private float humidity;
    /**気圧*/
    private float pressure;

    public WeatherData(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    /**すべてのObserverに状態を通知*/
    @Override
    public void notifyObserver() {
        for(var observer : observers){
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

    /**気象観測所から更新された測定値を取得するとObserverに通知する*/
    public void measurementChanged(){
        this.notifyObserver();
    }

    /**測定値を設定*/
    public void setMeasurements(float temperature, float humidity, float pressure){

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        this.measurementChanged();
    }

}
