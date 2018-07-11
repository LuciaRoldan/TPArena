package domain;

import java.util.ArrayList;

//-Djava.system.class.loader=org.uqbar.apo.APOClassLoader
//-Djava.system.class.loader=com.uqbar.apo.APOClassLoader

public class Estudiante {
	String nombre;
	long legajo;
	String git;
	ArrayList<TareaConceptual> tareasConceptuales = new ArrayList<TareaConceptual>();
	ArrayList<TareaNumerica> tareasNumericas = new ArrayList<TareaNumerica>();
	
	public Estudiante(String unNombre, long unLegajo, String unGit, ArrayList<TareaConceptual> unasTareasConceptuales, ArrayList<TareaNumerica> unasTareasNumericas) {
		this.setNombre(unNombre);
		this.setLegajo(unLegajo);
		this.setGit(unGit);
		this.setTareasConceptuales(unasTareasConceptuales);
		this.setTareasNumericas(unasTareasNumericas);
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
	public ArrayList<TareaConceptual> getTareasConceptuales() {
		return tareasConceptuales;
	}
	public void setTareasConceptuales(ArrayList<TareaConceptual> tareasConceptuales) {
		this.tareasConceptuales = tareasConceptuales;
	}
	public ArrayList<TareaNumerica> getTareasNumericas() {
		return tareasNumericas;
	}
	public void setTareasNumericas(ArrayList<TareaNumerica> tareasNumericas) {
		this.tareasNumericas = tareasNumericas;
	}
	public void agregarTareaConceptual(TareaConceptual unaTarea) {
		this.getTareasConceptuales().add(unaTarea);
	}
	
}
