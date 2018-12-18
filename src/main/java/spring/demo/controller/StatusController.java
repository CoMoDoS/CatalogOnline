package spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.demo.entities.Status;
import spring.demo.services.StatusService;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
    public Status getStatusById(@PathVariable("id") int id) {
        return statusService.findStatusById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Status> getAllStatuss() {
        return statusService.findAll();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insertStatus(@RequestBody Status lecture) {
        return statusService.create(lecture);
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public int deleteStatus(@PathVariable("id") int id) {
        return statusService.delete(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Status updateStatus(@RequestBody Status lecture, @PathVariable("id") int id) {
        return statusService.update(lecture, id);
    }
}
