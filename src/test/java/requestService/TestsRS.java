package requestService;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.jersey.api.client.ClientResponse;

import domain.RequestService;

public class TestsRS {
	
	@Test
	public void postDeUnAlumno() {
		RequestService rs = new RequestService();
		rs.cargarAlumno("{\r\n" + "  \"code\": \"1214731\",\r\n" + "  \"first_name\": \"Franco\",\r\n" + 
    					"  \"last_name\": \"Bulgarelli\",\r\n" + "  \"github_user\": \"flbulgarelli\"\r\n" + "}");
		assertTrue(true);
	}

	@Test
	public void getDeUnAlumno() {
		
		RequestService rs = new RequestService();
		String estudiante = rs.consultarAlumno();
		System.out.println(estudiante);
		assertTrue(estudiante.contains("flbulgarelli"));
	}
	
	@Test
	public void getDeNotas() {
		RequestService rs = new RequestService();
		String notas = rs.consultarNotas();
		//System.out.println(json);
		assertTrue(notas.contains("title"));
	}

}
