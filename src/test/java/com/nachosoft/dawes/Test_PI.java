package com.nachosoft.dawes;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_PI {

	static Gestion gestor = new Gestion ();
	static Profesor p1 = new Profesor ("Pepe", "11085294A", LocalDate.of (1970, 1,2), new ArrayList<CicloImpartido>());
	static Profesor p2 = new Profesor ("Nacho", "1108529P", LocalDate.of(1977, 6, 13), new ArrayList<CicloImpartido> ());
	static Profesor p3 = new Profesor ("Cris", "71766930P", LocalDate.of(183, 6, 2), new ArrayList<CicloImpartido> ());
	
	static CicloFormativo c1 = new CicloFormativo("DAW", "Desarrollo Aplicaciones Web", new ArrayList<CicloImpartido>());
	static CicloFormativo c2 = new CicloFormativo("DAM", "Desarrollo Aplicaciones Multiplataforma", new ArrayList<CicloImpartido>());
	static CicloFormativo c3 = new CicloFormativo("DPE", "Desarrollo Productos Electronicos", new ArrayList<CicloImpartido>());
	
	@BeforeClass
	public static void antesDeLaClase() {
		gestor.addProfesor(p1);
		gestor.addProfesor(p2);
		gestor.addProfesor(p3);
		gestor.addCicloFormativo(c1);
		gestor.addCicloFormativo(c2);
		gestor.addCicloFormativo(c3);
		gestor.asignaProfesor(p1, c1, LocalDate.of(2013, 10, 1));
		gestor.asignaProfesor(p2,  c1, LocalDate.of(2019, 10, 1));
		gestor.asignaProfesor(p3, c1, LocalDate.of(2015,10,1));
		
		gestor.asignaProfesor(p2,  c2, LocalDate.of(2019, 10, 2));
		gestor.asignaProfesor(p2, c3, LocalDate.of(2019, 10, 1));
		
		gestor.getCiclosImpartidos(p2);
		
		gestor.getProfesoresCiclo(c1);
		gestor.getCiclosyProfesores();
		
		gestor.getProfesoresCicloMasTresAnnos(c1);
	}
	
	@Test
	public void test() {				
		
	}
}
