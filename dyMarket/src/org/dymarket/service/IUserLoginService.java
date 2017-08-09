package org.dymarket.service;

import org.dymarket.vo.UserRegister;

/**
* 服务层接口
* @author zzy 2017年8月8日
* @version
*/
public interface IUserLoginService {
	/**
	 * 保存注册页面数据
	 * @param ur 页面数据封装类
	 * @return true, 保存成功；false,保存失败。
	 */
	boolean save(UserRegister ur);
	/**
	 * 用户登录，根据指定的用户名查找数据库是否存在对应的数据。
	 * 本次操作仅验证用户名是否存在
	 * @param userName 需要验证的用户名
	 * @return 包含登录密码的UerRegister类，若其为null,则用户名不存在，否则用户名存在，需要在servlet中进一步验证密码
	 */
	UserRegister getByName(String userName);
}
