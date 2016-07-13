package com.xiewei.struts2.user.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xiewei.struts2.user.model.User;

public class UserAction extends ActionSupport implements ModelDriven<User>
{
	private String name;

	private int age;

	private User user;
	private User user1 = new User();// ModelDriven·½Ê½

	public String add()
	{

		System.out.println(this.name);

		System.out.println(this.age);

		System.out.println(user.name);

		System.out.println(user.age);

		System.out.println(user1.name);

		System.out.println(user1.age);

		return SUCCESS;

	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public User getModel()
	{
		// TODO Auto-generated method stub
		return user1;
	}

}
