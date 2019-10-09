package com.nachosoft.dawes;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_PI {

	static Profesor p1 = new Profesor ();
	static Profesor p2 = new Profesor ("Nacho", "1108529P", LocalDate.of(1977, 6, 13));
	
	@Test
	public void test() {	
		assertEquals("Nacho", p2.getNombre());
	}
}
