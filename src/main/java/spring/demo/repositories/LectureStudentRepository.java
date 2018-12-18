package spring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.demo.entities.LectureStudent;


@Repository
public interface LectureStudentRepository extends JpaRepository<LectureStudent, Integer>{

    LectureStudent findById(int lectureTeacherId);
}
