package spring.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.demo.dto.StudentSituation;
import spring.demo.dto.TeacherSituation;
import spring.demo.errorhandler.ResourceNotFoundException;
import spring.demo.entities.User;
import spring.demo.repositories.UserRepository;

@Service
public class UserService {
	private static final String SPLIT_CH = " ";
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	@Autowired
	private UserRepository usrRepository;

	private User findUserByEmail(String email){
		User user = usrRepository.findByEmail(email);
		System.out.println(user.toString());
		if (user == null) {
			throw new ResourceNotFoundException(User.class.getSimpleName());
		}

		return user;
	}

	public List<TeacherSituation> getTeacherSituation(int id){
	    List<TeacherSituation> situation = new ArrayList<>();
        try{
            situation = usrRepository.getTSituation(id);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return situation;
    }

	public List<StudentSituation> getStudentSituation(int id){
		List<StudentSituation> situation = new ArrayList<>();
		try{
			situation = usrRepository.getSituation(id);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return situation;
	}

	public String login(String email, String pass){
		User user = new User();
		try {
			user = findUserByEmail(email);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		if (user.getEmail() != null ) {
			if (user.getPassword().compareTo(pass) == 0) {
				if (user.getAdmin() == 1)
					return "ok-" + "a-" + user.getId_user().toString();
				if (user.getTeacher() == 1)
					return "ok-" + "t-" + user.getId_user().toString();
				if (user.getStudent() == 1)
					return "ok-" + "s-" + user.getId_user().toString();
			} else return "ok-bad";
		}else return "bad-bad";

		return null;
	}

	public User findUserById(int userId) {
		User usr = usrRepository.findById(userId);
		System.out.println(usr.toString());
		if (usr == null) {
			throw new ResourceNotFoundException(User.class.getSimpleName());
		}

		return usr;
	}

	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		users =	usrRepository.findAll();
		return users;
	}

	public int create(User user) {
	    System.out.println("creazaaaa");
//		List<String> validationErrors = validateUser(userDTO);
//		if (!validationErrors.isEmpty()) {
//			throw new EntityValidationException(User.class.getSimpleName(),validationErrors);
//		}
		User usr = usrRepository.save(user);
		System.out.println(usr.toString());
		return usr.getId_user();
	}

	public int delete(int id){

	    User user = usrRepository.findById(id);
	    usrRepository.delete(user);
	    return user.getId_user();
    }

    public User update(User user, int id){
        System.out.println(user.toString());
	    User user1 = usrRepository.findById(id);
        System.out.println(user1.toString());
	    user.setId_user(user1.getId_user());
	    usrRepository.save(user);
	    return user1;
    }


//	private List<String> validateUser(UserDTO usr) {
//		List<String> validationErrors = new ArrayList<String>();
//
//		if (usr.getFirstname() == null || "".equals(usr.getFirstname())) {
//			validationErrors.add("First Name field should not be empty");
//		}
//
//		if (usr.getSurname() == null || "".equals(usr.getSurname())) {
//			validationErrors.add("Surname field should not be empty");
//		}
//
//		if (usr.getEmail() == null || !validateEmail(usr.getEmail())) {
//			validationErrors.add("Email does not have the correct format.");
//		}
//
//		return validationErrors;
//	}

	public static boolean validateEmail(String email) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
		return matcher.find();
	}

}
