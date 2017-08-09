package org.dymarket.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.dymarket.dao.IUserLoginDAO;
import org.dymarket.vo.UserRegister;

/**
* 数据访问层负责对数据库表的CRUD操作
* @author zzy 2017年8月8日
* @version
*/
public class UserLoginDAOImpl implements IUserLoginDAO {

	Connection conn ;
	PreparedStatement ps ;
	ResultSet rs;
	
	public UserLoginDAOImpl() {}
	public UserLoginDAOImpl(Connection conn) {
		this.conn = conn;
	}
	@Override
	public int insert(UserRegister ur) {
		String sql = "insert into user_base(login_name,login_password,email,phone_number,register_date)values(?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, ur.getLoginName());
			ps.setString(2, ur.getLoginPassword());
			ps.setString(3, ur.getEmail());
			ps.setString(4, ur.getPhoneNumber());
			ps.setTimestamp(5, new java.sql.Timestamp(ur.getRegisterDate().getTime()));
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return 0;
	}
	@Override
	public UserRegister find(String userName) {
		String sql = "select login_password from user_base where login_name = ?";
		UserRegister ur = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
			rs = ps.executeQuery();
			if (rs.next()) {
				ur = new UserRegister();
				ur.setLoginPassword(rs.getString(1));
			}
			return ur;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ur;
	}

}
