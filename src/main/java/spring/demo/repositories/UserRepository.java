package spring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring.demo.dto.StudentSituation;
import spring.demo.dto.TeacherSituation;
import spring.demo.entities.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByName(String name);

	User findById(int id);

	User findByEmail(String email);

	@Query(value = "select u.id, (select user.name from user where user.id = lt.id_t) as teacher, subj.name, subj.credits,s.mark\n" +
			"from user u\n" +
			"inner join lecture_student ls on ls.id_s = u.id and u.id = :id\n" +
			"inner join lecture_teacher lt on ls.id_lec_t = lt.id\n" +
			"inner join status s on s.id_lec_t = lt.id\n" +
			"inner join lecture l on l.id = lt.id_lec\n" +
			"inner join subject subj on subj.id = l.id_subject;", nativeQuery = true)
	List<StudentSituation> getSituation(@Param("id")int id);

	@Query(value= "select u.id as idTeacher, (select user.name from user where user.id = ls.id_s) as student, sub.name as subject, sub.credits,st.mark, lt.id\n" +
			"from user u \n" +
			"inner join lecture_teacher lt on lt.id_t = u.id and u.id=:id\n" +
			"inner join lecture_student ls on ls.id_lec_t = lt.id\n" +
			"inner join lecture lec on lec.id = lt.id_lec\n" +
			"inner join subject sub on sub.id = lec.id_subject\n" +
			"inner join status st on st.id_lec_t = lt.id;", nativeQuery = true)
	List<TeacherSituation> getTSituation(@Param("id") int id);


}
