package com.sts.Dao;




import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Calendar;

import com.sts.jdbc.ConnectionFactory;
import com.sts.pojo.Movies;

public class MoviesDao {



	
	public int insert(Movies mov) throws SQLException {
		String query="insert into mov values(?,?,?,?,?,?,?,?)";
		Connection conn =ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setString(1, mov.getHero());
		pStatement.setString(2, mov.getHeroine());
		pStatement.setString(3, mov.getGenre());
		
		int output=pStatement.executeUpdate();
		return output;
		
	}
	public int delete(String Hero)throws Exception {
		Connection conn=ConnectionFactory.getConnection();
		String sql="delete from mov  where Hero=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,"Hero");
		int x=ps.executeUpdate();
		return x;
		
		
		
	}

	public Movies read(int empNo) throws SQLException {
		String query="select * from mov where Hero= ?";
		Movies mov=null;
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setString(1, "Hero");
		ResultSet resultSet=pStatement.executeQuery();
		while(resultSet.next()) {
		//	mov=new Movies();
			mov.setGenre(resultSet.getString("Genre"));
		}
		return mov;
	}
	public static void main(String[] args) throws SQLException {
	}

}
