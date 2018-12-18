package spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import spring.demo.dto.UserDTO;
import spring.demo.entities.User;
import spring.demo.services.UserService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
	public User getUserById(@PathVariable("id") int id) {
		return userService.findUserById(id);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userService.findAll();
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public int insertUser(@RequestBody User user) {
		return userService.create(user);
	}

	@RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
	public int deleteUser(@PathVariable("id") int id) {
		return userService.delete(id);
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public User updateUser(@RequestBody User user, @PathVariable("id") int id) {
		return userService.update(user, id);
	}
}

