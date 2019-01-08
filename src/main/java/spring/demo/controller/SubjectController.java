package spring.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.demo.entities.Subject;
import spring.demo.services.SubjectService;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @CrossOrigin(origins = "http://localhost")
    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
    public Subject getUserById(@PathVariable("id") int id) {
        return subjectService.findSubjectById(id);
    }

    @CrossOrigin(origins = "http://localhost")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Subject> getAllUsers() {
        return subjectService.findAll();
    }

    @CrossOrigin(origins = "http://localhost")
    @RequestMapping (value = "/insert", method = RequestMethod.POST)
    public int insertSubject(@RequestBody Subject subject) {
        System.out.println("Subject controller");
        return subjectService.create(subject);
    }

    @CrossOrigin(origins = "http://localhost")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public int deleteUser(@PathVariable("id") int id) {
        return subjectService.delete(id);
    }

    @CrossOrigin(origins = "http://localhost")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Subject updateUser(@RequestBody Subject subject, @PathVariable("id") int id) {
        return subjectService.update(subject, id);
    }


}
