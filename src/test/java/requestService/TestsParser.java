package requestService;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import domain.Estudiante;
import domain.Parser;

public class TestsParser {

	@Test
	public void parseoDeEstudiante() throws IOException {
		Parser parser = new Parser();
		Estudiante estudiante = parser.parsearEstudiante();
		assertEquals("Franco", estudiante.getFirst_name());
	}
	
	public void parseoDeNotas() throws IOException {
		Parser parser = new Parser();
		Estudiante estudiante = parser.parsearEstudiante();
		assertEquals("Franco", estudiante.getFirst_name());
	}

}
