package javaprep.singleton.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UsingSerializable {

	public static void main(String[] args) {
		
		// If we use Serializable we have to make sure that the Singleton class implements serializable
		Singleton instance1 = Singleton.getInstance();
		
		try {
			// Writing the instance into a file
			FileOutputStream fos = new FileOutputStream("object.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(instance1);
			oos.close();
			
			// Reading the file to create and object
			FileInputStream fis = new FileInputStream("object.ser");
			ObjectInput ois = new ObjectInputStream(fis);
			Singleton instance2 = (Singleton)ois.readObject();
			
			System.out.println(instance1);
			System.out.println(instance2);
			// Hashcode proves they are both
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Let's try the same with Secured Singleton
		// If we use Serializable we have to make sure that the Singleton class implements serializable
		SecuredSingleton securedInstance1 = SecuredSingleton.getInstance();
		try {
			// Writing the instance into a file
			FileOutputStream fos = new FileOutputStream("object.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(securedInstance1);
			oos.close();
			
			// Reading the file to create and object
			FileInputStream fis = new FileInputStream("object.ser");
			ObjectInput ois = new ObjectInputStream(fis);
			SecuredSingleton securedInstance2 = (SecuredSingleton)ois.readObject();
			
			System.out.println(securedInstance1);
			System.out.println(securedInstance2);
			// Hashcode proves they are both
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		

	}

}
