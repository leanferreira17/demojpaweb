package net.leanif17.demojpaweb;

import net.leanif17.demojpaweb.interfaces.PersonRepository;
import net.leanif17.demojpaweb.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class DemojpawebApplication implements CommandLineRunner {
    @Autowired
    PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemojpawebApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Person person = new Person();
        person.setName("Pepe");
        person.setAge(34);
        personRepository.save(person);

        person = new Person();
        person.setName("Ana");
        person.setAge(78);
        personRepository.save(person);

        personRepository.findAll().forEach(obj -> {
            System.out.println("Resultado: " + ((Person) obj).getName() + " " + ((Person) obj).getAge());
        });
    }
}
