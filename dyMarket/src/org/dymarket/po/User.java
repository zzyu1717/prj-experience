package org.dymarket.po;

import java.util.Date;

/**
* 用户个人资料，对应数据库用户基表
* @author zzy 2017年8月8日
* @version
*/
public class User {
	private int id;
	private int age;
	/**
	 * 1-->male,0-->female
	 */
	private int sex;
	private String loginName;
	private String realName;
	private String loginPassword;
	private String payPassword;
	private String email;
	private String address;
	private String phoneNumber;
	private Date lastLoginDate;
	/**
	 * 最近修改个人资料日期
	 */
	private Date lastModifyDate;
	private Date registerDate;
	
	public User() {};
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getPayPassword() {
		return payPassword;
	}
	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public Date getLastModifyDate() {
		return lastModifyDate;
	}
	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", sex=" + sex + ", loginName=" + loginName + ", realName="
				+ realName + ", loginPassword=" + loginPassword + ", payPassword=" + payPassword + ", email=" + email
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", lastLoginDate=" + lastLoginDate
				+ ", lastModifyDate=" + lastModifyDate + ", registerDate=" + registerDate + "]";
	}
}
