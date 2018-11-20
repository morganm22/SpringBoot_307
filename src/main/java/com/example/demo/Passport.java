package com.example.demo;

import javax.persistence.*;

@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private long PassportNumber;
    private String PassportDate;
    @OneToOne(mappedBy = "passport")
    private Person person;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPassportNumber() {
        return PassportNumber;
    }

    public void setPassportNumber(long passportNumber) {
        PassportNumber = passportNumber;
    }

    public String getPassportDate() {
        return PassportDate;
    }

    public void setPassportDate(String passportDate) {
        PassportDate = passportDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
