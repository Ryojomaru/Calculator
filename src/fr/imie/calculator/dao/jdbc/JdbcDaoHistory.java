package fr.imie.calculator.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fr.imie.calculator.dao.DaoHistory;

public class JdbcDaoHistory extends JdbcDao implements DaoHistory{

	public JdbcDaoHistory(Connection connection) {
		super(connection);
	}

	@Override
	public void intoDb(String string) {
		try (PreparedStatement stmt = getConnection().prepareStatement("INSERT INTO operations(operation) VALUES (?)")){
			stmt.setString(1, string);
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("A wild exception appeared !");
		}
		
	}
	
}
