package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {
	public List<User> findAll() ;
	public User findByID(int id) ;
	public User findByMobile(String mobile) ;
	public void save(User user);
	public void deleteByID(int id);
	public User findByEmail(String email);

}
