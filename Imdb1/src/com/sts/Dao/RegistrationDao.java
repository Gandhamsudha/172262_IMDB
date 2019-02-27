package com.sts.Dao;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

import com.sts.jdbc.ConnectionFactory;
import com.sts.pojo.RegistrationPojo;

	public class RegistrationDao {
		
		public int insert(RegistrationPojo client) throws Exception {
			String query="insert into Registration values(?,?)";
			Connection conn =ConnectionFactory.getConnection();
			PreparedStatement pStatement= conn.prepareStatement(query);
			pStatement.setString(1,client.getUsername());
			pStatement.setString(2,client.getPassword());
			
			int output=pStatement.executeUpdate();
			return output;
			
		}
		public int read(String name,String pass) throws Exception {
			int i=0;
			String query="select COUNT(*) from Registration where username=? and password=?";
			Connection conn =ConnectionFactory.getConnection();
			PreparedStatement pStatement= conn.prepareStatement(query);
			pStatement.setString(1,name);
			pStatement.setString(2,pass);
			
			ResultSet output=pStatement.executeQuery();
			while(output.next()) {
				i=output.getInt(1);
			}
			return i;
		}
		
	
		  public static void main(String[] args) throws Exception {
			 RegistrationDao r=new RegistrationDao(); 
		 int w=r.insert(new RegistrationPojo("qwe","asd"));
		 System.out.println(w);
		  
		  }
		 
		
	}

