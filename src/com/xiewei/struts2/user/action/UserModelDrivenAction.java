package com.xiewei.struts2.user.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xiewei.struts2.user.model.User;

public class UserModelDrivenAction extends ActionSupport implements ModelDriven<User>
{

	private User user = new User();// ModelDriven·½Ê½

	public String add()
	{

		System.out.println(user.name);

		System.out.println(user.age);

		return SUCCESS;

	}

	public User getModel()
	{
		// TODO Auto-generated method stub
		return user;
	}

}
