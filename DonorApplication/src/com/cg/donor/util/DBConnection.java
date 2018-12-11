package com.cg.donor.util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {

public static Connection getConnection() throws FileNotFoundException
		{
			try {
			FileInputStream fis=new FileInputStream("resources/db.properties");
			Properties p=new Properties();
			
			String a=p.getProperty("url");
			
			String b=p.getProperty("driver");
			
			String c=p.getProperty("username");
			
			String d=p.getProperty("password");
			
			Class.forName(b);
			Connection c1=DriverManager.getConnection(a, c, d);
			return c1;
			
			}
			catch(Exception e) {
				System.out.println(e);
			}
			return getConnection();
	}
}

