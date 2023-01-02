package com.dao;

import com.beans.User;

public interface UserDao {
	
	public void create(User u);
	public User get(String user_mail);
	
}
