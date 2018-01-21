package org.java.sys.dao;

import java.util.List;
import java.util.Map;

import org.java.sys.pojo.Person;

/**
 * Dao层
 * @author Administrator
 *
 */
public interface PersonDao {
	
	/**
	 * 增加
	 * @param person
	 * @throws Exception
	 */
	void insert(Person person)throws Exception;
	/**
	 * 删除
	 * @param id
	 * @throws Exception
	 */
	void delete(Long id) throws Exception;
	/**
	 * 修改
	 * @param person
	 * @throws Exception
	 */
	void update(Person person) throws Exception;
	/**
	 * 查询
	 * @param map
	 * @return
	 * @throws Exception
	 */
	List<Person> select(Map<String,Object> map)throws Exception;
	
	
	
}
