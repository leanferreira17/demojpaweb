package net.leanif17.demojpaweb.configuration;

import net.leanif17.demojpaweb.models.Address;
import net.leanif17.demojpaweb.models.Person;
import net.leanif17.demojpaweb.models.Profession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Clase responsable de la configuración de los beans que seran manipulados por el IoC Container
 */
@Configuration
public class AppConfiguration {

    @Bean
    public Person person() {
        Person person = new Person();
        //person.setAddress(address());
        //person.setProfession(profession());
        return person;
    }

    @Bean
    public Address address() {
        return new Address();
    }

    @Bean
    public Profession profession() {
        return new Profession();
    }
}
