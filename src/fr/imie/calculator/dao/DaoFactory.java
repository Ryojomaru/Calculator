package fr.imie.calculator.dao;

import fr.imie.calculator.dao.jdbc.JdbcDaoHistory;
import fr.imie.calculator.utils.ConnectionManager;

public class DaoFactory {

	private DaoFactory(){	
	}
	
	public static DaoHistory getDaoHistory() {
        return new JdbcDaoHistory(ConnectionManager.getConnection());
    }
	
}
