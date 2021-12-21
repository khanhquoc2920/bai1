package vn.khanh.spring.demo.service;

import java.util.List;
import  vn.khanh.spring.demo.model.User;

public interface UserService {

	public List<User> findAll();
	public User findUserById(int id);
	public boolean checkLogin(User user);
	public void register(User user);
}
