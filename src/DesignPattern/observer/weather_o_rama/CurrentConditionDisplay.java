package designpatterns.observer.weather_o_rama;

public class CurrentConditionDisplay implements DisplayElement, DisplayObserver {

    private float temperature;
    private float humidity;
    private Subject<DisplayObserver> weatherData;

    CurrentConditionDisplay(Subject<DisplayObserver> weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions : " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
