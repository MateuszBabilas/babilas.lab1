package babilas.lab1.db;


import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentRow,Long> {

}
