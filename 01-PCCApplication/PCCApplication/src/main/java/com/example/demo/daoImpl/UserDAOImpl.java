package com.example.demo.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {
	//FIELD FOR ENTITY MANAGER 
	private EntityManager entityManager ;
	
	// CONSTRUCTOR INJECTION 
	@Autowired
	public UserDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<User> findAll() {
		// get current hibernate session 
		Session currentSession = entityManager.unwrap(Session.class);
				
		//create a query 
		Query<User> theQuery = currentSession.createQuery("from User",User.class);
				
		//execute a query and get list 
		List<User> users = theQuery.getResultList();
				
		//return the list 
		return users;
		
	}

	@Override
	public User findByID(int id) {
		// get current hibernate session 
		Session currentSession = entityManager.unwrap(Session.class);
				
		//get user by id 
		User user = currentSession.get(User.class , id);
				
		//return user
		return user ;
		
	}


	@Override
	public void save(User user) {
		// get current hibernate session 
		Session currentSession = entityManager.unwrap(Session.class);
				
		//saving in database 
		currentSession.saveOrUpdate(user);
		

	}

	@Override
	public void deleteByID(int id) {
		// get current hibernate session 
		Session currentSession = entityManager.unwrap(Session.class);
				
		//create a query 
		Query<User> theQuery = currentSession.createQuery("delete from User where id= :userId");
		theQuery.setParameter("userId",id);
		theQuery.executeUpdate();
				
	}

	@Override
	public User findbyEmail(String email) {		
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from User where email = :email");
		  query.setParameter("email", email);
		  if (query.getResultList().isEmpty()){
			  return null ;
		  }
		
		  return (User) query.getResultList().get(0);
		
	}

	@Override
	public User findByMobile(String mobile) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from User where mobileNumber = :mobile");
		  query.setParameter("mobile", mobile);
		  if (query.getResultList().isEmpty()){
			  return null ;
		  }
		
		  return (User) query.getResultList().get(0);
	}

	
}
