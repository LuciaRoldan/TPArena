package requestService;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.jersey.api.client.ClientResponse;

import domain.Estudiante;
import domain.RequestService;

public class TestsRS {
	
	@Test
	public void postDeUnAlumno() {
		RequestService rs = new RequestService();
		rs.cargarAlumno(1214731, "{\r\n" + 
    											"  \"code\": \"1214731\",\r\n" + 
    											"  \"first_name\": \"Franco\",\r\n" + 
    											"  \"last_name\": \"Bulgarelli\",\r\n" + 
    											"  \"github_user\": \"flbulgarelli\"\r\n" + 
    											"}");
		assertTrue(true);
	}

	@Test
	public void getDeUnAlumno() {
		
		RequestService rs = new RequestService();
		ClientResponse estudiante = rs.consultarAlumno(111222333);
		System.out.println(estudiante.toString());
		System.out.println(estudiante.getEntity(String.class));
		assertTrue(true);
	}

}
