package com.japan.dao;

import org.springframework.dao.DataAccessException;

import com.japan.model.UsersGroup;


public interface UserDao {

	public void saveUserGroup(UsersGroup usersGroup) throws DataAccessException;
}
