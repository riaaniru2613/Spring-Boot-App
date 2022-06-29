package com.example.demo.daoImpl;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.UserRegisterDAO;
import com.example.demo.entity.UserRegister;

@Repository
public class UserRegisterDAOImpl implements UserRegisterDAO {
private EntityManager entityManager ;
	
	// CONSTRUCTOR INJECTION 
	@Autowired
	public UserRegisterDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public void save(UserRegister userRegister) {
		
		// get current hibernate session 
		Session currentSession = entityManager.unwrap(Session.class);
						
		//saving in database 
		currentSession.save(userRegister);

	}

}
