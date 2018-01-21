package org.java.sys.pojo;

import java.io.Serializable;
/**
 * 实体类
 * @author Administrator
 *
 */
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Integer gender;
	private Integer age;
	private Integer rank;
	private String department;
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", rank=" + rank
				+ ", department=" + department + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
