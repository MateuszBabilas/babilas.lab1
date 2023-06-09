package babilas.lab1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NewStudent {
    final String name;
    final String number;
    final String studentGroup;
    @JsonCreator
    public NewStudent(@JsonProperty("name") String name,@JsonProperty("number") String number, @JsonProperty("studentGroup") String studentGroup) {
        this.name = name;
        this.number = number;
        this.studentGroup = studentGroup;
    }
}
