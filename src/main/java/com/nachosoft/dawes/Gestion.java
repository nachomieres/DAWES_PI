package com.nachosoft.dawes;

import java.time.LocalDate;
import java.time.Period;
import java.util.TreeMap;

public class Gestion {
	private TreeMap<String, Profesor> profesores;
	private TreeMap<String, CicloFormativo> ciclos;
	
	public Gestion () {
		this.profesores = new TreeMap<String, Profesor>();
		this.ciclos = new TreeMap<String, CicloFormativo>();
	}
	
	public void addProfesor (Profesor p) {
		this.profesores.put(p.getDni(), p);
	}
	
	public void addCicloFormativo (CicloFormativo c) {
		this.ciclos.put(c.getDenCorta(), c);
	}
	
	public void asignaProfesor (Profesor p, CicloFormativo c, LocalDate fecha) {
		CicloImpartido cp = new CicloImpartido(p, c, fecha);
		p.getCiclos().add(cp);
		c.getProfesores().add(cp);
	}
	
	public void getCiclosImpartidos (Profesor p) {
		System.out.println("Ciclos del profesor " + p.getNombre());
		profesores.get(p.getDni()).getCiclos().forEach(x -> {
			System.out.println("- " + x.getCiclo().getDenCorta() + " - " + x.getCiclo().getDenLarga());
		});
		System.out.println("-----------------------------------------------------------");

	}
	
	public void getProfesoresCiclo (CicloFormativo c) {
		System.out.println("Profesores del Ciclo " + c.getDenCorta() + " - " + c.getDenLarga());
		ciclos.get(c.getDenCorta()).getProfesores().forEach(x -> {
			System.out.println("- " + x.getProfesor().getNombre() + " DNI: " + x.getProfesor().getDni() + " Imparte desde " + x.getFechaComienzo());
		});
		System.out.println("-----------------------------------------------------------");
	}
	
	public void getCiclosyProfesores () {
		this.ciclos.values().forEach(x -> {
			System.out.println("Ciclo Formativo " + x.getDenCorta() + " - " + x.getDenLarga());
			this.getProfesoresCiclo(x);
		});
		System.out.println("-----------------------------------------------------------");
	}
	
	public void getProfesoresCicloMasTresAnnos (CicloFormativo c) {
		LocalDate hoy = LocalDate.now();
		this.ciclos.get(c.getDenCorta()).getProfesores().forEach(x -> {			
			if (Period.between(x.getFechaComienzo(), hoy).getYears() >= 3) {
				System.out.println("- " + x.getProfesor().getNombre() + " DNI: " + x.getProfesor().getDni() + " Imparte desde " + x.getFechaComienzo());
			}
		});
	}
	

}
