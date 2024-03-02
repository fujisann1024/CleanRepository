package org.example.disignpattern.observer.exam;

public class WatherStation {

    public static void main(String[] args){
        //Subject
        var weatherData = new WeatherData();

        //Observer
        var currentConditionDisplay = new CurrentConditionsDisplay(weatherData);
        var statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);

    }

}
