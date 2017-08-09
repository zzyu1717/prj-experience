package org.dymarket.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dymarket.service.IUserLoginService;
import org.dymarket.service.factory.ServiceFactory;
import org.dymarket.vo.UserRegister;

/**
* 
* @author zzy 2017年8月8日
* @version
*/
@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	/**
	 * 所有用户共享一个loginService
	 */
	IUserLoginService loginService = ServiceFactory.getIUserLoginServiceInstance();
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String status = request.getParameter("status");
		if ("userRegister".equals(status)) {
			doRegisterUser(request, response);
		} else if ("userLogin".equals(status)) {
			doLogin(request, response);
		}
	}
	
	/**
	 * 用户登录操作
	 * @param request
	 * @param response
	 */
	private void doLogin(HttpServletRequest request, HttpServletResponse response) {
		String userName = request.getParameter("userName");
		String loginPassword = request.getParameter("loginPassword");
		UserRegister ur = loginService.getByName(userName);
		HttpSession session = request.getSession();
		if (ur == null) {
			// 用户名不存在
			try {
				session.setAttribute("loginStatus", "wrongName");
				response.sendRedirect(request.getContextPath() + "/jsp/user_login.jsp");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			if (loginPassword.equals(ur.getLoginPassword())) {
				// 登录成功
				session.setAttribute("loginStatus", "loginSuccess");
				session.setAttribute("userName", userName);
				try {
					response.sendRedirect(request.getContextPath() + "/index.jsp");
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				// 密码错误
				session.setAttribute("loginStatus", "wrongPassword");
				try {
					response.sendRedirect(request.getContextPath() + "/jsp/user_login.jsp");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 用户注册操作
	 * @param request
	 * @param response
	 */
	private void doRegisterUser(HttpServletRequest request, HttpServletResponse response) {
		UserRegister ur = new UserRegister();
		ur.setLoginName(request.getParameter("usernme"));
		ur.setLoginPassword(request.getParameter("userPassword"));
		ur.setEmail(request.getParameter("email"));
		ur.setPhoneNumber(request.getParameter("phoneNumber"));
		ur.setRegisterDate(new Date());
		
		loginService.save(ur);
	}
}
