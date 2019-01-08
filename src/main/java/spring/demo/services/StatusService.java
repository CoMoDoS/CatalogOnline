package spring.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.demo.entities.Status;
import spring.demo.errorhandler.ResourceNotFoundException;
import spring.demo.repositories.StatusRepository;

import java.util.ArrayList;
import java.util.List;
@Service
public class StatusService {

    @Autowired
    private StatusRepository statusRepository;

    public Status findStatusById(int statusId) {
        Status status = statusRepository.findById(statusId);
        System.out.println(status.toString());
        if (status == null) {
            throw new ResourceNotFoundException(Status.class.getSimpleName());
        }

        return status;
    }

    public List<Status> findAll() {
        List<Status> statuss = new ArrayList<Status>();
        statuss =	statusRepository.findAll();
        return statuss;
    }

    public int create(Status status){
        Status l = statusRepository.save(status);
        return l.getId_status();
    }

    public int delete(int id){

        Status status = statusRepository.findById(id);
        statusRepository.delete(status);
        return status.getId_status();
    }

    public Status update(Status status, int id){
        System.out.println(status.toString());
        Status status1 = statusRepository.findById(id);
        System.out.println(status1.toString());
        status.setId_status(status1.getId_status());
        statusRepository.save(status);
        return status1;
    }

    public Status updateMark(int mark, int id) {
        Status status = new Status();
        try {
            status = statusRepository.findByIdTeacher(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        if ( status.getId_status() != null) {
            status.setMark(mark);
            statusRepository.save(status);
        }
        return status;
    }
}
