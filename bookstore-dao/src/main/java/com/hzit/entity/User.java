package com.hzit.entity;

/**
 * 
 * @author renhao
 */
public class User {
	/**
	 *  编号
	 */
	private Integer userid;
	/**
	 *  用户名
	 */
	private String username;
	/**
	 *  密码
	 */
	private String password;
	/**
	 *  邮件
	 */
	private String email;
	/**
	 * 编号
	 * @param userid
	 */
	public void setUserid(Integer userid){
		this.userid = userid;
	}
	
    /**
     * 编号
     * @return
     */	
    public Integer getUserid(){
    	return userid;
    }
	/**
	 * 用户名
	 * @param username
	 */
	public void setUsername(String username){
		this.username = username;
	}
	
    /**
     * 用户名
     * @return
     */	
    public String getUsername(){
    	return username;
    }
	/**
	 * 密码
	 * @param password
	 */
	public void setPassword(String password){
		this.password = password;
	}
	
    /**
     * 密码
     * @return
     */	
    public String getPassword(){
    	return password;
    }
	/**
	 * 邮件
	 * @param email
	 */
	public void setEmail(String email){
		this.email = email;
	}
	
    /**
     * 邮件
     * @return
     */	
    public String getEmail(){
    	return email;
    }
}