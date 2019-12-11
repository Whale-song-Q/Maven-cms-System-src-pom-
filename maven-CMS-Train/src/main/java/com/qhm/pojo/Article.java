package com.qhm.pojo;
/** 

* @author 作者 QHM: 

* @version 创建时间：2019年12月11日 下午1:49:34 

* 类说明 

*/
public class Article {

//文章编号
	 private Integer id; 
//标题
	 private String tetle;
//内容
	 private String content;
//标题照片
	 private String picture ;
//频道主键
	 private Integer channel_id ;
//分类表主键
	 private Integer category_id;
//用户表主键
	 private Integer user_id;
//点击次数
	 private Integer hits;
//是否热门
	 private Integer hot;
//状态：0,刚发布,1审核通 过,-1 审核未通过
	 private Integer status;
//状态：1 表示删除，逻辑删 除
	 private Integer deleted;
//发布时间
	 private String created;
//最后更新时间
	 private String updated;
//评论数量
	 private Integer commentCnt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTetle() {
		return tetle;
	}
	public void setTetle(String tetle) {
		this.tetle = tetle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Integer getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(Integer channel_id) {
		this.channel_id = channel_id;
	}
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getHits() {
		return hits;
	}
	public void setHits(Integer hits) {
		this.hits = hits;
	}
	public Integer getHot() {
		return hot;
	}
	public void setHot(Integer hot) {
		this.hot = hot;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getDeleted() {
		return deleted;
	}
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	public Integer getCommentCnt() {
		return commentCnt;
	}
	public void setCommentCnt(Integer commentCnt) {
		this.commentCnt = commentCnt;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", tetle=" + tetle + ", content=" + content + ", picture=" + picture
				+ ", channel_id=" + channel_id + ", category_id=" + category_id + ", user_id=" + user_id + ", hits="
				+ hits + ", hot=" + hot + ", status=" + status + ", deleted=" + deleted + ", created=" + created
				+ ", updated=" + updated + ", commentCnt=" + commentCnt + "]";
	}
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Article(Integer id, String tetle, String content, String picture, Integer channel_id, Integer category_id,
			Integer user_id, Integer hits, Integer hot, Integer status, Integer deleted, String created, String updated,
			Integer commentCnt) {
		super();
		this.id = id;
		this.tetle = tetle;
		this.content = content;
		this.picture = picture;
		this.channel_id = channel_id;
		this.category_id = category_id;
		this.user_id = user_id;
		this.hits = hits;
		this.hot = hot;
		this.status = status;
		this.deleted = deleted;
		this.created = created;
		this.updated = updated;
		this.commentCnt = commentCnt;
	}
	
	
	
	
	
	
	
	
	
}
