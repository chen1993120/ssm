package org.java.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringJUNit {
	/*@Autowired
	private UserService userService;
	
	@Test
	public void te() throws Exception{
		User u=new User();
		u.setName("1233");
		u.setPassword("1111");
		u.setBirthday("2088-8-8");
		userService.insert(u);
	}*/
	
}
