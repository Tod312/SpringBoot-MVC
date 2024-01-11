package com.example.springcrudmvcboot.Service;

import java.util.List;

import com.example.springcrudmvcboot.Model.User;


public interface UserService {
	
		void create(User user);
		void update(User user);
		void delete(Integer id);
		User get(Integer id);
		List<User> getAllUser();
}
