package domain;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class RequestService {

	private Client cliente;
    private static final String NOTITAS = "http://notitas.herokuapp.com";
    
    
    public RequestService() {
        this.cliente = Client.create();
    }
    
    public void cargarAlumno() {
    	
    }
    
    public ClientResponse consultarAlumno() {
    	ClientResponse respuesta = null;
    	return respuesta;
    }
    
    public ClientResponse consultarNotas() {
    	ClientResponse respuesta = null;
    	return respuesta;
    }
}
