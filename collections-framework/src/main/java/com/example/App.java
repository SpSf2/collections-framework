package com.example;

import java.time.LocalDate;
import java.time.Month;
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
        
       List<Persona> personas = null;
       
       Persona persona1 = Persona.builder()
       		.nombre("Duglas")
       		.primerApellido("González")
       		.segundoApellido("Villamizar")
       		.fechaNacimiento(LocalDate.of(1995, Month.APRIL, 15))
       		.genero(Genero.HOMBRE)
       		.build();
       		
       personas.add(persona1);
       
       /* Si la lista de personas apunta a "null", entonces no podemos agregar elementos "persona2 a dicha lista, porque, 
        * no hemos reservado memoria para la lista "personas.
        * 
        * ¿ Como se reserva memoria para la lista de "personas" ?
        * 
        * Utilizando el constructor de alguna de las clases que implementa la interfaz List*/
       
       
    }
}
