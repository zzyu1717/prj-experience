package org.dymarket.service.impl;

import java.sql.Connection;
import java.sql.SQLException;

import org.dymarket.dao.factory.DAOFactory;
import org.dymarket.service.IUserLoginService;
import org.dymarket.util.DBUtil;
import org.dymarket.vo.UserRegister;

/**
* 登录模块服务层实现，负责数据库连接的开启与关闭
* @author zzy 2017年8月8日
* @version
*/
public class UserLoginServiceImpl implements IUserLoginService {

	@Override
	public boolean save(UserRegister ur) {
		Connection conn = DBUtil.getConnection();
		int result = DAOFactory.getIUserLoginDAOInstance(conn).insert(ur);
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result > 0 ? true : false;
	}


	@Override
	public UserRegister getByName(String userName) {
		Connection conn = DBUtil.getConnection();
		UserRegister ur = DAOFactory.getIUserLoginDAOInstance(conn).find(userName);
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ur;
	}

}
