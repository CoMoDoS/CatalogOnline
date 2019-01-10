package spring.demo.services;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.demo.dto.*;
import spring.demo.errorhandler.ResourceNotFoundException;
import spring.demo.entities.User;
import spring.demo.repositories.AdminRepository;
import spring.demo.repositories.UserRepository;

@Service
public class AdminService {
    private static final String SPLIT_CH = " ";
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
            Pattern.CASE_INSENSITIVE);

    @Autowired
    private AdminRepository adminRepository;


    public List<Students> getStudents() {
        List<Students> students = new ArrayList<>();

        try{
            students = adminRepository.getStudents();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return students;
    }

    public List<Lesons> getLesons() {
        List<Lesons> lesons = new ArrayList<>();

        try{
            lesons = adminRepository.getLesons();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return lesons;
    }

    public List<Users> getUsers() {
        List<Users> users = new ArrayList<>();

        try{
            users = adminRepository.getUsers();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return users;
    }


    public int sendMail(Students user) {
        final MailService mailService = new MailService("comodos.n346@gmail.com","ParolaGoogle123");
        Object object = user.toString();

        mailService.sendMail("ilie.neag96@gmail.com","Dummy Mail Title",  object.toString());
        return 1;
    }

    public List<String> getSituation() throws FileNotFoundException, UnsupportedEncodingException {
        List<String> list = adminRepository.getSituation();
//        for(String a : list){
//            WriteFileService.writeFile(a);
//        }


        return list;
    }
}
