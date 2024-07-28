package com.subh.dao;

import java.sql.*;

import com.subh.entities.client;

public class dao {
	
	 Connection con;
	
	 public dao(Connection con){
		this.con = con;
	}
	
	public boolean save(client c) {
		boolean f = false;
		
		try {
		   
			String query = "insert into data(id,p_name,p_details,p_quantity,p_m) values (?,?,?,?,?)";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, c.getId());
			pst.setString(2, c.getP_name());
			pst.setString(3, c.getP_details());
			pst.setInt(4, c.getP_quantity());
			pst.setString(5, c.getP_m());
            int row = pst.executeUpdate();

            if(row > 0) f = true;
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.print(e.getLocalizedMessage());
		}
		
		return f;
		
	}
	
	public String[] get(String name) {
		//System.out.print(id);
		String[] client = new String[1];
		int i = 0;
		try {
			String query = "select * from client where cname = ?";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, name);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				//System.out.println("Dept:  "+rs.getString(2));
				//client[i++] = rs.getString("pass");
				client[i++] = rs.getString("cname");
				//client[i++] = rs.getString("dept");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return client;
	}
	
	

}
