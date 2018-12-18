package spring.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.demo.entities.LectureStudent;
import spring.demo.errorhandler.ResourceNotFoundException;
import spring.demo.repositories.LectureStudentRepository;

import java.util.ArrayList;
import java.util.List;
@Service
public class LectureStudentService {

    @Autowired
    private LectureStudentRepository lectureStudentRepository;

    public LectureStudent findLectureStudentById(int lectureStudentId) {
        LectureStudent lectureStudent = lectureStudentRepository.findById(lectureStudentId);
        System.out.println(lectureStudent.toString());
        if (lectureStudent == null) {
            throw new ResourceNotFoundException(LectureStudent.class.getSimpleName());
        }

        return lectureStudent;
    }

    public List<LectureStudent> findAll() {
        List<LectureStudent> lectureStudents = new ArrayList<LectureStudent>();
        lectureStudents =	lectureStudentRepository.findAll();
        return lectureStudents;
    }

    public int create(LectureStudent lectureStudent){
        LectureStudent l = lectureStudentRepository.save(lectureStudent);
        return l.getId_lec_s();
    }

    public int delete(int id){

        LectureStudent lectureStudent = lectureStudentRepository.findById(id);
        lectureStudentRepository.delete(lectureStudent);
        return lectureStudent.getId_lec_s();
    }

    public LectureStudent update(LectureStudent lectureStudent, int id){
        System.out.println(lectureStudent.toString());
        LectureStudent lectureStudent1 = lectureStudentRepository.findById(id);
        System.out.println(lectureStudent1.toString());
        lectureStudent.setId_lec_s(lectureStudent1.getId_lec_s());
        lectureStudentRepository.save(lectureStudent);
        return lectureStudent1;
    }
}
