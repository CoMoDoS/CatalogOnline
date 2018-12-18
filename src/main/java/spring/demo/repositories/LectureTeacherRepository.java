package spring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.demo.entities.LectureTeacher;
@Repository
public interface LectureTeacherRepository extends JpaRepository<LectureTeacher, Integer>{
    LectureTeacher findById(int lectureTeacherId);
}
