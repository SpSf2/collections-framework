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
       
       Persona persona1 = Persona.builder()
       		.nombre("Duglas")
       		.primerApellido("González")
       		.segundoApellido("Villamizar")
       		.fechaNacimiento(LocalDate.of(1995, Month.APRIL, 15))
       		.genero(Genero.HOMBRE)
       		.build();
       		
              
       Persona persona2 = Persona.builder()
          		.nombre("Carolina")
          		.primerApellido("Garzón")
          		.segundoApellido("Becerra")
          		.fechaNacimiento(LocalDate.of(2000, Month.OCTOBER, 10))
          		.genero(Genero.MUJER)
          		.build();
          		
                    
       Persona persona3 = Persona.builder()
         		.nombre("María")
         		.primerApellido("Garzón")
         		.segundoApellido("González")
         		.fechaNacimiento(LocalDate.of(2005, Month.DECEMBER, 14))
         		.genero(Genero.MUJER)
         		.build();
         		
                  
       Persona persona4 = Persona.builder()
        		.nombre("Jeronimo")
        		.primerApellido("Arenal")
        		.segundoApellido("Gómez")
        		.fechaNacimiento(LocalDate.of(1989, Month.MAY, 22))
        		.genero(Genero.HOMBRE)
        		.build();
       
       personas.add(persona1);
       personas.add(persona2);
       personas.add(persona3);
       personas.add(persona4);
       
       /* EN LUGAR DE INVOCAR EL METODO ADD 4 VECES COMO SE HA MOSTRADO ANTERIORMENTE, SE PODRÍA AGREGAR ELEMENTOS
        *  A LA LISTA DE LA FORMA SIGUIENTE: */
       
       personas = (ArrayList<Persona>) Arrays.asList(persona1, persona2, persona3, persona4);
       
       /* Si la lista de personas apunta a "null", entonces no podemos agregar elementos "persona2 a dicha lista, porque, 
        * no hemos reservado memoria para la lista "personas.
        * 
        * ¿ Como se reserva memoria para la lista de "personas" ?
        * 
        * Utilizando el constructor de alguna de las clases que implementa la interfaz List*/
       
       
    }
}
