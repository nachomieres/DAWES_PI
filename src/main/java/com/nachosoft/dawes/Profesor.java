package com.nachosoft.dawes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Profesor {
	private String dni;
	private String nombre;
	private LocalDate fechaFuncionariado;
	private ArrayList<CicloImpartido> ciclos;
	
	public Profesor (String n, String d, LocalDate f, ArrayList<CicloImpartido> c) {
		super ();
		this.nombre = n;
		this.dni = d;
		this.fechaFuncionariado = f;
		this.ciclos = c;
	}
	
	public Profesor() {
		super ();
		this.ciclos = new ArrayList<CicloImpartido>();
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the fechaFuncionariado
	 */
	public LocalDate getFechaFuncionariado() {
		return fechaFuncionariado;
	}
	/**
	 * @param fechaFuncionariado the fechaFuncionariado to set
	 */
	public void setFechaFuncionariado(LocalDate fechaFuncionariado) {
		this.fechaFuncionariado = fechaFuncionariado;
	}
	
	public ArrayList<CicloImpartido> getCiclos() {
		return ciclos;
	}

	public void setCiclos(ArrayList<CicloImpartido> ciclos) {
		this.ciclos = ciclos;
	}

	
	@Override
	public String toString () {
		return "Profesor: [Nombre: " + this.nombre + ", dni: " + this.dni + ", Fecha acecso carrera: " + this.fechaFuncionariado + "]";		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciclos == null) ? 0 : ciclos.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((fechaFuncionariado == null) ? 0 : fechaFuncionariado.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (ciclos == null) {
			if (other.ciclos != null)
				return false;
		} else if (!ciclos.equals(other.ciclos))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (fechaFuncionariado == null) {
			if (other.fechaFuncionariado != null)
				return false;
		} else if (!fechaFuncionariado.equals(other.fechaFuncionariado))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	
	
	
}
