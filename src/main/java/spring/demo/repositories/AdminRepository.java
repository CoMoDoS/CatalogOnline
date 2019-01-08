package spring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring.demo.dto.*;
import spring.demo.entities.User;

import java.util.List;
@Repository
public interface AdminRepository extends JpaRepository<User, Integer>  {
    @Query(value = "select * from studenti;", nativeQuery = true)
    List<Students> getStudents();

    @Query(value = "select * from lectures;", nativeQuery = true)
    List<Lesons> getLesons();

    @Query(value = "select * from users;", nativeQuery = true)
    List<Users> getUsers();
}
