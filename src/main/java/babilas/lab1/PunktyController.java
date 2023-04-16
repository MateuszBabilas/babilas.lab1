package babilas.lab1;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/punkty")
public class PunktyController {
    private StudentService service=new StudentService();

    @RequestMapping(value = "/students", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Student> getUsers() {
        return this.service.getStudents().asJava();
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Student addUser(@RequestBody NewStudent student) {
        return this.service.addStudent(student);
    }
}
