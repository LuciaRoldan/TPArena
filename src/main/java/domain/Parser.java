package domain;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Parser {
	JSONParser parser = new JSONParser();
    ObjectMapper mapper = new ObjectMapper();

    public Parser() {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public Estudiante parsearEstudiante() throws IOException {
        try {
        	RequestService rs = new RequestService();
        	String json = rs.consultarAlumno();
        	//System.out.println(json);
            Estudiante estudiante = mapper.readValue(json, Estudiante.class);
            return estudiante;

        } catch (IOException excepcion) {
            throw excepcion;
        }
    }

    public ArrayList<TareaAbstracta> parsearNotas() throws IOException {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
        	RequestService rs = new RequestService();
        	String json = rs.consultarNotas();
        	ArrayList<TareaAbstracta> notas = mapper.readValue(json, ArrayList.class);
            return notas;

        } catch (IOException excepcion) {
            throw excepcion;
        }
    }
    
    public String convertirObjetoEnString(Object x) throws JsonProcessingException {
    	return mapper.writeValueAsString(x);
    }
}
