package ar.edu.utn.cursoLink;

import java.util.List;

public class Materia {
	private String nombre;
	List<Materia> correlativas;
	
	public Materia(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	/*
	public Materia(String nombre, List<Materia> correlativas) {
		super();
		this.nombre = nombre;
		this.correlativas = correlativas;
	}
*/

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Materia> getCorrelativas() {
		return correlativas;
	}
	public void setCorrelativas(List<Materia> correlativas) {
		this.correlativas = correlativas;
	}
	public boolean controlCorrelativas(List<Materia> materiasAprobadas) {
		return this.correlativas.containsAll(materiasAprobadas);
	}
	

	
}
