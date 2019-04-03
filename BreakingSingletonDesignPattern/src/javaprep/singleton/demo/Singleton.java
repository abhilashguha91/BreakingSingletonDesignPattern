package javaprep.singleton.demo;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{
	
	private static Singleton instance = null;
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	// We need to override the clone method of the Object class
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

}
