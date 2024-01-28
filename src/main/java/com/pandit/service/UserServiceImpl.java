package com.pandit.service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pandit.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repo;

	@Override
	public String upsert(User user) {
		// TODO Auto-generated method stub
		User save = repo.save(user);
		return "Success";
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repo.findAll();
		
	}

	@Override
	public User getUsers(int uid) {
		// TODO Auto-generated method stub
	Optional<User> findById=repo.findById(uid);
	if(findById.isPresent()) {
		return findById.get();
	}
		return null;
	}

	@Override
	public String deleteUser(int uid) {
		// TODO Auto-generated method stub
		repo.deleteById(uid);
		return "Success";
	}

}
