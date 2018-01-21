package org.java.sys.service;

import java.util.List;
import java.util.Map;

import org.java.sys.pojo.Person;

/**
 * Service接口
 * @author Administrator
 *
 */
public interface PersonService {
	
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
	
	/**
	 * 按主键查询
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Person getByPK(Long id) throws Exception;
	
}
