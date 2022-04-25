package ar.edu.utn.cursoLink;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AlumnoTest {
	
	
	@Test
	public void testInscripcionOK() {
		/*Materia algoritmos = new Materia("Algoritmos");
	Materia matDiscreta = new Materia("Matematica discreta");
	Materia paradigmas = new Materia("Paradigmas de programacion");
	
	
	Alumno camila = new Alumno("camila");
	Alumno juan = new Alumno("juan");*/
		
	Alumno alumno = new Alumno("Camila");
	Curso curso = new Curso(new Materia("SO"), 2022);
	
	alumno.inscribir(curso);
	    
	assertTrue(alumno.inscribir(curso));
	}
/*
	@Test 
	public void alumnoQueNoCumpleCorrelatividadNoPuedeInscribirse() {
		/*Le agrego a paradigmas sus correlativas 
		List<Materia> correlativasParadigma =  new ArrayList<Materia>();
		correlativasParadigma.add(algoritmos);
		correlativasParadigma.add(matDiscreta);
		
	   //Le cargo al alumno sus materias aprobadas 	
		
		List<Materia> materiasAprobadas =  new ArrayList<Materia>();
		materiasAprobadas.add(matDiscreta);
		
		
	}
*/	


}
