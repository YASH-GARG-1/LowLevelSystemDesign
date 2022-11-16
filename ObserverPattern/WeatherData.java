package ObserverPattern;

import java.util.*;

public class WeatherData implements Subject{

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData()
    {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o)
    {
        observers.add(o);
    }

    public float getHumidity()
    {
        return humidity;
    }

    public void setHumidity(float humidity)
    {
        this.humidity = humidity;
    }

    public float getTemperature()
    {
        return temperature;
    }

    public void setTemperature(float temperature)
    {
        this.temperature = temperature;
    }

    public float getPressure()
    {
        return pressure;
    }

    public void setPressure(float pressure)
    {
        this.pressure = pressure;
    }

    public void removeObserver(Observer o)
    {
        observers.remove(o);
    }

    public void notifyObservers()
    {
        for(Observer observer : observers)
        {
            observer.update();
        }
    }

    public void measurementsChanged()
    {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
