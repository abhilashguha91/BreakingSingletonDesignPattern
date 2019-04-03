package javaprep.singleton.demo;

import java.io.Serializable;

public class SecuredSingleton implements Serializable, Cloneable{
	
	private static SecuredSingleton instance = null;
	private SecuredSingleton() {
		// This we add when we do not want the instance to be recreated by Reflection API
		
		// There are two ways to deal with this
		// 1. throw new IllegalArgumentException
		if(instance!=null) {
		throw new IllegalArgumentException("Get out of my private constructor!");
		//or 2. System.exit(0) this will stop the execution of the code,
		//System.exit(0);
		}
	}
	public static SecuredSingleton getInstance() {
		if(instance == null) {
			instance = new SecuredSingleton();
		}
		return instance;
	}
	
	// This protects it against serialization
	Object readResolve() {
		return instance;
	}
	
	// We need to override the clone method of the Object class
	public Object clone() throws CloneNotSupportedException {
		// This protects it from getting two instances when cloned.
		return getInstance();
		
	}
	

}
