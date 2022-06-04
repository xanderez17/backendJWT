package com.tutorial.crud.security.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tutorial.crud.security.entity.Usuario;
import com.tutorial.crud.security.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Optional<Usuario> getByUsername(String username){
		return usuarioRepository.findByUsername(username);
	}
	
	public boolean existByUsername(String username) {
		return usuarioRepository.existByUsername(username);
	}
	
	public boolean existByEmail(String email) {
		return usuarioRepository.existByEmail(email);
	}
	
	public void save(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

}
