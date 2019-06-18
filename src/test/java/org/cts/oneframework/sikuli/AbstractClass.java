package org.cts.oneframework.sikuli;

import java.util.Properties;

import org.cts.oneframework.driver.Driver;
import org.sikuli.script.Screen;



public class AbstractClass {

	private static Properties PROPERTIES;


	public static String getProperty(String key) {
		return PROPERTIES.getProperty(key);
	}

	public static String get(String key) {
		//just to use short name
		return getProperty(key);
	}	

	public static String getPathFor(String file) {
		// Using substring for full path to remove first slash.
		// Sikuli bug on Windows
		String userDir = System.getProperty("user.dir");
		String path = userDir+"/screens/" +file;
		return path;
	}

	public static String path(String file) {
		return getPathFor(file);
	}	

}
