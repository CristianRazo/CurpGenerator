package com.example.curpgenerator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curpgenerator.models.CurpMessage;
import com.example.curpgenerator.models.CurpRequest;
import com.example.curpgenerator.models.Message;
import com.example.curpgenerator.services.CurpService;
import com.example.curpgenerator.services.EdoNacimientoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/curp")
public class CurpController {

	private final CurpService curpService;
    private final EdoNacimientoService estadoNacimiento;

    @Autowired
    public CurpController(CurpService curpService, EdoNacimientoService estadoNacimiento) {
        this.curpService = curpService;
        this.estadoNacimiento = estadoNacimiento;
    }

	@PostMapping("/generate")
	public ResponseEntity<Message> generateCurp(@Valid @RequestBody CurpRequest request, BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return new ResponseEntity<>(new Message(bindingResult.getFieldError().getDefaultMessage()), HttpStatus.BAD_REQUEST);
		
		if(!estadoNacimiento.obtenerClavePorEstado(request.getEstadoNacimiento()))
			return new ResponseEntity<>(new Message("El estado de nacimiento no es valido"), HttpStatus.BAD_REQUEST);
		
		String curp = curpService.generateCurp(request);
		return new ResponseEntity<>(new CurpMessage(curp.toUpperCase()), HttpStatus.OK);
	}
}
