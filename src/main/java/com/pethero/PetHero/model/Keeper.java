package com.pethero.PetHero.model;

import com.pethero.PetHero.types.PetSize;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalTime;

public class Keeper extends Person {
    private PetSize petSize;
    private float pay;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private LocalTime horaInicial;
    private LocalTime horaFinal;

    public Keeper(String name, String lastname, LocalDate dateBirth, String dni, String telephone, String email, String city, String streetAddress, String streetNumber, PetSize petSize, float pay, LocalDate fechaInicio, LocalDate fechaFinal, LocalTime horaInicial, LocalTime horaFinal) {
        super(name, lastname, dateBirth, dni, telephone, email, city, streetAddress, streetNumber);
        this.petSize = petSize;
        this.pay = pay;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }
}
