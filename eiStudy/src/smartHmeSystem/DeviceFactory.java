package smartHmeSystem;

public class DeviceFactory {
	
	    public static Device createDevice(String type, String id, int initialTemperature) {
	        switch (type.toLowerCase()) {
	            case "light":
	                return new Light(id);
	            case "thermostat":
	                return new Thermostat(id, initialTemperature);
	            case "door":
	                return new Door(id);
	            default:
	                throw new IllegalArgumentException("Unknown device type");
	        }
	    }
	}


