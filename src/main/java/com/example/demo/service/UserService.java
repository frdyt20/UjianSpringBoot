package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> getUser() {
		return userRepository.findAll();
	}
	
	public User getById(int user_id) {
		return userRepository.findById(user_id).orElse(null);
	}
	
	public String deleteUser(int user_id) {
		userRepository.deleteById(user_id);
		return "User Deleted";
	}
	
	public User updateUser(User user) {
		User existingUser = userRepository.findById(user.getUser_id()).orElse(null);
		existingUser.setUser_name(user.getUser_name());
		existingUser.setEmail(user.getEmail());
		existingUser.setInstagram(user.getInstagram());
		existingUser.setCompany_id(user.getCompany_id());
		return userRepository.save(existingUser);
	}

}
