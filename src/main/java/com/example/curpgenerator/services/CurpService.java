package com.example.curpgenerator.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curpgenerator.models.CurpRequest;

@Service
public class CurpService {
	
	 private final Map<String, String> estadoClaveMap;

	 @Autowired
	 public CurpService(Map<String, String> estadoClaveMap) {
		 this.estadoClaveMap = estadoClaveMap;
	 }

    public String generateCurp(CurpRequest request) {
    	 String primerApellido = request.getPrimerApellido();
         String segundoApellido = request.getSegundoApellido();
         String nombre = request.getNombre();
         String fechaNacimientoStr = request.getFechaNacimiento();
         String sexo = request.getSexo();
         String estadoNacimiento = obtenerClavePorEstado(request.getEstadoNacimiento());
         
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);
         
         String fechaNacimientoFormatted = fechaNacimiento.format(DateTimeFormatter.ofPattern("yyMMdd"));
         
         String curp = "";
         
         curp = primerApellido.substring(0, 2) +
        		segundoApellido.substring(0, 1) +
        		/*nombre.substring(0, 1) +*/
        		fechaNacimientoFormatted +
        		sexo + 
        		obtenerEntidad(estadoNacimiento) +
        		obtenerPrimeraConsonanteInterna(primerApellido) +
        		obtenerPrimeraConsonanteInterna(segundoApellido) +
        		obtenerPrimeraConsonanteInterna(nombre) +
        		"0"+
        		"9";
        		
        return curp;
    }
    
    private String obtenerEntidad(String estado) {
    	return estado;
    }
    

    public static String obtenerPrimeraConsonanteInterna(String palabra) {
        palabra = palabra.toLowerCase();
        for (int i = 1; i < palabra.length() - 1; i++) {
            char letra = palabra.charAt(i);
            if (esConsonante(letra)) {
                return String.valueOf(letra);
            }
        }
        return "";
    }

    
    public static boolean esConsonante(char letra) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(letra) != -1;
    }
    
    public String obtenerClavePorEstado(String nombreEstado) {
        
        nombreEstado = nombreEstado.trim().toUpperCase();

        String clave = estadoClaveMap.get(nombreEstado);

        if (clave == null) {
            throw new IllegalArgumentException("Estado no encontrado en el mapa: " + nombreEstado);
        }

        return clave;
    }
}