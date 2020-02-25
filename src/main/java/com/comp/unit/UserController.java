package com.comp.unit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/api/v1/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/name={name}")
	public UserEntity findbyName(@PathVariable("name") String name) {
		log.debug("find all networkinfo");
		return userService.getUserByName(name);
	}
	
	@PostMapping()
	public @ResponseBody UserEntity saveNetworkStats(@RequestBody UserEntity user) {
		log.info("save all networkinfo");
		return this.userService.saveUser(user);
	}
	
	@GetMapping()
	public List<UserEntity> getUsers() {
		log.debug("find all users");
		return userService.getAll();
	}
}
