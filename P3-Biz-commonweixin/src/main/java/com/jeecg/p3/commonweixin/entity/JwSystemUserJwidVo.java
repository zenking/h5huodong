package com.jeecg.p3.commonweixin.entity;

import org.jeecgframework.p3.core.utils.persistence.Entity;

public class JwSystemUserJwidVo implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 默认登录jwid的标识
	 */
	private String defaultFlag;
	/**
	 * 名称
	 */
	private String userName;
	/**
	 * 手机号
	 */
	private String opePhoneNum;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getOpePhoneNum() {
		return opePhoneNum;
	}
	public void setOpePhoneNum(String opePhoneNum) {
		this.opePhoneNum = opePhoneNum;
	}
	public String getId() {
	public String getDefaultFlag() {
		return defaultFlag;
	}
	public void setDefaultFlag(String defaultFlag) {
		this.defaultFlag = defaultFlag;
	}
}
