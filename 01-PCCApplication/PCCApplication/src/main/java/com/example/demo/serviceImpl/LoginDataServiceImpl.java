package com.example.demo.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.dao.LoginDataDAO;

import com.example.demo.entity.LoginData;
import com.example.demo.service.LoginDataService;

@Service
public class LoginDataServiceImpl implements LoginDataService {
	private LoginDataDAO loginDataDAO ;	

	public LoginDataServiceImpl(LoginDataDAO theUserDAO) {
		loginDataDAO = theUserDAO;
	}


	@Override
	@Transactional
	public List<LoginData> findAll() {		
		return loginDataDAO.findAll();
	}

}
