package com.hqyj.taotaoshopping.system.model;

import java.util.Arrays;
import java.util.Date;

/**
 * <p>
 * 用户
 * </p>
 * 
 * @Copyright (C),华清远见
 * @author zlf
 * @Date:2018年12月10日
 */
public class User {
	/** 用户ID */
	private int userId;
	/** 名称 */
	private String name;
	/** 年龄 */
	private String age;
	/** 性别 */
	private String sex;
	/** 爱好 */
	private String hobby;
	/** 登录名 */
	private String userName;
	/** 密码 */
	private String password;
	/** 创建时间 */
	private Date create_time;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", name='" + name + '\'' +
				", age='" + age + '\'' +
				", sex='" + sex + '\'' +
				", hobby='" + hobby + '\'' +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", create_time=" + create_time +
				'}';
	}
}
