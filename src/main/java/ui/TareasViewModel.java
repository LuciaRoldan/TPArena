package ui;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
	
	public List<String> getNombre() {
		return tareas.stream().map(unaTarea -> unaTarea.getNombre()).collect(Collectors.toList());
	}
	
	public List<String> getPromedio(){
		return tareas.stream().map(unaTarea -> unaTarea.getPromedio()).collect(Collectors.toList());
	}
	
	
	
	
}
