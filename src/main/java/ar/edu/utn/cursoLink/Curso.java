package ar.edu.utn.cursoLink;

import java.util.List;

public class Curso {
	int numMinParaAbrir;
	Materia materia;
	int anio;
	boolean abierto;
	ModalidadCurso modalidad;
	List<Alumno> inscriptos;
	
	public Curso(Materia materia, int anio) {
		super();
		this.materia = materia;
		this.anio = anio;
	}
	
	public int getNumMinParaAbrir() {
		return numMinParaAbrir;
	}
	public void setNumMinParaAbrir(int numMinParaAbrir) {
		this.numMinParaAbrir = numMinParaAbrir;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public boolean isAbierto() {
		return abierto;
	}
	public void setAbierto(boolean abierto) {
		this.abierto = abierto;
	}
	public ModalidadCurso getModalidad() {
		return modalidad;
	}
	public void setModalidad(ModalidadCurso modalidad) {
		this.modalidad = modalidad;
	}
	public List<Alumno> getInscriptos() {
		return inscriptos;
	}
	public void setInscriptos(List<Alumno> inscriptos) {
		this.inscriptos = inscriptos;
	}

	public Object estaInscripto(Alumno alumno) {
		return this.getInscriptos().contains(alumno);
	}

	public void inscribir(Alumno alumno) {
		this.inscriptos.add(alumno);		
	}
	
	public void abrir() throws CursoIncompletoException {
		
		if(this.inscriptos.size() < this.numMinParaAbrir) {	
			throw new CursoIncompletoException("No se puede abrir en curso, porque no se cuenta con los alumnos necesarios");
		}
		
		this.abierto = true;
	}
	
}
