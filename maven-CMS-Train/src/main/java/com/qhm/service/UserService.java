package com.qhm.service;

import com.qhm.pojo.User;

/** 

* @author 作者 QHM: 

* @version 创建时间：2019年12月10日 下午6:42:32 

* 类说明 

*/
public interface UserService {
	/**
	 * @Title: register   
	 * @Description: 注册新增用户   
	 * @param: @param user
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	public boolean register(User user);
	/**
	 * @Title: getByUsername   
	 * @Description: 根据登录名称，查询用户   
	 * @param: @param username
	 * @param: @return      
	 * @return: User      
	 * @throws
	 */
	public User getByUsername(String username);
	
	
}
