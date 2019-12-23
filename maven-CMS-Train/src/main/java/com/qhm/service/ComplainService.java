package com.qhm.service;

import com.qhm.pojo.Complain;

/** 

* @author 作者 QHM: 

* @version 创建时间：2019年12月22日 下午8:13:08 

* 类说明 

*/

public interface ComplainService {
	
	int insertComplain(Complain complain, int articleids);
	
}
