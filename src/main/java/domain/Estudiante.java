package domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;

public class Estudiante {
	String first_name;
	String last_name;
	int code;
	String github_user;
	List<TareaAbstracta> tareas = new ArrayList<TareaAbstracta>();
	
	public Estudiante(String unNombre, int unLegajo, String unGit, ArrayList<TareaAbstracta> unasTareas) {
		this.setFirst_name(unNombre);
		this.setCode(unLegajo);
		this.setGithub_user(unGit);
		this.setTareas(unasTareas);
	}
	
	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getGithub_user() {
		return github_user;
	}


	public void setGithub_user(String github_user) {
		this.github_user = github_user;
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
