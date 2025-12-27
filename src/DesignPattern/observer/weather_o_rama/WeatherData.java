package designpatterns.observer.weather_o_rama;

import java.util.LinkedList;
import java.util.Observable;

public class WeatherData implements Subject<DisplayObserver> {

    private final LinkedList<DisplayObserver> displayObservers;
    private float temperature;
    private float humidity;
    private float pressure;

    WeatherData() {
        displayObservers = new LinkedList<>();
    }

    @Override
    public void registerObserver(DisplayObserver newObserver) {
        displayObservers.add(newObserver);
    }

    @Override
    public void removeObserver(DisplayObserver oldObserver) {
        displayObservers.remove(oldObserver);
    }

    @Override
    public void notifyObserver() {
        displayObservers.forEach(displayObserver -> {
            displayObserver.update(temperature, humidity, pressure);
        });
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
