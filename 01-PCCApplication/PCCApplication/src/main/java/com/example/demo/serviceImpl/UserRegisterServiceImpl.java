package com.example.demo.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRegisterDAO;
import com.example.demo.entity.UserRegister;
import com.example.demo.service.UserRegisterService;

@Service
public class UserRegisterServiceImpl implements UserRegisterService {
	//constructor injection of UserDAO
		private UserRegisterDAO userRegisterDAO ;	

		public UserRegisterServiceImpl(UserRegisterDAO theUserRegisterDAO) {
			userRegisterDAO = theUserRegisterDAO;
		}

	@Override
	@Transactional
	public void save(UserRegister userRegister) {
		userRegisterDAO.save(userRegister);

	}

}
