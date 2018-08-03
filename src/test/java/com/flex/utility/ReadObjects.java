package com.flex.utility;

import java.io.File; 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.log4testng.Logger;


public class ReadObjects {
	
	public static Properties p = new Properties();
	
	public static Properties getObjectRepository(String strObjectFileName) throws IOException {
		
 	File objFilePath = new File (System.getProperty("user.dir"));
 	
 	String objFileNamePath = "\\src\\test\\java\\com\\flex\\objectproperties\\";
 	
 	Logger logger = Logger.getLogger(Utils.class);
 	
 	logger.info("this is a sample log message from ReadObjects.class.");
 	
 	System.out.println("Inside Properties file");
 		
 		InputStream stream = new FileInputStream(new File(objFilePath+objFileNamePath+strObjectFileName));
 		//Load all objects
 		p.load(stream);		
 		System.out.println("Outside Properties file");
 		return p;
 		
 		
 		
 	}
}
