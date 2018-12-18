package spring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.demo.entities.Lecture;

@Repository
public interface LectureRepository extends JpaRepository<Lecture, Integer> {

    Lecture findById(int lectureId);

}
