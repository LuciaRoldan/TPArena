package domain;

import java.util.ArrayList;


public class TareaConceptual extends TareaAbstracta{
	ArrayList<CalificacionConceptual> notas = new ArrayList<CalificacionConceptual>();
	CalificacionConceptual notaPromedio;
	
	public TareaConceptual(String unNombre, ArrayList<CalificacionConceptual> unasNotas) {
		this.nombre = unNombre;
		this.notas = unasNotas;
	}
	
	public String promedio() {
		float promedio = notas.stream().mapToInt(nota -> nota.getValor()).sum() / notas.size();
		notaPromedio = notas.get(1).obtenerCalificacionConceptual((int)Math.round(promedio)); 
		return notaPromedio.getTitulo();
	}
	
	public boolean aprueba() {
		return this.notaPromedio.getValor() >= 4;
	}
}
