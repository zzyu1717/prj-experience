package org.dymarket.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
* 
* @author zzy 2017年8月8日
* @version
*/
public class DBUtil {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Properties ps = new Properties();
		loadFile(ps);
		String url = ps.getProperty("org.dymarket.url");
		String user = ps.getProperty("org.dymarket.user");
		String password = ps.getProperty("org.dymarket.password");
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 配置数据库连接参数文件加载路径
	 * @param ps
	 */
	public static void loadFile(Properties ps) {
		try {
			ps.load(DBUtil.class.getResourceAsStream("/org/dymarket/resource/dbConnectParam.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
