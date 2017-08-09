package org.dymarket.dao.factory;

import java.sql.Connection;

import org.dymarket.dao.IUserLoginDAO;
import org.dymarket.dao.impl.UserLoginDAOImpl;

/**
* 
* @author zzy 2017年8月8日
* @version
*/
public class DAOFactory {
	public static IUserLoginDAO getIUserLoginDAOInstance(Connection conn) {
		return new UserLoginDAOImpl(conn);
	}
}
