package creationalPattern;

public class SingletonPattern {
	 public static void main(String[] args) {
	     // Get the single instance of the Singleton class
	     Singleton singleton = Singleton.getInstance();

	     // Call a method on the Singleton instance
	     singleton.showMessage(); // Output: Hello, I am a Singleton!
	 }
}
