package spring.demo.controller;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.demo.dto.Lesons;
import spring.demo.dto.Students;
import spring.demo.dto.Users;
import spring.demo.entities.User;
import spring.demo.services.AdminService;


@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @CrossOrigin(origins = "http://localhost")
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public List<Students> getStudents() {
        return adminService.getStudents();
    }

    @CrossOrigin(origins = "http://localhost")
    @RequestMapping(value = "/lesons", method = RequestMethod.GET)
    public List<Lesons> getLesons() {
        return adminService.getLesons();
    }

    @CrossOrigin(origins = "http://localhost")
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<Users> getUsers() {
        return adminService.getUsers();
    }

    @CrossOrigin(origins = "http://localhost")
    @RequestMapping(value = "/sendMail", method = RequestMethod.POST)
    public int insertUser(@RequestBody Students user) {
        return adminService.sendMail(user);
    }

    @CrossOrigin(origins = "http://localhost")
    @RequestMapping(value = "/situation", method = RequestMethod.GET)
    public List<String> getSituation() throws FileNotFoundException, UnsupportedEncodingException {
        return adminService.getSituation();
    }
}
