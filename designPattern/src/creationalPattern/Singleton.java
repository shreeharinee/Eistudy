package creationalPattern;

//Singleton class
public class Singleton {
// Step 1: Private static variable to hold the single instance
private static Singleton instance;

// Step 2: Private constructor to prevent instantiation from other classes
private Singleton() {}

// Step 3: Public static method to provide access to the single instance
public static Singleton getInstance() {
   if (instance == null) { // Lazy initialization
       instance = new Singleton(); // Create the instance if it doesn't exist
   }
   return instance; // Return the single instance
}

// Example method to show the functionality of the Singleton
public void showMessage() {
   System.out.println("Hello, I am a Singleton!");
}
}

