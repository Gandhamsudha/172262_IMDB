package com.sts.Dao;


	import java.sql.Connection;

	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

import com.sts.jdbc.ConnectionFactory;
import com.sts.pojo.Movies;
	
	public class MoviesDao {
	
		
		public int insert(Movies mov) throws SQLException {
			String query="insert into mov values(?,?,?)";
			Connection conn =ConnectionFactory.getConnection();
			PreparedStatement pStatement= conn.prepareStatement(query);
			pStatement.setString(1, mov.getHero());
			pStatement.setString(2, mov.getHeroine());
			pStatement.setString(3, mov.getGenre());
			
			int output=pStatement.executeUpdate();
			return output;
			
		}
		
	public Movies read(String Hero) throws SQLException {
			String query="select * from mov where Hero= ?";
			Movies mov=null;
			Connection conn = ConnectionFactory.getConnection();
			PreparedStatement pStatement= conn.prepareStatement(query);
			pStatement.setString(1, "CHARAN");
			ResultSet resultSet=pStatement.executeQuery();
			while(resultSet.next()) {
				mov=new Movies();
				mov.setHero(resultSet.getString("Hero"));
			}
			return mov;
		}
				public static void main(String[] args) {
			try {
			
				System.out.println(new  MoviesDao().read("Hero"));
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

	}


