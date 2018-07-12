package ui;
import java.util.ArrayList;
import java.util.List;

import org.uqbar.commons.model.annotations.Observable;

import domain.*;

@Observable
public class TareasViewModel {
	
	private List<TareaAbstracta> tareas = new ArrayList<TareaAbstracta>();

	public List<TareaAbstracta> getTareas() {
		return tareas;
	}

	public TareasViewModel(List<TareaAbstracta> unasTareas) {
		this.tareas.addAll(unasTareas);
	}	
}
