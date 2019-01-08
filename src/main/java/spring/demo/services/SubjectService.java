package spring.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.demo.entities.Subject;
import spring.demo.errorhandler.ResourceNotFoundException;
import spring.demo.repositories.SubjectRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public Subject findSubjectById(int id) {
        Subject subject = subjectRepository.findById(id);
        System.out.println(subject.toString());
        if (subject == null) {
            throw new ResourceNotFoundException(Subject.class.getSimpleName());
        }

        return subject;
    }

    public List<Subject> findAll() {
        List<Subject> subjects = new ArrayList<Subject>();
        subjects =	subjectRepository.findAll();
        return subjects;
    }

    public int create(Subject subject){
        System.out.println(subject.toString());
        Subject s = subjectRepository.save(subject);
        System.out.println(s.toString());
        return s.getId();
    }

    public int delete(int id){

        Subject subject = subjectRepository.findById(id);
        subjectRepository.delete(subject);
        return subject.getId();
    }

    public Subject update(Subject subject, int id){
        System.out.println(subject.toString());
        Subject user1 = subjectRepository.findById(id);
        System.out.println(user1.toString());
        subject.setId(user1.getId());
        subjectRepository.save(subject);
        return user1;
    }


}
