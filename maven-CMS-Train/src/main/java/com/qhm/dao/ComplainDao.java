package com.qhm.dao;

import org.apache.ibatis.annotations.Param;

import com.qhm.pojo.Complain;

/** 

* @author 作者 QHM: 

* @version 创建时间：2019年12月22日 下午8:12:22 

* 类说明 

*/
public interface ComplainDao {

	int insertComplain(@Param("complain") Complain complain,@Param("articleids")  int articleids);
	
	
}
