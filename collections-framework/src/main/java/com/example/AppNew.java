package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;

public class AppNew {
    public static void main(String[] args) {

        var personas = new ArrayList<Persona>();

        personas.add(
            Persona.builder()
                .nombre("Duglas")
                .primerApellido("González")
                .segundoApellido("Villamizar")
                .fechaNacimiento(LocalDate.of(1995, Month.APRIL, 15))
                .genero(Genero.HOMBRE)
                .salario(3500.50)
                .build());

        personas.add(
            Persona.builder()
                .nombre("Carolina")
                .primerApellido("Garzón")
                .segundoApellido("Becerra")
                .fechaNacimiento(LocalDate.of(2000, Month.OCTOBER, 10))
                .genero(Genero.MUJER)
                .salario(3650.45)
                .build());

        personas.add(
            Persona.builder()
                .nombre("María")
                .primerApellido("Garzón")
                .segundoApellido("González")
                .fechaNacimiento(LocalDate.of(2005, Month.DECEMBER, 14))
                .genero(Genero.MUJER)
                .salario(3750.65)
                .build());

        personas.add(
            Persona.builder()
                .nombre("Jeronimo")
                .primerApellido("Arenal")
                .segundoApellido("Gómez")
                .fechaNacimiento(LocalDate.of(1989, Month.MAY, 22))
                .genero(Genero.HOMBRE)
                .salario(3450.25)
                .build());

        Collections.sort(personas);

        personas.forEach(System.out::println);
    }
}