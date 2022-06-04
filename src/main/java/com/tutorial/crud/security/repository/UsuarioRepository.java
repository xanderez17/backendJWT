package com.tutorial.crud.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.crud.security.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	public Optional<Usuario> findByUsername(String username);
	
	public boolean existsByUsername(String username);
	
	public boolean existsByEmail(String email);
}
