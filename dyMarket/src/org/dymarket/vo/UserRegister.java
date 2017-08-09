package org.dymarket.vo;

import java.util.Date;

/**
* 封装注册页面数据
* @author zzy 2017年8月8日
* @version
*/
public class UserRegister {
	private String loginName;
	private String loginPassword;
	private String email;
	private String phoneNumber;
	private Date registerDate;
	
	public UserRegister() {}
	
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	@Override
	public String toString() {
		return "UserRegister [loginName=" + loginName + ", loginPassword=" + loginPassword + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", registerDate=" + registerDate + "]";
	}
}
