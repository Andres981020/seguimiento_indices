package com.qualitycolombia.mngsgind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.qualitycolombia.mngsgind.entity.Informe;
import com.qualitycolombia.mngsgind.service.InformeService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("mngsgind")
public class InformeController {
	
	@Autowired
	private InformeService informeService;
	
	@GetMapping("/informe/{nit}/{perfil}")
	public ResponseEntity<?> obtenerInformes(@PathVariable String nit, @PathVariable String perfil) throws JsonProcessingException {
		
		if(nit.equals("9999")) {
			List<Informe> obj = informeService.obtenerInformesUsuario1();
			return new ResponseEntity<List<Informe>>(obj, HttpStatus.OK);
		} else if(nit.equals("9998")) {
			List<Informe> obj = informeService.obtenerInformesUsuario2();
			return new ResponseEntity<List<Informe>>(obj, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
