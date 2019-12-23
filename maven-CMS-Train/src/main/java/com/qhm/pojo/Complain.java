package com.qhm.pojo;
/** 

* @author 作者 QHM: 

* @version 创建时间：2019年12月22日 下午7:55:32 

* 类说明 

*/
public class Complain {

	private Integer id;
	private String some;
   private Integer ctype;
   private Integer carticleid;
   private Integer userid;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getSome() {
	return some;
}
public void setSome(String some) {
	this.some = some;
}
public Integer getCtype() {
	return ctype;
}
public void setCtype(Integer ctype) {
	this.ctype = ctype;
}
public Integer getCarticleid() {
	return carticleid;
}
public void setCarticleid(Integer carticleid) {
	this.carticleid = carticleid;
}
public Integer getUserid() {
	return userid;
}
public void setUserid(Integer userid) {
	this.userid = userid;
}
@Override
public String toString() {
	return "Complain [id=" + id + ", some=" + some + ", ctype=" + ctype + ", carticleid=" + carticleid + ", userid="
			+ userid + "]";
}
public Complain(Integer id, String some, Integer ctype, Integer carticleid, Integer userid) {
	super();
	this.id = id;
	this.some = some;
	this.ctype = ctype;
	this.carticleid = carticleid;
	this.userid = userid;
}
public Complain() {
	super();
	// TODO Auto-generated constructor stub
}
   

 

}
