package com.example.another_core_for_teaching.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// step 1
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String firstName;
    private String lastName;

    public void sayGreeting() {
        System.out.println("Hello I'm " + firstName + " " + lastName);
    }
}
