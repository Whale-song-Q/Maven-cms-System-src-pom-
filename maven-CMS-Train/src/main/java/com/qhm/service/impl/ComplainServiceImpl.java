package com.qhm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qhm.dao.ComplainDao;
import com.qhm.pojo.Complain;
import com.qhm.service.ComplainService;

/** 

* @author 作者 QHM: 

* @version 创建时间：2019年12月22日 下午8:13:38 

* 类说明 

*/
@Transactional
@Service
public class ComplainServiceImpl implements ComplainService {

	@Autowired
	ComplainDao dao;

	public int insertComplain(Complain complain, int articleids) {
		// TODO Auto-generated method stub
		return dao.insertComplain(complain, articleids);
	}
	
	


}
