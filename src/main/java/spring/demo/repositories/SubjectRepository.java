package spring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.demo.entities.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>{

    Subject findById(int id);
}
