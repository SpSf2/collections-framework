package com.example;

import java.time.LocalDate;

import lombok.Builder;

@Builder
public record Persona (
		String nombre,
		String primerApellido,
		String segundoApellido,
		LocalDate fechaNacimiento,
		Genero genero,
		double salario 
)  implements Comparable<Persona>    {
	
	@Override
	public int compareTo(Persona persona)  {
		
		/*  Resultado de la comparación por el primer apellido, de dos personas de la lista personas*/
        int cmpPrimerApellido = this.primerApellido
        		.compareTo(persona.primerApellido());
        // Resultado de la comparación del segundo apellido
        int cmpSegundoApellido = this.segundoApellido
        		.compareTo(persona.segundoApellido());
	    // Resultado de la comparación por Nombre
        int cmpNombre = this.nombre.compareTo(persona.nombre());
        
        return cmpPrimerApellido != 0 ? cmpPrimerApellido : 
        			cmpSegundoApellido != 0 ? cmpSegundoApellido : 
        					cmpNombre;
        
        
	}
}


