package org.dymarket.dao;

import org.dymarket.vo.UserRegister;

/**
* 数据访问层接口
* @author zzy 2017年8月8日
* @version
*/
public interface IUserLoginDAO {
	/**
	 * 执行数据库插入操作
	 * @param ur 要插入数据的包装类
	 * @return 0，表示插入失败；1，表示插入成功
	 */
	int insert(UserRegister ur);
	/**
	 * 根据指定用户名查询执行查询操作，
	 * @param userName 指定的用户名
	 * @return 包含用户名和密码的封装类，若为null,则数据库不存在指定用户名的数据
	 */
	UserRegister find(String userName);

	 
}
