package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/")
    public String index(Model model)
    {
        //First let's create a person
        Person person = new Person();
        person.setName("Morgan Miller");
        person.setSsn("555-01-2345");

        //Now let's create a passport
        Passport passport = new Passport();
        passport.setPassportNumber(123456789L);
        passport.setPassportDate("11-18-2018");

        //Add the passport to the person
        person.setPassport(passport);

        //Save the employee to the database
        personRepository.save(person);

        //Grab all the employees from the database and send them to the template
        model.addAttribute("persons", personRepository.findAll());
        return "index";
    }
}