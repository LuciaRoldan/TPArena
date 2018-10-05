package domain;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RequestService {

	private Client cliente;
    private static final String NOTITAS = "http://notitas.herokuapp.com/student";
    private String TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho";
    
    
    public RequestService() {
        this.cliente = Client.create();
    }
    
    public void cargarAlumno(String input) {
    	Client cliente = Client.create();
    	WebResource web = cliente.resource(NOTITAS);
    	ClientResponse response = web.header("Authorization", "Bearer " + TOKEN)
    								 .accept(MediaType.APPLICATION_JSON)
    								 .put(ClientResponse.class, input);
    	System.out.println(response.getStatus());
    }
    
    public String consultarAlumno() {
    	WebResource web = cliente.resource(NOTITAS);
    	ClientResponse estudiante = web.header("Authorization", "Bearer " + TOKEN)
    								.accept(MediaType.APPLICATION_JSON)
    								.get(ClientResponse.class);
    	//System.out.println(estudiante.getStatus());
    	
    	return estudiante.getEntity(String.class);
    }
    
    public String consultarNotas() {
    	WebResource web = cliente.resource(NOTITAS).path("assignments");
    	ClientResponse respuesta = web.header("Authorization", "Bearer " + TOKEN)
    								.accept(MediaType.APPLICATION_JSON)
    								.get(ClientResponse.class);
    	//System.out.println(respuesta.getStatus());
    	return respuesta.getEntity(String.class);
    }
}
