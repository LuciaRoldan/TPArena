package domain;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class RequestService {

	private Client cliente;
    private static final String NOTITAS = "http://notitas.herokuapp.com/student";
    
    
    public RequestService() {
        this.cliente = Client.create();
    }
    
    public void cargarAlumno() {
    	
    }
    
    public Estudiante consultarAlumno(int legajo) {
    	Estudiante estudiante = this.cliente.resource(NOTITAS)
    			.path(String.valueOf(legajo))
    			.accept(MediaType.APPLICATION_JSON)
    			.get(Estudiante.class);
    	return estudiante;
    }
    
    public ClientResponse consultarNotas() {
    	ClientResponse respuesta = null;
    	return respuesta;
    }
}
