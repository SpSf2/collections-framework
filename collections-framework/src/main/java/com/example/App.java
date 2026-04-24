package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * El Framework de Collecciones:
 * 
 *  https://docs.oracle.com/javase/tutorial/collections/index.html
 */
public class App {
    public static void main(String[] args) {
    	
    	/* Colleccion de numeros enteros, a partir de un array */
    	
    	Integer[] arrayNumerosEnteros = {1, 2, 3, 4, 5};
    	
    	List<Integer> numerosEnteros = Arrays.asList(arrayNumerosEnteros);
    	
    	/* Una coleccion obtenida directamente a partir de un array es una coleccion
    	 * de tamaño fijo, es decir, que no se le puedan agregar ni eliminar elementos,
    	 * pero si se pueden modificar los elementos, porque de lo contrario seria 
    	 * inmutable*/
    	
    	// numerosEnteros.add(6);
    	
    	/* Ejemplo de creacion de lista (Colección) utilizando el método add() que es polimorfico, para agregar elementos
    	 * a la lista*/
        
    	// var, realmente es : List<Persona>, se utiliza para crear variables locales
    	var personas = new ArrayList<Persona>();
        
    	personas.add(
	  Persona.builder()
	       		.nombre("Duglas")
	       		.primerApellido("González")
	       		.segundoApellido("Villamizar")
	       		.fechaNacimiento(LocalDate.of(1995, Month.APRIL, 15))
	       		.genero(Genero.HOMBRE)
	       		.build());
       		
        personas.add(      
	  Persona.builder()
	      		.nombre("Carolina")
	      		.primerApellido("Garzón")
	      		.segundoApellido("Becerra")
	      		.fechaNacimiento(LocalDate.of(2000, Month.OCTOBER, 10))
	      		.genero(Genero.MUJER)
	      		.build());
      		
        personas.add(       
	  Persona.builder()
	    		.nombre("María")
	     		.primerApellido("Garzón")
	     		.segundoApellido("González")
	     		.fechaNacimiento(LocalDate.of(2005, Month.DECEMBER, 14))
	     		.genero(Genero.MUJER)
	     		.build());
     		
        personas.add(      
	  Persona.builder()
	    		.nombre("Jeronimo")
	    		.primerApellido("Arenal")
	    		.segundoApellido("Gómez")
	    		.fechaNacimiento(LocalDate.of(1989, Month.MAY, 22))
	    		.genero(Genero.HOMBRE)
	    		.build());
        /* La lista resultante "personas" no es de tamaño fijo porque no se ha obtanido a paartir de un array
         * por lo cual le puedo agregar o eliminar elementos a necesidad del usuario
         */
       
       System.out.println(personas);
    }
}
