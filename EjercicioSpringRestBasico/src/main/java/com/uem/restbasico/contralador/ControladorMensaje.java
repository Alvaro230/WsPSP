package com.uem.restbasico.contralador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.uem.restbasico.entidad.VideoJuego;

public class ControladorMensaje {
	private VideoJuego v;
	/*
	 * private String mensaje = "Esto es un mensaje de prueba";
	 * 
	 * // para acceder http://localhost:8090/mensaje
	 * 
	 * @GetMapping("mensaje") public String obtenerMensaje() { return mensaje;
	 * 
	 * }
	 */

	// http://localhost:8090/videojuego
	@GetMapping("videojuego")
	public VideoJuego sacarVideoJuego() {
		v = new VideoJuego();
		v.setId(1);
		v.setNombre("Fifa 2021");
		v.setCompania("EA Sport");
		v.setPrecio(60);
		return v;
	}

	@PutMapping("videojuego")
	public VideoJuego cambiarPrecio() {
		v.setPrecio(v.getPrecio() + 10);
		return v;
	}
}
