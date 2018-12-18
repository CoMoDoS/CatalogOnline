package spring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import spring.demo.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByName(String name);

	User findById(int id);



}
