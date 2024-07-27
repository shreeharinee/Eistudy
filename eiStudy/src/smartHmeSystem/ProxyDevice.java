package smartHmeSystem;

public class ProxyDevice implements Device {
    private Device device;

    public ProxyDevice(Device device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
       
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public String getStatus() {
        return device.getStatus();
    }

    @Override
    public String getId() {
        return device.getId();
    }
}

