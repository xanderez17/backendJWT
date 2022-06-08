
package com.tutorial.crud.security.utils; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tutorial.crud.security.entity.Rol;
import com.tutorial.crud.security.enums.RolNombre;
import com.tutorial.crud.security.services.RolService;

@Component
public class CreateRoles implements CommandLineRunner{

	@Autowired
	RolService rolService;
	
	@Override
	public void run(String... args) throws Exception {
		Rol rolDocente = new Rol(RolNombre.ROLE_DOCENTE);
		// rolService.save(rolDocente);
	}

}
