package smartHmeSystem;

public class Door implements Device {
    private String id;
    private boolean isLocked;

    public Door(String id) {
        this.id = id;
        this.isLocked = true;
    }

    
    public void turnOn() {
        // Unlock the door
        isLocked = false;
    }

    @Override
    public void turnOff() {
        // Lock the door
        isLocked = true;
    }

    @Override
    public String getStatus() {
        return "Door " + id + " is " + (isLocked ? "Locked" : "Unlocked");
    }

    @Override
    public String getId() {
        return id;
    }
}
