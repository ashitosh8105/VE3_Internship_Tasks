package com.crm.FileUtility;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties 
{
	public static String getData(String key) throws IOException 
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\main\\resources\\VE3_Login.properties");
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}
}
