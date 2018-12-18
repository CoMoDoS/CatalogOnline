package spring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.demo.entities.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status,Integer>{
    Status findById(int statusId);
}
