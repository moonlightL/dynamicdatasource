package com.light.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.light.domain.User;
import com.light.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("get/{id}")
	public User get(@PathVariable("id") int id) {
		return this.userService.getUser(id);
	}

	@PostMapping("delete/{id}")
	public String delete(@PathVariable("id") int id) {
		this.userService.delete(id);
		return "success";
	}
}
