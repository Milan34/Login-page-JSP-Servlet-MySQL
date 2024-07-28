package com.subh.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection_provider {
	
	private static Connection con;
	
	public static Connection getconnection() {
		
		if(con == null) {
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String url = "jdbc:mysql://localhost:3306/practice";
				
				 con = DriverManager.getConnection(url,"root","root");
				
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		return con;
	}

}
