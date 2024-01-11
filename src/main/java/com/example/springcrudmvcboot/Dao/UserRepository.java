package com.example.springcrudmvcboot.Dao;

import org.springframework.data.repository.ListCrudRepository;

import com.example.springcrudmvcboot.Model.User;

public interface UserRepository extends ListCrudRepository<User, Integer>{
}
