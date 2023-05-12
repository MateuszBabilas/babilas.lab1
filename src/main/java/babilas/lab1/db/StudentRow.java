package babilas.lab1.db;


import javax.persistence.*;

@Entity
@Table(name = "student_row")
public class StudentRow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String number;
    private String studentGroup;

    protected StudentRow(){};

    public StudentRow(String name, String number, String studentGroup) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.studentGroup = studentGroup;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getGroup() {
        return studentGroup;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setGroup(String group) {
        this.studentGroup = group;
    }
}
