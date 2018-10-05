package requestService;

import static org.junit.Assert.*;

import org.junit.Test;

import domain.Estudiante;
import domain.RequestService;

public class TestsRS {
	
	@Test
	public void postDeUnAlumno() {
		
	}

	@Test
	public void getDeUnAlumno() {
		RequestService rs = new RequestService();
		Estudiante estudiante = rs.consultarAlumno(1214731);
		assertEquals("Franco", estudiante.getNombre());
	}

}
