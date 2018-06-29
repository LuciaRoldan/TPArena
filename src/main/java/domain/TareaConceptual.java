package domain;

import java.util.ArrayList;

public class TareaConceptual{
	String nombre;
	ArrayList<CalificacionConceptual> notas = new ArrayList<CalificacionConceptual>();
	
	public CalificacionConceptual promedio() {
		float promedio = notas.stream().mapToInt(nota -> nota.getValor()).sum() / notas.size();
		return notas.get(1).obtenerCalificacionConceptual((int)Math.round(promedio)); 
	}
	
	public boolean aprueba() {
		return this.promedio().getValor() >= 4;
	}
}
