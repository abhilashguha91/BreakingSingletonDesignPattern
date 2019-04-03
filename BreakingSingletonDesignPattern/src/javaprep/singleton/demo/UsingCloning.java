package javaprep.singleton.demo;

public class UsingCloning {

	public static void main(String[] args) {
		
		// To clone an object we need to make the Singleton class implement the Cloneable interface
		// Also the clone() method from the Object class needs to be overriden
		try {
			Singleton instance1 = Singleton.getInstance();
			Singleton instance2 = (Singleton)instance1.clone();
			
			System.out.println(instance1);
			System.out.println(instance2);
			// Seperate objects show that two instances are created.
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		// To clone an object we need to make the Singleton class implement the Cloneable interface
		// Also the clone() method from the Object class needs to be overriden
		// Let's try the same with SecuredSingleton
		try {
			SecuredSingleton securedSingleton1 = SecuredSingleton.getInstance();
			SecuredSingleton securedSingleton2 = (SecuredSingleton)securedSingleton1.clone();
			
			System.out.println(securedSingleton1);
			System.out.println(securedSingleton2);
			// Seperate objects show that two instances are created.
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		

	}

}
