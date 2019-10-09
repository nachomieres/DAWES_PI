package com.nachosoft.dawes;

import java.util.Scanner;
import java.util.TreeMap;

public class Gestion {
	private Scanner sc;
	private TreeMap<String, Profesor> profesores;
	private TreeMap<String, CicloFormativo> ciclos;
	
	public Gestion () {
		this.profesores = new TreeMap<String, Profesor>();
		this.ciclos = new TreeMap<String, CicloFormativo>();
		this.sc = new Scanner(System.in);
	}
	
	public void addProfesor (Profesor p) {
		this.profesores.put(p.getDni(), p);
	}
	
	public void addCicloFormativo (CicloFormativo c) {
		this.ciclos.put(c.getDenCorta(), c);
	}
	
	

}
