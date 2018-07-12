package domain;

import java.util.ArrayList;

//-Djava.system.class.loader=org.uqbar.apo.APOClassLoader
//-Djava.system.class.loader=com.uqbar.apo.APOClassLoader

public class Estudiante {
	String nombre;
	long legajo;
	String git;
	ArrayList<TareaAbstracta> tareas = new ArrayList<TareaAbstracta>();
	
	public Estudiante(String unNombre, long unLegajo, String unGit, ArrayList<TareaAbstracta> unasTareas) {
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
	public long getLegajo() {
		return legajo;
	}
	public void setLegajo(long legajo) {
		this.legajo = legajo;
	}
	public ArrayList<TareaAbstracta> getTareas() {
		return tareas;
	}
	public void setTareas(ArrayList<TareaAbstracta> unasTareas) {
		this.tareas = unasTareas;
	}
	public void agregarTarea(TareaAbstracta unaTarea) {
		this.getTareas().add(unaTarea);
	}
	
}
