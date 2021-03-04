package com.uem.ejemplohash.modelo.negocio;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uem.ejemplohash.modelo.entidad.Usuario;
import com.uem.ejemplohash.modelo.persistencia.DaoUsuario;

@Service
public class GestorUsuario {
	@Autowired	
	private DaoUsuario daoUsuario;

	public boolean alta(Usuario usuario) throws SQLIntegrityConstraintViolationException {
		boolean creado;
		try {
			daoUsuario.save(usuario);
			creado = true;
		} catch (Exception e) {
			System.out.println("Usuario ya en uso");
			creado = false;
		}
		return creado;
		
	}
	
	public boolean validar(Usuario usuario) {
		Optional<Usuario> userBBDD = 
				daoUsuario.findByUsername(usuario.getUsername());
		
		if(!userBBDD.isPresent()) {
			return false;
		}
		
		if(usuario.getPassword().equals(userBBDD.get().getPassword())){
			return true;
		}else {
			return false;
		}
	}
}
