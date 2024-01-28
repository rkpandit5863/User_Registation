package com.pandit.rest;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pandit.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	private UserService service;
	
	@PostMapping("/user")
	 public ResponseEntity<String> user(User user){
		String status = service.upsert(user);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}

	@GetMapping("/users")
     public ResponseEntity<List<User>> getAllUsers(){
		List<User> allUsers =service.getAllUsers();
		return new ResponseEntity<>(allUsers, HttpStatus.OK);
	}

	@GetMapping("/user/{uid}")
	 public ResponseEntity<User> getUser(@PathVariable int uid){
		User user= service.getUsers(uid);
		return new ResponseEntity<>(user,HttpStatus.OK);
	}

	@DeleteMapping("/user/{uid}")
	 public ResponseEntity <String> deleteUser(@PathVariable int uid){
		String deleteUser= service.deleteUser(uid);
		return new ResponseEntity<>(deleteUser,HttpStatus.OK);
	}

}
