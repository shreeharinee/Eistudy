package smartHmeSystem;
import java.util.*;
public class SmartHomeSystem {
	
	    private Map<String, Device> devices = new HashMap<>();
	    private List<Schedule> schedules = new ArrayList<>();
	    private List<Trigger> triggers = new ArrayList<>();

	    public void addDevice(String type, String id, int initialTemperature) {
	        Device device = new ProxyDevice(DeviceFactory.createDevice(type, id, initialTemperature));
	        devices.put(id, device);
	    }

	    public void removeDevice(String id) {
	        devices.remove(id);
	    }

	    public void turnOnDevice(String id) {
	        devices.get(id).turnOn();
	    }

	    public void turnOffDevice(String id) {
	        devices.get(id).turnOff();
	    }

	    public void setSchedule(String id, String time, String command) {
	        schedules.add(new Schedule(id, time, command));
	    }

	    public void addTrigger(String condition, String action) {
	        triggers.add(new Trigger(condition, action));
	    }

	    public void checkTriggers() {
	        // Logic to check triggers and execute actions
	    }

	    public String getStatusReport() {
	        StringBuilder report = new StringBuilder();
	        for (Device device : devices.values()) {
	            report.append(device.getStatus()).append(".");
	        }
	        return report.toString();
	    }

	    public String getScheduledTasks() {
	        return schedules.toString();
	    }

	    public String getAutomatedTriggers() {
	        return triggers.toString();
	    }
	    
	    public Map<String, Device> getDevices() {
	        return devices; // Assume `devices` is a Map<String, Device>
	    }

	    }

	



