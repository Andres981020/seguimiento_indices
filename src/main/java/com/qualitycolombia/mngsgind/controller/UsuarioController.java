package com.qualitycolombia.mngsgind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qualitycolombia.mngsgind.entity.Usuario;
import com.qualitycolombia.mngsgind.service.UsuarioService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("mngsgind")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/ingresar")
	public ResponseEntity<Usuario> ingreso(@RequestBody Usuario u) {
		
		Usuario obj = usuarioService.validarIngreso(u);
		
		return new ResponseEntity<Usuario>(obj, HttpStatus.OK);
	}

}
