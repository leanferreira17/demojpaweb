package net.leanif17.demojpaweb.models;

import org.springframework.beans.factory.annotation.Required;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int age;
    //private Profession profession;
    //private Address address;

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Required
    public void setAge(int age) {
        this.age = age;
    }

    /*public Profession getProfession() {
        return profession;
    }

    @Required
    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Address getAddress() {
        return address;
    }

    @Required
    public void setAddress(Address address) {
        this.address = address;
    }*/
}
