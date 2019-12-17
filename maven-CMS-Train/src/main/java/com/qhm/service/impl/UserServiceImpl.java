package com.qhm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qhm.dao.UserDao;
import com.qhm.pojo.User;
import com.qhm.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getByUsername(String username) {
		return userDao.selectByUsername(username);
	}

	@Override
	public boolean locked(Integer userId) {
		return userDao.updateLocked(userId,1)>0;
	}

	@Override
	public boolean unLocked(Integer userId) {
		return userDao.updateLocked(userId,0)>0;
	}

	@Override
	public int addScore(Integer userId, int score) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PageInfo<User> getPageInfo(User user, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<User> userList = userDao.select(user);
		return new PageInfo<>(userList);
	}
	
}
