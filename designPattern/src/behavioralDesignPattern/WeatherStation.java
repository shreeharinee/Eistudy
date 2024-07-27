package behavioralDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    // List to hold registered observers
    private List<Observer> observers = new ArrayList<>();
    private float temperature;  // Variable to hold the current temperature

    // Method to register an observer
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // Method to notify all registered observers
    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }

    // Method to set a new temperature and notify observers
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    // Interface for Observer
    public interface Observer {
        void update(float temperature);  // Method to update observers with the new temperature
    }

    // Main class to demonstrate the Observer pattern
    public static class Main {
        public static void main(String[] args) {
            WeatherStation station = new WeatherStation();  

            // Define an observer 
            WeatherStation.Observer display = new WeatherStation.Observer() {
                @Override
                public void update(float temperature) {
                    System.out.println("Current temperature: " + temperature);  // Display the updated temperature
                }
            };

            station.registerObserver(display);  // Register the observer

            // Change the temperature and observe the update
            station.setTemperature(25.5f);  
        }
    }
}
