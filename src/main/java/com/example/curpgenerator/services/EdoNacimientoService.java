package com.example.curpgenerator.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdoNacimientoService {
	private final Map<String, String> estadoClaveMap;

	 @Autowired
	 public EdoNacimientoService(Map<String, String> estadoClaveMap) {
		 this.estadoClaveMap = estadoClaveMap;
	 }
	 
	 public boolean obtenerClavePorEstado(String nombreEstado) {
	        
	        nombreEstado = nombreEstado.trim().toUpperCase();

	        String clave = estadoClaveMap.get(nombreEstado);

	        if (clave == null) {
	            return false;
	        }

	        return true;
	 }
}
