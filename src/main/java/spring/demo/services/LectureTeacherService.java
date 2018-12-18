package spring.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.demo.entities.LectureTeacher;
import spring.demo.errorhandler.ResourceNotFoundException;
import spring.demo.repositories.LectureTeacherRepository;

import java.util.ArrayList;
import java.util.List;
@Service
public class LectureTeacherService {

    @Autowired
    private LectureTeacherRepository lectureTeacherRepository;

    public LectureTeacher findLectureTeacherById(int lectureTeacherId) {
        LectureTeacher lectureTeacher = lectureTeacherRepository.findById(lectureTeacherId);
        System.out.println(lectureTeacher.toString());
        if (lectureTeacher == null) {
            throw new ResourceNotFoundException(LectureTeacher.class.getSimpleName());
        }

        return lectureTeacher;
    }

    public List<LectureTeacher> findAll() {
        List<LectureTeacher> lectureTeachers = new ArrayList<LectureTeacher>();
        lectureTeachers =	lectureTeacherRepository.findAll();
        return lectureTeachers;
    }

    public int create(LectureTeacher lectureTeacher){
        LectureTeacher l = lectureTeacherRepository.save(lectureTeacher);
        return l.getId_lec_t();
    }

    public int delete(int id){

        LectureTeacher lectureTeacher = lectureTeacherRepository.findById(id);
        lectureTeacherRepository.delete(lectureTeacher);
        return lectureTeacher.getId_lec_t();
    }

    public LectureTeacher update(LectureTeacher lectureTeacher, int id){
        System.out.println(lectureTeacher.toString());
        LectureTeacher lectureTeacher1 = lectureTeacherRepository.findById(id);
        System.out.println(lectureTeacher1.toString());
        lectureTeacher.setId_lec_t(lectureTeacher1.getId_lec_t());
        lectureTeacherRepository.save(lectureTeacher);
        return lectureTeacher1;
    }

}
