package com.nachosoft.dawes;

public class CicloFormativo {

	private String denCorta;
	private String denLarga;
	
	public CicloFormativo(String denCorta, String denLarga) {
		super();
		this.setDenCorta(denCorta);
		this.setDenLarga(denLarga);
	}
	
	public CicloFormativo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getDenCorta() {
		return denCorta;
	}

	public void setDenCorta(String denCorta) {
		this.denCorta = denCorta;
	}

	public String getDenLarga() {
		return denLarga;
	}

	public void setDenLarga(String denLarga) {
		this.denLarga = denLarga;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((denCorta == null) ? 0 : denCorta.hashCode());
		result = prime * result + ((denLarga == null) ? 0 : denLarga.hashCode());
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
		CicloFormativo other = (CicloFormativo) obj;
		if (denCorta == null) {
			if (other.denCorta != null)
				return false;
		} else if (!denCorta.equals(other.denCorta))
			return false;
		if (denLarga == null) {
			if (other.denLarga != null)
				return false;
		} else if (!denLarga.equals(other.denLarga))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ciclo Formativo [Denominacion corta: " + this.denCorta + " Denominacion Larga " + this.denLarga +"]";
	}
	
	
	
}
