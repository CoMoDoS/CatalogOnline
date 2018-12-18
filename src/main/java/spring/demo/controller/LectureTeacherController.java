package spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.demo.entities.LectureTeacher;
import spring.demo.services.LectureTeacherService;

import java.util.List;
@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/lectureTeacher")
public class LectureTeacherController {

    @Autowired
    private LectureTeacherService lectureTeacherService;

    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
    public LectureTeacher getLectureById(@PathVariable("id") int id) {
        return lectureTeacherService.findLectureTeacherById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<LectureTeacher> getAllLectures() {
        return lectureTeacherService.findAll();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insertLecture(@RequestBody LectureTeacher lecture) {
        return lectureTeacherService.create(lecture);
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public int deleteLecture(@PathVariable("id") int id) {
        return lectureTeacherService.delete(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public LectureTeacher updateLecture(@RequestBody LectureTeacher lecture, @PathVariable("id") int id) {
        return lectureTeacherService.update(lecture, id);
    }
}
