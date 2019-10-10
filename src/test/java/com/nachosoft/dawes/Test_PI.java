package com.nachosoft.dawes;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_PI {

	static Gestion gestor = new Gestion ();
	static Profesor p1 = new Profesor ();
	static Profesor p2 = new Profesor ("Nacho", "1108529P", LocalDate.of(1977, 6, 13), new ArrayList<CicloImpartido> ());
	static CicloFormativo c1 = new CicloFormativo("DAW", "Desarrollo Aplicaciones Web", new ArrayList<CicloImpartido>());
	
	@Test
	public void test() {
		System.out.println(p2);
		//assertEquals("Nacho", p2.getNombre());
		gestor.addProfesor(p1);
		gestor.addCicloFormativo(new CicloFormativo("DAW", "Desarrollo Aplicaciones Web",new ArrayList<CicloImpartido>()));
		gestor.asignaProfesor(p2,  c1, LocalDate.of(2019, 10, 10));
		gestor.toString();
		
	}
}
