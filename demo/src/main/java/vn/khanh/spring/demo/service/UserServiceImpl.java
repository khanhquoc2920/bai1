package vn.khanh.spring.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import vn.khanh.spring.demo.model.User;
import vn.khanh.spring.demo.repository.UserRepository;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	public List<User> findAll() {
		
		return this.userRepository.findAll();
	}

	public User findUserById(int id) {
		
		return this.findUserById(id);
	}

	public boolean checkLogin(User user) {
		
		return this.userRepository.checkLogin(user);
	}

	public void register(User user) {
		
		this.userRepository.register(user);
	}
	

}
