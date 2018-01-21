package org.java.sys.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.java.sys.dao.PersonDao;
import org.java.sys.pojo.Person;
import org.java.sys.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 实现类
 * @author Administrator
 *
 */
@Service
public class PersonServiceimpl implements PersonService{

	@Autowired
	private PersonDao personDao;
	
	@Override
	public void insert(Person person) throws Exception {
		personDao.insert(person);
		
	}

	@Override
	public void delete(Long id) throws Exception {
		personDao.delete(id);
		
	}

	@Override
	public void update(Person person) throws Exception {
		personDao.update(person);
		
	}

	@Override
	public List<Person> select(Map<String, Object> map) throws Exception {
		return personDao.select(map);
	}

	@Override
	public Person getByPK(Long id) throws Exception {
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("id",id);
		List<Person> list=personDao.select(map);
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

}
