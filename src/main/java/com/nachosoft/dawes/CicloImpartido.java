package com.nachosoft.dawes;

import java.time.LocalDate;

public class CicloImpartido {
	private Profesor profesor;
	private CicloFormativo ciclo;
	private LocalDate fechaComienzo;
	
	public CicloImpartido(Profesor profesor, CicloFormativo ciclo, LocalDate fechaComienzo) {
		super();
		this.setProfesor(profesor);
		this.setCiclo(ciclo);
		this.setFechaComienzo(fechaComienzo);
	}
	public CicloImpartido() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the profesor
	 */
	public Profesor getProfesor() {
		return profesor;
	}
	/**
	 * @param profesor the profesor to set
	 */
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	/**
	 * @return the ciclo
	 */
	public CicloFormativo getCiclo() {
		return ciclo;
	}
	/**
	 * @param ciclo the ciclo to set
	 */
	public void setCiclo(CicloFormativo ciclo) {
		this.ciclo = ciclo;
	}
	/**
	 * @return the fechaComienzo
	 */
	public LocalDate getFechaComienzo() {
		return fechaComienzo;
	}
	/**
	 * @param fechaComienzo the fechaComienzo to set
	 */
	public void setFechaComienzo(LocalDate fechaComienzo) {
		this.fechaComienzo = fechaComienzo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciclo == null) ? 0 : ciclo.hashCode());
		result = prime * result + ((fechaComienzo == null) ? 0 : fechaComienzo.hashCode());
		result = prime * result + ((profesor == null) ? 0 : profesor.hashCode());
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
		CicloImpartido other = (CicloImpartido) obj;
		if (ciclo == null) {
			if (other.ciclo != null)
				return false;
		} else if (!ciclo.equals(other.ciclo))
			return false;
		if (fechaComienzo == null) {
			if (other.fechaComienzo != null)
				return false;
		} else if (!fechaComienzo.equals(other.fechaComienzo))
			return false;
		if (profesor == null) {
			if (other.profesor != null)
				return false;
		} else if (!profesor.equals(other.profesor))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Ciclo impartido: [Profesor " + this.profesor + " Ciclo formativo " + this.ciclo + " Fecha de comienzo: " + this.fechaComienzo + "]";
	}
	
	

}
