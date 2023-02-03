package com.example.another_core_for_teaching.config;

import com.example.another_core_for_teaching.model.Person;
import com.example.another_core_for_teaching.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigBean {

    @Bean
    @Scope("prototype")
    public Person person() {
        return new Person("John", "Snow");
    }
}
