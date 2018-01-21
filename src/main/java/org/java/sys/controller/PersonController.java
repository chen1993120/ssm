package org.java.sys.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.java.sys.pojo.Person;
import org.java.sys.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 前端控制层
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class PersonController {

	@Autowired      
	private PersonService personService; //自动注入service实例
	
	/**
	 * 初始化显示全部信息
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/show")
	public String show(Model model) throws Exception{
		List<Person> list=personService.select(new HashMap<String,Object>());
		model.addAttribute("list",list);
		return "show";
	}
	
	/**
	 * 进入添加视图
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String add(){
		return "add";
	}
	
	/**
	 * 添加数据
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(Person person,HttpSession session) throws Exception{
		personService.insert(person);
		session.setAttribute("addMsg","信息添加成功!");
		return "redirect:/user/show";
	}
	
	/**
	 * 删除信息
	 * @param id    要删除的对象编号
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/del")
	public String del(Long id,HttpSession session) throws Exception{
		personService.delete(id);
		session.setAttribute("delMsg","删除信息成功!");
		return "redirect:/user/show";
	}
	
	
}
