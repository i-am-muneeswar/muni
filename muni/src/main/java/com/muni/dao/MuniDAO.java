package com.muni.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.muni.entity.MuniUser;

public class MuniDAO implements MuniDAOInterface {

	public int createProfileDAO(MuniUser mu) {
		
		int i = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			
			//PreparedStatement ps = con.prepareStatement("insert into MuniUser values(?,?,?,?)");
			
			CallableStatement ps = con.prepareCall("{call MuniProcedure(?,?,?,?)}");
			ps.setString(1, mu.getName());
			ps.setString(2, mu.getPassword());
			ps.setString(3, mu.getEmail());
			ps.setString(4, mu.getAddress());
			
			i = ps.executeUpdate();
			
		}
		
		catch (Exception e){
			e.printStackTrace();
		}
			
		return i;
		
	}

}
