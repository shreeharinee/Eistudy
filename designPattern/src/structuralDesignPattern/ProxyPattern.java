package structuralDesignPattern;

interface Subject {
	 void request(); // Method that will be called through proxy
	}

	//RealSubject class
	class RealSubject implements Subject {
	 public void request() {
	     System.out.println("RealSubject: Handling request."); // Actual implementation of the request
	 }
	}

	//Proxy class
	class Proxy implements Subject {
	 private RealSubject realSubject; // Reference to the RealSubject

	 public void request() {
	     // Lazy initialization: Create the RealSubject object only when needed
	     if (realSubject == null) {
	         realSubject = new RealSubject();
	     }
	     // Additional behavior before delegating the request
	     System.out.println("Proxy: Logging access."); // Log access to the real subject
	     realSubject.request(); // Delegate the request to the RealSubject
	 }
	}

	//Main class
	public class ProxyPattern {
	 public static void main(String[] args) {
	     // Create a Proxy object
	     Subject proxy = new Proxy();
	     // Call the request method on the Proxy
	     proxy.request(); // Output: Proxy: Logging access. \n RealSubject: Handling request.
	 }
	}
