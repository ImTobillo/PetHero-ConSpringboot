package com.pethero.PetHero.model;

import java.time.LocalDate;

public class Owner extends Person{
    public Owner(String name, String lastname, LocalDate dateBirth, String dni, String telephone, String email, String city, String streetAddress, String streetNumber) {
        super(name, lastname, dateBirth, dni, telephone, email, city, streetAddress, streetNumber);
    }
}
