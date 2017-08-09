package org.dymarket.service.factory;
/**
* 
* @author zzy 2017年8月8日
* @version
*/

import org.dymarket.service.IUserLoginService;
import org.dymarket.service.impl.UserLoginServiceImpl;

public class ServiceFactory {
	public static IUserLoginService getIUserLoginServiceInstance() {
		return new UserLoginServiceImpl();
	}
}
