package com.proyectodos.backend;

import com.proyectodos.backend.modelo.Rol;
import com.proyectodos.backend.modelo.Usuario;
import com.proyectodos.backend.modelo.UsuarioRol;
import com.proyectodos.backend.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd");
		Calendar calendar = Calendar.getInstance();
		Date fechaActual = calendar.getTime();
		Usuario usuario = new Usuario();
		 usuario.setNombres("Josue");
		 usuario.setApellidos("Soto");
		 usuario.setUsername("jesm");
		 usuario.setPassword("admin123");
		 usuario.setFechaNacimiento(fechaActual);
		 usuario.setSexo("M");
		 usuario.setEmail("js@proyectodos.com");
		 usuario.setTipoUsuario("ADMIN");
		 usuario.setFechaRegisto(fechaActual);
		 usuario.setPerfil("foto.png");

		 Rol rol = new Rol();
		 rol.setIdRol(1L);
		 rol.setNombre("ADMIN");

		 Set<UsuarioRol> usuarioRoles = new HashSet<>();
		 UsuarioRol usuarioRol = new UsuarioRol();
		 usuarioRol.setRol(rol);
		 usuarioRol.setUsuario(usuario);
		 usuarioRoles.add(usuarioRol);

		 Usuario usuarioGuardar = usuarioService.guardarUsuario(usuario,usuarioRoles);
		 System.out.println(usuarioGuardar.getUsername());*/
	}
}
