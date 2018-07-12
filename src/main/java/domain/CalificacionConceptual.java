package domain;

import java.util.List;
import static java.util.Arrays.asList;

public enum CalificacionConceptual {
	
	DISTINGUIDO(7, "Distinguido"),
	BIENMAS(6, "Bien +"),
	BIEN(5, "Bien"),
	BIENMENOS(4, "Bien -"),
	REGULARMAS(3, "Regular +"),
	REGULAR(2, "Regular"),
	MAL(1, "Mal");

	int valor;
	String titulo;
	
	private CalificacionConceptual(int unValor, String unTitulo){
		valor = unValor;
		titulo = unTitulo;
	}
	
	int getValor() {
		return valor;
	}
	
	String getTitulo() {
		return titulo;
	}
	
	public static List<CalificacionConceptual> listaCalificaciones = asList(null, CalificacionConceptual.MAL, CalificacionConceptual.REGULAR, CalificacionConceptual.REGULARMAS, 
			CalificacionConceptual.BIENMENOS, CalificacionConceptual.BIEN, CalificacionConceptual.BIENMAS, 
			CalificacionConceptual.DISTINGUIDO);

	
	public CalificacionConceptual obtenerCalificacionConceptual(int unValor){
		return listaCalificaciones.get(unValor);
	}
}
