package com.pethero.PetHero.model;

import java.time.LocalDate;

public abstract class Person {
    private int id;
    private String name;
    private String lastname;
    private LocalDate dateBirth;
    private String dni;
    private String telephone;
    private String email;
    private String city;
    private String streetAddress;
    private String streetNumber;

    public Person(String name, String lastname, LocalDate dateBirth, String dni, String telephone, String email, String city, String streetAddress, String streetNumber) {
        this.name = name;
        this.lastname = lastname;
        this.dateBirth = dateBirth;
        this.dni = dni;
        this.telephone = telephone;
        this.email = email;
        this.city = city;
        this.streetAddress = streetAddress;
        this.streetNumber = streetNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateBirth=" + dateBirth +
                ", dni='" + dni + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                '}';
    }
}
