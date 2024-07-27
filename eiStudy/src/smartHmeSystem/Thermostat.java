package smartHmeSystem;

public class Thermostat implements Device {
    private String id;
    private int temperature;

    public Thermostat(String id, int temperature) {
        this.id = id;
        this.temperature = temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        // Additional logic for turning on the thermostat
    }

    @Override
    public void turnOff() {
        // Additional logic for turning off the thermostat
    }

    @Override
    public String getStatus() {
        return "Thermostat " + id + " is set to " + temperature + " degrees";
    }

    @Override
    public String getId() {
        return id;
    }
}

