package spring.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.demo.dto.StudentSituation;
import spring.demo.dto.TeacherSituation;
import spring.demo.entities.User;
import spring.demo.services.UserService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@CrossOrigin(origins = "http://localhost")
	@RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
	public User getUserById(@PathVariable("id") int id) {
		return userService.findUserById(id);
	}

	@CrossOrigin(origins = "http://localhost")
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userService.findAll();
	}

	@CrossOrigin(origins = "http://localhost")
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public int insertUser(@RequestBody User user) {
		return userService.create(user);
	}

	@CrossOrigin(origins = "http://localhost")
	@RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
	public int deleteUser(@PathVariable("id") int id) {
		return userService.delete(id);
	}

	@CrossOrigin(origins = "http://localhost")
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public User updateUser(@RequestBody User user, @PathVariable("id") int id) {
		return userService.update(user, id);
	}

	@CrossOrigin(origins = "http://localhost")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestBody Map<String, String> json )
	{
		return userService.login(json.get("email"),json.get("pass"));
	}

	@CrossOrigin(origins = "http://localhost")
	@RequestMapping(value = "/situation/{id}", method = RequestMethod.GET)
	public List<StudentSituation> getStudentSituation(@PathVariable("id") int id) {
		return userService.getStudentSituation(id);
	}

	@CrossOrigin(origins = "http://localhost")
	@RequestMapping(value = "/Tsituation/{id}", method = RequestMethod.GET)
	public List<TeacherSituation> getTeacherSituation(@PathVariable("id") int id) {
		return userService.getTeacherSituation(id);
	}

}

