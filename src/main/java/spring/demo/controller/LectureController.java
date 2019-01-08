package spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.demo.entities.Lecture;
import spring.demo.services.LectureService;

import java.util.List;


@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/lecture")
public class LectureController {

    @Autowired
    private LectureService lectureService;

    @CrossOrigin(origins = "http://localhost")
    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
    public Lecture getLectureById(@PathVariable("id") int id) {
        return lectureService.findLectureById(id);
    }

    @CrossOrigin(origins = "http://localhost")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Lecture> getAllLectures() {
        return lectureService.findAll();
    }

    @CrossOrigin(origins = "http://localhost")
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insertLecture(@RequestBody Lecture lecture) {
        return lectureService.create(lecture);
    }

    @CrossOrigin(origins = "http://localhost")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public int deleteLecture(@PathVariable("id") int id) {
        return lectureService.delete(id);
    }

    @CrossOrigin(origins = "http://localhost")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Lecture updateLecture(@RequestBody Lecture lecture, @PathVariable("id") int id) {
        return lectureService.update(lecture, id);
    }

}
