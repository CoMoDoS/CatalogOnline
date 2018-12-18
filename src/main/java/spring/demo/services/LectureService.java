package spring.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.demo.entities.Lecture;
import spring.demo.errorhandler.ResourceNotFoundException;
import spring.demo.repositories.LectureRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class LectureService {
    private static final String SPLIT_CH = " ";
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    @Autowired
    private LectureRepository lectureRepository;

    public Lecture findLectureById(int lectureId) {
        Lecture lecture = lectureRepository.findById(lectureId);
        System.out.println(lecture.toString());
        if (lecture == null) {
            throw new ResourceNotFoundException(Lecture.class.getSimpleName());
        }

        return lecture;
    }

    public List<Lecture> findAll() {
        List<Lecture> lectures = new ArrayList<Lecture>();
        lectures =	lectureRepository.findAll();
        return lectures;
    }

    public int create(Lecture lecture){
        Lecture l = lectureRepository.save(lecture);
        return l.getId_lecture();
    }

    public int delete(int id){

        Lecture lecture = lectureRepository.findById(id);
        lectureRepository.delete(lecture);
        return lecture.getId_lecture();
    }

    public Lecture update(Lecture lecture, int id){
        System.out.println(lecture.toString());
        Lecture lecture1 = lectureRepository.findById(id);
        System.out.println(lecture1.toString());
        lecture.setId_lecture(lecture1.getId_lecture());
        lectureRepository.save(lecture);
        return lecture1;
    }




}
