package creationalPattern;

interface Button {
	 void render(); // Method to render the button
	}

	//ConcreteProduct
	class WindowsButton implements Button {
	 public void render() {
	     System.out.println("Rendering Windows Button");
	 }
	}

	//ConcreteProduct
	class MacButton implements Button {
	 public void render() {
	     System.out.println("Rendering Mac Button");
	 }
	}

	//Creator with Factory Method
	abstract class Dialog {
	 public abstract Button createButton(); // Factory method to create a button

	 public void renderButton() {
	     Button button = createButton(); // Use factory method to get a button
	     button.render(); // Render the button
	 }
	}

	//ConcreteCreator
	class WindowsDialog extends Dialog {
	 public Button createButton() {
	     return new WindowsButton(); // Return a WindowsButton
	 }
	}

	//Main class to demonstrate usage
	public class FactoryMethod {
	 public static void main(String[] args) {
	     Dialog dialog = new WindowsDialog(); // Instantiate a concrete creator
	     dialog.renderButton(); // Render the button using the factory method
	 }
	}
