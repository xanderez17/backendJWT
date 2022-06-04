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
	public UsuarioRepository usuarioRepository;
	
	public Optional<Usuario> getByUsername(String username){
		return usuarioRepository.findByUsername(username);
	}
	
	public boolean existsByUsername(String username) {
		return usuarioRepository.existsByUsername(username);
	}
	
	public boolean existsByEmail(String email) {
		return usuarioRepository.existsByEmail(email);
	}
	
	public void save(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

}
