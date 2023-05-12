package babilas.lab1;

import babilas.lab1.db.StudentRepository;
import babilas.lab1.db.StudentRow;
import io.vavr.collection.List;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class StudentService {
    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getStudents(){
        return List.ofAll(this.repository.findAll())
                .map(getStudentRowStudentFunction()
                );
    }

    private static Function<StudentRow, Student> getStudentRowStudentFunction() {
        return dbObj ->
                new Student(
                        dbObj.getId(),
                        dbObj.getName(),
                        dbObj.getNumber(),
                        dbObj.getGroup());
    }

    public Student addStudent(NewStudent student){
        StudentRow created = this.repository.save(new StudentRow(
                student.name,
                student.number,
                student.studentGroup));
        return getStudentRowStudentFunction().apply(created);
    }
}
