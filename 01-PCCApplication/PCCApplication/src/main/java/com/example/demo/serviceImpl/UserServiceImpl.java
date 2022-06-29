package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	//constructor injection of UserDAO
	private UserDAO userDAO ;	

	public UserServiceImpl(UserDAO theUserDAO) {
		userDAO = theUserDAO;
	}

	@Override
	@Transactional
	public List<User> findAll() {
		return userDAO.findAll();
	}

	@Override
	@Transactional
	public User findByID(int id) {
		return userDAO.findByID(id);
	}

	@Override
	@Transactional
	public void save(User user) {
		userDAO.save(user);

	}

	@Override
	@Transactional
	public void deleteByID(int id) {
		userDAO.deleteByID(id);
	}

	@Override
	@Transactional
	public User findByEmail(String email) {
		return userDAO.findbyEmail(email);
		
	}

	@Override
	@Transactional
	public User findByMobile(String mobile) {
		return userDAO.findByMobile(mobile);
	}

}
