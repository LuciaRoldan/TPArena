package domain;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
	String nombre;
	int legajo;
	String git;
	List<TareaAbstracta> tareas = new ArrayList<TareaAbstracta>();
	
	public Estudiante(String unNombre, int unLegajo, String unGit, ArrayList<TareaAbstracta> unasTareas) {
		this.setNombre(unNombre);
		this.setLegajo(unLegajo);
		this.setGit(unGit);
		this.setTareas(unasTareas);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setGit(String git) {
		this.git = git;
	}
	public String getGit() {
		return git;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
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
	
}
