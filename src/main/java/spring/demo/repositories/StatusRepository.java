package spring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring.demo.entities.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status,Integer>{
    Status findById(int statusId);
    @Query(value = "select * from status where id_lec_t = ?1 ;",nativeQuery = true)
    Status findByIdTeacher(int id);
}
