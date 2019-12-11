package com.qhm.pojo;
/** 

* @author 作者 QHM: 

* @version 创建时间：2019年12月11日 上午8:32:19 

* 类说明 :频道表（cms_channel）

*/
public class Channel {

	private int id;
	//频道名称
	private String name;
	//描述
	private String description;
	//图标
	private String icon;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	@Override
	public String toString() {
		return "Channel [id=" + id + ", name=" + name + ", description=" + description + ", icon=" + icon + "]";
	}
	public Channel(int id, String name, String description, String icon) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.icon = icon;
	}
	public Channel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
