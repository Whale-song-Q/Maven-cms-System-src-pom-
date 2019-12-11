package com.qhm.pojo;
/** 

* @author 作者 QHM: 

* @version 创建时间：2019年12月11日 下午2:19:30 

* 类说明 

*/
public class Tag {

	private Integer id;
	//标签
	private String tagname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTagname() {
		return tagname;
	}
	public void setTagname(String tagname) {
		this.tagname = tagname;
	}
	@Override
	public String toString() {
		return "Tag [id=" + id + ", tagname=" + tagname + "]";
	}
	public Tag() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tag(Integer id, String tagname) {
		super();
		this.id = id;
		this.tagname = tagname;
	}
	
	
	
	
}
