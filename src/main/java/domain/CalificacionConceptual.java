package domain;

import java.util.List;
import static java.util.Arrays.asList;

public enum CalificacionConceptual {
	
	DISTINGUIDO(7),
	BIENMAS(6),
	BIEN(5),
	BIENMENOS(4),
	REGULARMAS(3),
	REGULAR(2),
	MAL(1);

	int valor;
	
	private CalificacionConceptual(int unValor){
		valor = unValor;
	}
	
	int getValor() {
		return valor;
	}
	
	public static List<CalificacionConceptual> listaCalificaciones = asList(null, CalificacionConceptual.MAL, CalificacionConceptual.REGULAR, CalificacionConceptual.REGULARMAS, 
			CalificacionConceptual.BIENMENOS, CalificacionConceptual.BIEN, CalificacionConceptual.BIENMAS, 
			CalificacionConceptual.DISTINGUIDO);

	
	public CalificacionConceptual obtenerCalificacionConceptual(int unValor){
		return listaCalificaciones.get(unValor);
	}
}
