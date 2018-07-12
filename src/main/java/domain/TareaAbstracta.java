package domain;

import org.uqbar.commons.model.annotations.Observable;

@Observable
public abstract class TareaAbstracta {
	String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract String promedio();
	public abstract boolean aprueba();
}
