package com.comp.unit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public UserEntity getUserByName(String name) {
		return userRepository.findByName(name);
	}
	
	public UserEntity saveUser(UserEntity entity) {
		return userRepository.save(entity);
	}
	
	public List<UserEntity> getAll(){
		return userRepository.findAll();
	}
}
