package javaprep.singleton.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UsingReflectionAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton instance1 = Singleton.getInstance();
		// To use the reflection API we will get the constructor of the class and then change it's accessibility
		// No changes needed in base Singleton class for this method.
		Class singletonReflection = Singleton.class;
		Singleton instance2 = null;
		try {
			for(Constructor constructor : singletonReflection.getDeclaredConstructors()) {
				constructor.setAccessible(true);
				instance2 = (Singleton)constructor.newInstance(null);
			}
			
			
			
			System.out.println(instance1);
			System.out.println(instance2);
			// Seperate objects show that two instances are created.
			
		} catch (SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SecuredSingleton securedInstance1 = SecuredSingleton.getInstance();
		// To use the reflection API we will get the constructor of the class and then change it's accessibility
		// No changes needed in base Singleton class for this method.
		Class securedSingletonReflection = SecuredSingleton.class;
		SecuredSingleton securedInstance2 = null;
		try {
			for(Constructor constructor : securedSingletonReflection.getDeclaredConstructors()) {
				constructor.setAccessible(true);
				securedInstance2 = (SecuredSingleton)constructor.newInstance(null);
			}
			
		} catch (SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(securedInstance1);
		System.out.println(securedInstance2);
		// Seperate objects show that two instances are created.
		
	}

}
