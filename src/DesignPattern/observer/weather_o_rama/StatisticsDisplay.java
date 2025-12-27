package designpatterns.observer.weather_o_rama;

import Kushwaha.OOP.Access.A;

import java.util.ArrayList;

public class StatisticsDisplay implements DisplayObserver, DisplayElement {

    private final ArrayList<Float> temperatureRecords;
    private final Subject<DisplayObserver> weatherData;

    StatisticsDisplay(Subject<DisplayObserver> weatherData) {
        this.weatherData = weatherData;
        temperatureRecords = new ArrayList<>();
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistic Display:");
        System.out.println("Min Temperature : " + getMinTemperature());
        System.out.println("Max Temperature : " + getMaxTemperature());
        System.out.println("Avg Temperature : " + getAvgTemperature());
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temperatureRecords.add(temp);
        display();
    }

    private float getMinTemperature() {

        if (isRecordNotValid())
            return 0;

        float minTemperature = temperatureRecords.get(0);
        for (float temperature : temperatureRecords) {
            if (temperature < minTemperature) {
                minTemperature = temperature;
            }
        }
        return minTemperature;
    }

    private float getMaxTemperature() {

        if (isRecordNotValid())
            return 0;

        float maxTemperature = temperatureRecords.get(0);
        for (float temperature : temperatureRecords) {
            if (temperature > maxTemperature) {
                maxTemperature = temperature;
            }
        }
        return maxTemperature;
    }

    private float getAvgTemperature() {
        if (isRecordNotValid())
            return 0;

        return sumOfTemperatures() / temperatureRecords.size();
    }

    private float sumOfTemperatures() {
        float sum = 0;
        for (float temperature : temperatureRecords) {
            sum += temperature;
        }
        return sum;
    }

    private boolean isRecordNotValid() {
        return temperatureRecords.isEmpty();
    }
}
