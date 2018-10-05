package ui;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import domain.*;

@Observable
public class EstudianteViewModel {		
	private Estudiante estudiante;
	
	public EstudianteViewModel(Estudiante unEstudiante) {
		this.estudiante = unEstudiante;
	}

	public String getNombre() {
		return estudiante.getFirst_name();
	}
	public void setNombre(String nombre) {
		estudiante.setFirst_name(nombre);
	}
	public void setGit(String git) {
		estudiante.setGithub_user(git);
	}
	public String getGit() {
		return estudiante.getGithub_user();
	}
	public void setLegajo(int legajo) {
		estudiante.setCode(legajo);
	}
	public int getLegajo() {
		return estudiante.getCode();
	}
	public List<TareaAbstracta> getTareas() {
		return estudiante.getTareas();
	}
	public void setTareas(ArrayList<TareaAbstracta> tareas) {
		estudiante.setTareas(tareas);
	}
	
}
