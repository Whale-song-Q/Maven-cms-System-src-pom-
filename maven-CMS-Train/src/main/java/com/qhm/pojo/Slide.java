package com.qhm.pojo;
/** 

* @author 作者 QHM: 

* @version 创建时间：2019年12月11日 下午2:29:50 

* 类说明 

*/
public class Slide {

	private Integer id;
 
	private String title; 
	
	private String picture; 
	
	private String url;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Slide [id=" + id + ", title=" + title + ", picture=" + picture + ", url=" + url + "]";
	}

	public Slide(Integer id, String title, String picture, String url) {
		super();
		this.id = id;
		this.title = title;
		this.picture = picture;
		this.url = url;
	}

	public Slide() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
	
}
