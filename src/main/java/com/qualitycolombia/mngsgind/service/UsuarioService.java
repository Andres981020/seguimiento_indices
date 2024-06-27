package com.qualitycolombia.mngsgind.service;

import org.springframework.stereotype.Service;

import com.qualitycolombia.mngsgind.entity.Usuario;

@Service
public class UsuarioService {
	
	public Usuario validarIngreso(Usuario u) {
		
		Usuario usuarioValidado1 = new Usuario();
		Usuario usuarioValidado2 = new Usuario();
		
		usuarioValidado1.setUsuario("Gabriel");
		usuarioValidado1.setPassword("12345");
		usuarioValidado1.setPerfil("ADM");
		usuarioValidado1.setNit("9999");
		
		usuarioValidado2.setUsuario("Luis");
		usuarioValidado2.setPassword("12345");
		usuarioValidado2.setPerfil("ADM");
		usuarioValidado2.setNit("9998");
		
		try {
			if(u.getUsuario().equals(usuarioValidado1.getUsuario()) && u.getPassword().equals(usuarioValidado1.getPassword())) {
				return usuarioValidado1;
			} else if(u.getPassword().equals(usuarioValidado2.getPassword()) && u.getUsuario().equals(usuarioValidado2.getUsuario())) { 
				return usuarioValidado2;
			}
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		return u;	
	}

}
