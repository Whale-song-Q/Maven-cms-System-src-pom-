package com.qhm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qhm.pojo.Article;
import com.qhm.pojo.Category;
import com.qhm.pojo.Channel;
import com.qhm.pojo.Settings;
import com.qhm.pojo.Slide;
import com.qhm.pojo.Tag;
import com.qhm.pojo.User;

/** 

* @author 作者 QHM: 

* @version 创建时间：2019年12月10日 下午6:39:38 

* 类说明 

*/
public interface UserDao {
		/**
		 * @Title: selectById   
		 * @Description: 根据Id，查询对象   
		 * @param: @param id
		 * @param: @return      
		 * @return: User      
		 * @throws
		 */
		User selectById(@Param("id") Integer id);
		/**
		 * @Title: select   
		 * @Description: 根据User查询列表  
		 * @param: @param user
		 * @param: @return      
		 * @return: List<User>      
		 * @throws
		 */
		List<User> select(@Param("user") User user);
		/**
		 * @Title: count   
		 * @Description: 查询数据条数   
		 * @param: @param user
		 * @param: @return      
		 * @return: int      
		 * @throws
		 */
		int count(@Param("user") User user);
		/**
		 * @Title: insert   
		 * @Description: 插入一条记录   
		 * @param: @param user
		 * @param: @return      
		 * @return: int      
		 * @throws
		 */
		int insert(@Param("user") User user);
		/**
		 * @Title: update   
		 * @Description: 根据Id更新记录 
		 * @param: @param user
		 * @param: @return      
		 * @return: int      
		 * @throws
		 */
		int update(@Param("user") User user);
		/**
		 * @Title: deleteById   
		 * @Description: 根据Id删除记录   
		 * @param: @param id
		 * @param: @return      
		 * @return: int      
		 * @throws
		 */
		int deleteById(@Param("id") Integer id);
		/**
		 * @Title: deleteByIds   
		 * @Description: 根据Ids批量删除记录   
		 * @param: @param ids "1,2,3"
		 * @param: @return      
		 * @return: int      
		 * @throws
		 */
		int deleteByIds(@Param("ids") String ids);

//↓(Channel频道表)↓+++++++++++++++++++++++++++++++++++++++++++++++++++++++
		/**
		 * @Title: ChannelselectById   
		 * @Description: 根据Id，查询对象   
		 * @param: @param id
		 * @param: @return      
		 * @return: Channel     
		 * @throws
		 */
		Channel  ChannelselectById(@Param("id") Integer id);
		/**
		 * @Title: Channelselect   
		 * @Description: 根据Channel查询列表  
		 * @param: @param Channel
		 * @param: @return      
		 * @return: List<Channel>      
		 * @throws
		 */
		List<Channel> Channelselect(@Param("channel") Channel channel);
		/**
		 * @Title: Channelcount   
		 * @Description: 查询数据条数   
		 * @param: @param Channel
		 * @param: @return      
		 * @return: int      
		 * @throws
		 */
		int Channelcount(@Param("channel") Channel channel);
		/**
		 * @Title: Channelinsert   
		 * @Description: 插入一条记录   
		 * @param: @param user
		 * @param: @return      
		 * @return: int      
		 * @throws
		 */
		int Channelinsert(@Param("channel") Channel channel);
		/**
		 * @Title: Channelupdate   
		 * @Description: 根据Id更新记录 
		 * @param: @param Channel
		 * @param: @return      
		 * @return: int      
		 * @throws
		 */
		int Channelupdate(@Param("channel") Channel channel);
		/**
		 * @Title: ChanneldeleteById   
		 * @Description: 根据Id删除记录   
		 * @param: @param id
		 * @param: @return      
		 * @return: int      
		 * @throws
		 */
		int ChanneldeleteById(@Param("id") Integer id);
		/**
		 * @Title: ChanneldeleteByIds   
		 * @Description: 根据Ids批量删除记录   
		 * @param: @param ids "1,2,3"
		 * @param: @return      
		 * @return: int      
		 * @throws
		 */
		int ChanneldeleteByIds(@Param("ids") String ids);
	
//↓(Category分类表)↓+++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
			/**
			 * @Title: CategoryselectById   
			 * @Description: 根据Id，查询对象   
			 * @param: @param id
			 * @param: @return      
			 * @return: Channel     
			 * @throws
			 */
			Category  CategoryselectById(@Param("id") Integer id);
			/**
			 * @Title: Categoryselect   
			 * @Description: 根据Channel查询列表  
			 * @param: @param Category
			 * @param: @return      
			 * @return: List<Category>      
			 * @throws
			 */
			List<Category> Categoryselect(@Param("category") Category category);
			/**
			 * @Title: Categorycount   
			 * @Description: 查询数据条数   
			 * @param: @param Category
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int Categorycount(@Param("category") Category category);
			/**
			 * @Title: Categoryinsert   
			 * @Description: 插入一条记录   
			 * @param: @param Category
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int Categoryinsert(@Param("category") Category category);
			/**
			 * @Title: Categoryupdate   
			 * @Description: 根据Id更新记录 
			 * @param: @param Category
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int Categoryupdate(@Param("category") Category category);
			/**
			 * @Title: CategorydeleteById   
			 * @Description: 根据Id删除记录   
			 * @param: @param id
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int CategorydeleteById(@Param("id") Integer id);
			/**
			 * @Title: CategorydeleteByIds   
			 * @Description: 根据Ids批量删除记录   
			 * @param: @param ids "1,2,3"
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int CategorydeleteByIds(@Param("ids") String ids);

//↓(Article文章表)↓+++++++++++++++++++++++++++++++++++++++++++++++++++++
			/**
			 * @Title: ArticleselectById   
			 * @Description: 根据Id，查询对象   
			 * @param: @param id
			 * @param: @return      
			 * @return: Article      
			 * @throws
			 */
			Article ArticleselectById(@Param("id") Integer id);
			/**
			 * @Title: select   
			 * @Description: 根据User查询列表  
			 * @param: @param Article
			 * @param: @return      
			 * @return: List<Article>      
			 * @throws
			 */
			List<Article> Articleselect(@Param("article") Article article);
			/**
			 * @Title: count   
			 * @Description: 查询数据条数   
			 * @param: @param Article
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int Articlecount(@Param("article") Article article);
			/**
			 * @Title: insert   
			 * @Description: 插入一条记录   
			 * @param: @param Article
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int Articleinsert(@Param("article") Article article);
			/**
			 * @Title: update   
			 * @Description: 根据Id更新记录 
			 * @param: @param Article
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int Articleupdate(@Param("article") Article article);
			/**
			 * @Title: deleteById   
			 * @Description: 根据Id删除记录   
			 * @param: @param id
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int ArticledeleteById(@Param("id") Integer id);
			/**
			 * @Title: deleteByIds   
			 * @Description: 根据Ids批量删除记录   
			 * @param: @param ids "1,2,3"
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int ArticledeleteByIds(@Param("ids") String ids);
//↓(Tag标签表)↓+++++++++++++++++++++++++++++++++++++++++++++++++++++
			/**
			 * @Title: TagselectById   
			 * @Description: 根据Id，查询对象   
			 * @param: @param id
			 * @param: @return      
			 * @return: Tag      
			 * @throws
			 */
			Tag TagselectById(@Param("id") Integer id);
			/**
			 * @Title: select   
			 * @Description: 根据User查询列表  
			 * @param: @param Tag
			 * @param: @return      
			 * @return: List<Tag>      
			 * @throws
			 */
			List<Tag> Tagselect(@Param("tag") Tag tag);
			/**
			 * @Title: count   
			 * @Description: 查询数据条数   
			 * @param: @param Tag
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int Tagcount(@Param("tag") Tag tag);
			/**
			 * @Title: insert   
			 * @Description: 插入一条记录   
			 * @param: @param Tag
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int Taginsert(@Param("tag") Tag tag);
			/**
			 * @Title: update   
			 * @Description: 根据Id更新记录 
			 * @param: @param Tag
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int Tagupdate(@Param("tag") Tag tag);
			/**
			 * @Title: deleteById   
			 * @Description: 根据Id删除记录   
			 * @param: @param id
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int TagdeleteById(@Param("id") Integer id);
			/**
			 * @Title: deleteByIds   
			 * @Description: 根据Ids批量删除记录   
			 * @param: @param ids "1,2,3"
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int TagdeleteByIds(@Param("ids") String ids);
			
//↓(Slide标签表)↓+++++++++++++++++++++++++++++++++++++++++++++++++++++
			/**
			 * @Title: SlideselectById   
			 * @Description: 根据Id，查询对象   
			 * @param: @param id
			 * @param: @return      
			 * @return: Slide      
			 * @throws
			 */
			Slide SlideselectById(@Param("id") Integer id);
			/**
			 * @Title: select   
			 * @Description: 根据User查询列表  
			 * @param: @param Slide
			 * @param: @return      
			 * @return: List<Slide>      
			 * @throws
			 */
			List<Slide> Slideselect(@Param("slide") Slide slide);
			/**
			 * @Title: count   
			 * @Description: 查询数据条数   
			 * @param: @param Slide
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int Slidecount(@Param("slide") Slide slide);
			/**
			 * @Title: insert   
			 * @Description: 插入一条记录   
			 * @param: @param Slide
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int Slideinsert(@Param("tag") Slide slide);
			/**
			 * @Title: update   
			 * @Description: 根据Id更新记录 
			 * @param: @param Slide
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int Slideupdate(@Param("slide") Slide slide);
			/**
			 * @Title: deleteById   
			 * @Description: 根据Id删除记录   
			 * @param: @param id
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int SlidedeleteById(@Param("id") Integer id);
			/**
			 * @Title: deleteByIds   
			 * @Description: 根据Ids批量删除记录   
			 * @param: @param ids "1,2,3"
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int SlidedeleteByIds(@Param("ids") String ids);

//↓(Settings标签表)↓+++++++++++++++++++++++++++++++++++++++++++++++++++++
			/**
			 * @Title: SettingsselectById   
			 * @Description: 根据Id，查询对象   
			 * @param: @param id
			 * @param: @return      
			 * @return: Settings      
			 * @throws
			 */
			Settings SettingsselectById(@Param("id") Integer id);
			/**
			 * @Title: select   
			 * @Description: 根据User查询列表  
			 * @param: @param Settings
			 * @param: @return      
			 * @return: List<Settings>      
			 * @throws
			 */
			List<Settings> Settingsselect(@Param("settings") Settings settings);
			/**
			 * @Title: count   
			 * @Description: 查询数据条数   
			 * @param: @param Settings
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int Settingscount(@Param("settings") Settings settings);
			/**
			 * @Title: insert   
			 * @Description: 插入一条记录   
			 * @param: @param Settings
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int Settingsinsert(@Param("settings") Settings settings);
			/**
			 * @Title: update   
			 * @Description: 根据Id更新记录 
			 * @param: @param Settings
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int Settingsupdate(@Param("settings") Settings settings);
			/**
			 * @Title: deleteById   
			 * @Description: 根据Id删除记录   
			 * @param: @param id
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int SettingsdeleteById(@Param("id") Integer id);
			/**
			 * @Title: deleteByIds   
			 * @Description: 根据Ids批量删除记录   
			 * @param: @param ids "1,2,3"
			 * @param: @return      
			 * @return: int      
			 * @throws
			 */
			int SettingsdeleteByIds(@Param("ids") String ids);


























































}
