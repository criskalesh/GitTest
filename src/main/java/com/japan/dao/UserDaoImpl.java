package com.japan.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.japan.model.UsersGroup;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

	@PersistenceContext(unitName = "hibernatePersistenceUnit")
	private EntityManager entityManager;
	 
	@PersistenceContext(unitName = "hibernatePersistenceUnit")
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Transactional
	public void saveUserGroup(UsersGroup usersGroup) throws DataAccessException {
		System.out.println("Dao1");
		entityManager.persist(usersGroup);
		System.out.println("Save Complete1");
	}
	
}
