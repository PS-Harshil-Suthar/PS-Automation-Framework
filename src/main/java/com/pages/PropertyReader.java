package com.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public String readProperty(String propertyname) {
		Properties prop = new Properties();
		String filename = "C:\\Users\\harshil.suthar\\eclipse-workspace\\PS-Swaglabs-Practice"
				+ "\\src\\main\\resources\\TestData\\testdata.properties";
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File(filename));
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String properyValue =  prop.getProperty(propertyname);
		return properyValue;
		
		
	}
	
}
