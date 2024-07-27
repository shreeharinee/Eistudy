package structuralDesignPattern;

interface Coffee {
	 String getDescription(); // Method to get the description of the coffee
	 double getCost();        // Method to get the cost of the coffee
	}

	//ConcreteComponent class
	class SimpleCoffee implements Coffee {
	 public String getDescription() {
	     return "Simple coffee"; // Basic description of the coffee
	 }

	 public double getCost() {
	     return 2.0; // Basic cost of the coffee
	 }
	}

	//Decorator class
	class MilkDecorator implements Coffee {
	 private Coffee coffee; // The Coffee object to which we are adding functionality

	 // Constructor takes a Coffee object and wraps it
	 public MilkDecorator(Coffee coffee) {
	     this.coffee = coffee;
	 }

	 // Adds additional description to the existing coffee description
	 public String getDescription() {
	     return coffee.getDescription() + ", milk"; // Append "milk" to the existing description
	 }

	 // Adds additional cost to the existing coffee cost
	 public double getCost() {
	     return coffee.getCost() + 0.5; // Add 0.5 to the existing cost
	 }
	}

	//Main class
	public class MainDecoratorPattern {
	 public static void DecoratorPattern(String[] args) {
	     Coffee coffee = new SimpleCoffee(); // Create a SimpleCoffee object
	     System.out.println(coffee.getDescription() + " $" + coffee.getCost()); // Output: Simple coffee $2.0

	     // Wrap the SimpleCoffee object with a MilkDecorator to add milk functionality
	     coffee = new MilkDecorator(coffee);
	     // Output: Simple coffee, milk $2.5
	     System.out.println(coffee.getDescription() + " $" + coffee.getCost());
	 }
	}
