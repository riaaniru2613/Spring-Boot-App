
package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.User;

public interface UserDAO {
	public List<User> findAll() ;
	public User findByID(int id) ; 
	public User findByMobile(String mobile) ; 
	public void save(User user);
	public void deleteByID(int id);
	public User findbyEmail(String email);

}
