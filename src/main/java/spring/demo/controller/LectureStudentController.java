package spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.demo.entities.LectureStudent;
import spring.demo.services.LectureStudentService;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/lectureStudent")
public class LectureStudentController {


    @Autowired
    private LectureStudentService lectureStudentService;

    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
    public LectureStudent getLectureById(@PathVariable("id") int id) {
        return lectureStudentService.findLectureStudentById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<LectureStudent> getAllLectures() {
        return lectureStudentService.findAll();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insertLecture(@RequestBody LectureStudent lecture) {
        return lectureStudentService.create(lecture);
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public int deleteLecture(@PathVariable("id") int id) {
        return lectureStudentService.delete(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public LectureStudent updateLecture(@RequestBody LectureStudent lecture, @PathVariable("id") int id) {
        return lectureStudentService.update(lecture, id);
    }
}
