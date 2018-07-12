package ui;
import java.util.ArrayList;

import org.uqbar.commons.model.annotations.Observable;

import domain.*;

@Observable
public class TareasViewModel {
	
	ArrayList<TareaAbstracta> tareas = new ArrayList<TareaAbstracta>();

	public TareasViewModel(ArrayList<TareaAbstracta> unasTareas) {
		tareas.addAll(unasTareas);
	}
	/*public TareasViewModel(int ble) {
		prueba = ble;
	}*/
}
