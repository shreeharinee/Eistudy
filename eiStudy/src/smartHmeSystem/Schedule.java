package smartHmeSystem;

public class Schedule {
	
	    private String deviceId;
	    private String time;
	    private String command;

	    public Schedule(String deviceId, String time, String command) {
	        this.deviceId = deviceId;
	        this.time = time;
	        this.command = command;
	    }

	    @Override
	    public String toString() {
	        return "Schedule [device=" + deviceId + ", time=" + time + ", command=" + command + "]";
	    }
	}

	
