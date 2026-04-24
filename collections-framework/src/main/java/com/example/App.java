package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
       System.out.println("----------LISTADO ORIGINAL DE PERSONAS---------\n");
       System.out.println(personas);
       
       //  Traversing Collections:
       
       //https://docs.oracle.com/javase/tutorial/collections/interfaces/collection.html
       // ver el documento Arrays, Generics and Collection Framework
       
       /* Existen 3 formas de recorrer una colección, de las cuales solamnete una permite eliminar elementos
        * de una clección a la vez que se recorre:
        * 
        * 1- Utilizando un iterador, es decir, interfaz Iterator<E> que es la única forma de eliminar un ele-
        * mento de la colección a la misma vez que se recorre.
        * 
        * 2- Utilizando una sentencia For mejorada.
        * 3- La VARIANTE SUGERIDA: utilizando operaciones de agregado, es decir, Programación Funcional, meto-
        * dos de clase Stream, métodos por referencia y peraciones Lambda.   
        * */
       /*  VARIANTE 1 DE RECORRER / ITERAR SOBRE UNA COLECCION UTILIZANDO UN ITERADOR:
        * 
        *  Vamos a recorrer la colección de personas y eliminar las personas del genero HOMBRE*/
       
       
       
       /* Iterator<Persona> it = personas.iterator();
       
       while (it.hasNext()) {
    	   
    	   if (it.next().genero().equals(Genero.HOMBRE))  {
    		   
    		   it.remove();
    	   }
       }
       
       
       
       System.out.println("\n----------LISTADO resultante DESPUES DE ELIMINAR PERSONAS DEL GENERO HOMBRE---------\n");
       System.out.println(personas);  /*
       
       /* Ejercicio #1
        * Utilizando un iterador, eliminar del listado personas, aquellas que sean del genero HOMBRE y el nombre tenga
        * 6 caracteres.  Se hará un commit antes de realizar el ejercicio para luego comentar el iterador y tener la 
        * lista original  sin elemento eliminados*/
       
			Iterator<Persona> it = personas.iterator();
			       
			       while (it.hasNext()) {
			    	   
			    	   Persona ejemplo = it.next(); // variable que suplanta al metodo y adquiere su valor
			    	   
			    	   if (ejemplo.genero().equals(Genero.HOMBRE) && ejemplo.nombre().length() == 6)  {
			    		   
			    		   it.remove();
			    		   
			   /* El problema al añadir la longitud del nombre, Cuando quieres añadir “nombre con 6 caracteres”, 
			    * es que necesitas acceder dos veces al mismo elemento:
						
					Una para genero()
					
					Otra para nombre().length()
					
					Pero si haces:
										
					if (it.next().genero().equals(...) && it.next().nombre().length() == 6) { ... }
					cada it.next() avanza al siguiente elemento, así que comparas un hombre con un elemento 
					distinto, y rompe todo.
					
					Así que la única forma limpia es (con variable)*/
    	   }
             	     	   
		}
	       System.out.println("\n----------LISTADO resultante DESPUES DE ELIMINAR a Duglas---------\n");
           System.out.println(personas);	  
    }
}
