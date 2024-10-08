package com.learning.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = new FileInputStream("application.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		System.out.println(properties);
		String userName = properties.getProperty("userName");
		String password = properties.getProperty("password");
		System.out.println("UserName :" + userName);
		System.out.println("Password :" + password);
		fileInputStream.close();
	}

}
