package com.example.demo.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.LoginDataDAO;
import com.example.demo.entity.LoginData;


@Repository
public class LoginDataDAOImpl implements LoginDataDAO {
	private EntityManager entityManager ;
	
	// CONSTRUCTOR INJECTION 
		@Autowired
		public LoginDataDAOImpl(EntityManager theEntityManager) {
			entityManager = theEntityManager;
		}


	@Override
	public List<LoginData> findAll() {
		// get current hibernate session 
		Session currentSession = entityManager.unwrap(Session.class);
						
		//create a query 
		Query<LoginData> theQuery = currentSession.createQuery("from LoginData",LoginData.class);
						
		//execute a query and get list 
		List<LoginData> data = theQuery.getResultList();
						
		//return the list 
		return data;
		
	}

}
