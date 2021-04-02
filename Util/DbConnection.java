package com.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	public static Connection con=null;
	public static String url="jdbc:postgresql://localhost:5432/assignment6";
	//public static String url="jdbc:postgresql://localhost:5432/test";
	public static String uname="postgres";
	public static String pass="postgres";
	public static Connection getConnection()
	{
		if(con==null) {
			try {
				Class.forName("org.postgresql.Driver");
				con=DriverManager.getConnection(url, uname, pass);
				System.out.println("Successfull");
			}catch(Exception e) {
				System.out.println(e);
				System.out.println("Error");
			}
		}
		return con;
	}
}
