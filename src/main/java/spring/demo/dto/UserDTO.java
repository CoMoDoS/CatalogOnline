package spring.demo.dto;

public class UserDTO {

	private Integer id_user;
	private String name;
	private String email;
	private String password;
	private String telephone;
	private int student;
	private int teacher;
	private int admin;

	public UserDTO(Integer id_user, String name, String email, String password, String telephone, int student, int teacher, int admin, String status) {
		this.id_user = id_user;
		this.name = name;
		this.email = email;
		this.password = password;
		this.telephone = telephone;
		this.student = student;
		this.teacher = teacher;
		this.admin = admin;
		this.status = status;
	}

	private String status;

	public UserDTO(){}

	public Integer getId_user() {
		return id_user;
	}

	public void setId_user(Integer id_user) {
		this.id_user = id_user;
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

	public static class Builder {
		private Integer nestid_user;
		private String nestname;
		private String nestemail;
		private String nestpassword;
		private String nesttelephone;
		private int neststudent;
		private int nestteacher;
		private int nestadmin;
		private String neststatus;

		public Builder id_user(int id) {
			this.nestid_user = id;
			return this;
		}

		public Builder name(String name) {
			this.nestname = name;
			return this;
		}

		public Builder email(String name) {
			this.nestemail= name;
			return this;
		}

		public Builder password(String email) {
			this.nestpassword = email;
			return this;
		}

		public Builder telephone(String address) {
			this.nesttelephone = address;
			return this;
		}

		public Builder student(int id) {
			this.neststudent = id;
			return this;
		}

		public Builder teacher(int id) {
			this.nestteacher = id;
			return this;
		}

		public Builder admin(int id) {
			this.nestadmin = id;
			return this;
		}



		public Builder status(String status) {
			this.neststatus = status;
			return this;
		}



		public UserDTO create() {
			return new UserDTO(nestid_user,nestname,nestemail,nestpassword,nesttelephone,neststudent,nestteacher,nestadmin,neststatus);
		}

	}

}
