package com.uem.ejemplohash.controlador;

import java.security.NoSuchAlgorithmException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uem.ejemplohash.modelo.entidad.Usuario;
import com.uem.ejemplohash.modelo.negocio.GestorUsuario;
import com.uem.ejemplohash.util.HashearPasswords;

@Controller
public class ControladorUsuario {
	@Autowired
	private GestorUsuario gestorUsuario;

	@PostMapping("/doRegister")
	public String register(@RequestParam("nombre") String username, @RequestParam("pass") String password, Model model,
			@RequestParam("boton") String boton)
			throws SQLIntegrityConstraintViolationException, NoSuchAlgorithmException {

		if (boton.equals("Atras")) {
			return "redirect:login.html";
		} else {
			System.out.println("Entrando register");
			Usuario usuario = new Usuario();
			usuario.setUsername(username);
			String passwordHash = HashearPasswords.cifrarPassword(password);
			usuario.setPassword(passwordHash);

			boolean validado = gestorUsuario.alta(usuario);

			if (validado) {
				List<String> lista = new ArrayList<String>();
				lista.add(username);
				lista.add(password);
				model.addAttribute("lista", lista);
				return "inicio";
			} else {
				return "errorLogin";
			}
		}
	}

	@PostMapping("/doLogin")
	public String login(@RequestParam("nombre") String username, @RequestParam("pass") String password, Model model,
			@RequestParam("boton") String boton) throws NoSuchAlgorithmException {

		if (boton.equals("Registrarse")) {
			return "redirect:register.html";
		} else {
			System.out.println("Entrando login");
			Usuario usuario = new Usuario();
			usuario.setUsername(username);
			String passwordHash = HashearPasswords.cifrarPassword(password);
			usuario.setPassword(passwordHash);

			boolean validado = gestorUsuario.validar(usuario);

			if (validado) {
				List<String> lista = new ArrayList<String>();
				lista.add(username);
				lista.add(password);
				model.addAttribute("lista", lista);
				return "inicio";
			} else {
				return "errorLogin";
			}
		}
	}

}
