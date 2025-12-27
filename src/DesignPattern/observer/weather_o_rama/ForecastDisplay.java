package designpatterns.observer.weather_o_rama;

public class ForecastDisplay implements DisplayElement, DisplayObserver {

    private Subject<DisplayObserver> weatherData;
    private String displayMessage;

    ForecastDisplay(Subject<DisplayObserver> weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast : " + displayMessage);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if (pressure > 30) {
            displayMessage = "Improving weather on the way";
        } else {
            displayMessage = "Watch out for cooler, rainy weather";
        }
        display();
    }
}
