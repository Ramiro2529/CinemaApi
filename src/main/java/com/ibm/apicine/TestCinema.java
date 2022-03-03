package com.ibm.apicine;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ibm.apicine.entidades.Administrador;
import com.ibm.apicine.entidades.Direccion;
import com.ibm.apicine.entidades.Empleado;
import com.ibm.apicine.entidades.Persona;
import com.ibm.apicine.entidades.Usuario;
import com.ibm.apicine.enums.TipoEmpleado;
import com.ibm.apicine.servicios.AdministradorDAO;
import com.ibm.apicine.servicios.EmpleadoDAO;
import com.ibm.apicine.servicios.UsuarioDAO;

@Component
public class TestCinema implements CommandLineRunner{
	
	@Autowired
	private UsuarioDAO usuarioDao;
	
	@Autowired
	private AdministradorDAO adminDao;
	
	@Autowired
	private EmpleadoDAO empleadoDao;

	@Override
	public void run(String... args) throws Exception {
		
		Direccion direccionPam = new Direccion("Ostion", "4", "15670", "3", "2", "CDMX");
		Direccion direccionAxel = new Direccion("Ostion", "4", "15670", "3", "2", "CDMX");
		
		Persona pamela = new Usuario(null,"Pamela", "Valenzuela", "23", 'F', "Ramiro", "pamela03", "pamela@gmail.com",direccionPam);
		Persona axel = new Usuario(null,"Axel", "Alvarez", "22", 'M', "Ramiro", "Axel10", "axel@gmail.com",direccionAxel);
		
		Direccion direccionFlor = new Direccion("Ostion", "4", "15670", "3", "2", "CDMX");
		Persona flor = new Administrador(null, "Flor", "Saldaña", "50", 'F',"Ramiro", "flor0343", "flor@gmail.com", direccionFlor);
		
		Persona lucho = new Empleado(null, "Eduardo", "Salamanca", "45", 'M', "Ramiro",direccionFlor,TipoEmpleado.GERENTE,new BigDecimal(15000));
		
		
//		usuarioDao.guardarTodos(List.of(pamela,axel));
//		
//		adminDao.guardar(flor);
//		empleadoDao.guardar(lucho);
		
		
		
	}

}
