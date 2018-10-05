package domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Estudiante {
	String first_name;
	String last_name;
	int code;
	String git;
	List<TareaAbstracta> tareas = new ArrayList<TareaAbstracta>();
	
	public Estudiante(String unNombre, int unLegajo, String unGit, ArrayList<TareaAbstracta> unasTareas) {
		this.setNombre(unNombre);
		this.setLegajo(unLegajo);
		this.setGit(unGit);
		this.setTareas(unasTareas);
	}
	
	public String getNombre() {
		return first_name;
	}
	public void setGit(String git) {
		this.git = git;
	}
	public String getGit() {
		return git;
	}
	public void setNombre(String nombre) {
		this.first_name = nombre;
	}
	public int getLegajo() {
		return code;
	}
	public void setLegajo(int legajo) {
		this.code = legajo;
	}
	public List<TareaAbstracta> getTareas() {
		return tareas;
	}
	public void setTareas(ArrayList<TareaAbstracta> unasTareas) {
		this.tareas.addAll(unasTareas);
	}
	public void agregarTarea(TareaAbstracta unaTarea) {
		this.getTareas().add(unaTarea);
	}
	
	@JsonCreator
	public Estudiante(){}
	
}
