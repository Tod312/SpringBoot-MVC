package com.example.springcrudmvcboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springcrudmvcboot.Dao.UserRepository;
import com.example.springcrudmvcboot.Model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private final UserRepository repository;
	
	
	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}

	@Transactional
	@Override
	public void create(User user) {
		repository.save(user);
		
	}

	
	@Transactional
	@Override
	public void update(User user) {
		repository.findById(user.getId())
				.ifPresent(u -> {
					u.setName(user.getName());
					u.setBirthday(user.getBirthday());
					repository.save(u);
				});	
	}

	@Transactional
	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
		
	}

	@Transactional(readOnly = true)
	@Override
	public User get(Integer id) {
		return repository.findById(id).get();
	}

	@Transactional(readOnly = true)
	@Override
	public List<User> getAllUser() {
		return repository.findAll();
	}

}
