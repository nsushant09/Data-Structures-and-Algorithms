package designpatterns.observer.weather_o_rama;

public interface DisplayObserver {
    void update(float temp, float humidity, float pressure);
}
