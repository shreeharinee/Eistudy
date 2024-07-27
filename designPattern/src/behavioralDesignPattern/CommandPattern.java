package behavioralDesignPattern;

class Light {
	 public void turnOn() {
	     System.out.println("Light is ON");
	 }
	 public void turnOff() {
	     System.out.println("Light is OFF");
	 }
	}

	interface Command {
	 void execute();
	}

	//ConcreteCommand class
	class LightOnCommand implements Command {
	 private Light light;

	 public LightOnCommand(Light light) {
	     this.light = light;
	 }

	 @Override
	 public void execute() {
	     light.turnOn();  // Perform the action on the receiver
	 }
	}

	//Main class
	public class CommandPattern {
	 public static void main(String[] args) {
	     Light light = new Light();              // Create a Light instance
	     Command lightOn = new LightOnCommand(light);  // Create a command to turn on the light

	     lightOn.execute(); 
	 }
	}
