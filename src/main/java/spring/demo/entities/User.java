package spring.demo.entities;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User  {


	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "name", length = 200)
	private String name;

	@Column(name = "email",length = 200)
	private String email;

	@Column(name = "password", length = 200)
	private String password;

	@Column(name = "telephone", length = 50)
	private String telephone;

	@Column(name = "student",  length = 200)
	private Integer student;

	@Column(name = "teacher", length = 200)
	private Integer teacher;

	@Column(name = "admin",  length = 200)
	private Integer admin;

	@Column(name = "status",  length = 200)
	private String status;


	public User() {
	}

	public User( String name, String email, String password, String telephone, Integer student, Integer teacher, Integer admin, String status) {

		this.name = name;
		this.email = email;
		this.password = password;
		this.telephone = telephone;
		this.student = student;
		this.teacher = teacher;
		this.admin = admin;
		this.status = status;
	}


	public Integer getId_user() {
		return id;
	}

	public void setId_user(Integer id_user) {
		this.id = id_user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getStudent() {
		return student;
	}

	public void setStudent(int student) {
		this.student = student;
	}

	public int getTeacher() {
		return teacher;
	}

	public void setTeacher(int teacher) {
		this.teacher = teacher;
	}

	public int getAdmin() {
		return admin;
	}

	public void setAdmin(int admin) {
		this.admin = admin;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User{" +
				"id_user=" + id +
				", name='" + name +
				", email='" + email +
				", password='" + password +
				", telephone='" + telephone +
				", student=" + student +
				", teacher=" + teacher +
				", admin=" + admin +
				", status='" + status +
				'}';
	}
}
