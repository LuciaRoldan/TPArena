package ui;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import domain.*;

@Observable
public class EstudianteViewModel {		
	private Estudiante estudiante;
	//private ArrayList<TareaConceptualViewModel> tareasConceptuales;

	public EstudianteViewModel(Estudiante unEstudiante) {
		this.estudiante = unEstudiante;
	}

	public String getNombre() {
		return estudiante.getNombre();
	}
	public void setGit(String git) {
		estudiante.setGit(git);
	}
	public String getGit() {
		return estudiante.getGit();
	}
	public long getLegajo() {
		return estudiante.getLegajo();
	}
	public List<TareaAbstracta> getTareas() {
		return estudiante.getTareas();
	}
}
