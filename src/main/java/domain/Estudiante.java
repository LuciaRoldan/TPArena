package domain;

import java.util.ArrayList;

//-Djava.system.class.loader=org.uqbar.apo.APOClassLoader
//-Djava.system.class.loader=com.uqbar.apo.APOClassLoader

public class Estudiante {
	String nombre;
	long legajo;
	ArrayList<TareaConceptual> tareasConceptuales = new ArrayList<TareaConceptual>();
	ArrayList<TareaNumerica> tareasNumericas = new ArrayList<TareaNumerica>();
	
	public String getNombre() {
		return nombre;
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
	
}
