package vn.khanh.spring.demo.repository;

import java.util.List;

import vn.khanh.spring.demo.model.User;

public interface UserRepository {

	public List<User> findAll();
	public User findUserById(int id);
	public boolean checkLogin(User user);
	public void register(User user);
}
