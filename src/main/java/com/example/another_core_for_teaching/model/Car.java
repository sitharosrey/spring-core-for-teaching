package com.example.another_core_for_teaching.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Person person;
    private final Student student;

//    @Autowired
//    public void setStudent(Student student) {
//        this.student = student;
//    }

    public Car(Person person, Student student){
        this.person = person;
        this.student = student;
    }
    public void driving() {
        System.out.println("This is inside driving method.");

        student.setStudentName("Tharo");
        System.out.println(student.getStudentName() + " is driving !!");
    }
}
