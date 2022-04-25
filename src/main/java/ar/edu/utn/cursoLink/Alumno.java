package ar.edu.utn.cursoLink;

import java.util.List;

public class Alumno {
	private String nombre;
	List<Curso> cursos;
	List<Materia> materiasAprobadas;
	
	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public List<Materia> getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}
	
	public void inscribir(Curso curso) throws CorrelativasInvalidasException {
		
		if(!curso.materia.controlCorrelativas(this.materiasAprobadas)) {
			
			throw new CorrelativasInvalidasException("El alumno no tiene las correlativas necesarias para inscribirse al curso");
		}
		
		curso.inscribir(this);
	}
	


}
