package com.example.another_core_for_teaching;

import com.example.another_core_for_teaching.model.Car;
import com.example.another_core_for_teaching.model.Person;
import org.slf4j.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnotherCoreForTeachingApplication implements CommandLineRunner{
    private final Car car;
    private final Person person;

    public AnotherCoreForTeachingApplication(Car car, Person person) {
        this.car = car;
        this.person = person;
    }

    public static void main(String[] args) {
        SpringApplication.run(AnotherCoreForTeachingApplication.class, args);

//        Logger logger = LoggerFactory.getLogger(AnotherCoreForTeachingApplication.class);
//
//        ApplicationContext applicationContext = SpringApplication.run(AnotherCoreForTeachingApplication.class, args);
//        logger.info("Person bean message {} : " + applicationContext.getBean("person"));
//        logger.info("Student bean message {} : " + applicationContext.getBean("student"));

        //==================== here to test scope ===============================

//        Person person1 = applicationContext.getBean(Person.class);
//        Person person2 = applicationContext.getBean(Person.class);
//
//        System.out.println("Person 1 : " + person1);
//        person1.setFirstName("Tharo");
//        System.out.println("Person 1 : " + person1);
//
//        System.out.println("Person 2 : " + person2);
    }

    @Override
    public void run(String... args) throws Exception {
        car.driving();
        System.out.println(person);
    }
}
