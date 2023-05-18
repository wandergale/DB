package application;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DB;

public class Program {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM cliente");
			
			while (rs.next()) {
				System.out.println("login: "+rs.getString("login")+ ", nome: "+rs.getString("nome"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
