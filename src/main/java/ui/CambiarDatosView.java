package ui;

import java.awt.Color;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import com.fasterxml.jackson.core.JsonProcessingException;

import domain.Estudiante;
import domain.Parser;
import domain.RequestService;

@SuppressWarnings("serial")
public class CambiarDatosView extends SimpleWindow<EstudianteViewModel>{
	
	private Estudiante estudiante;
	
	public CambiarDatosView(WindowOwner main, EstudianteViewModel unEstudiante) {
		super(main, unEstudiante);
		estudiante = unEstudiante.getEstudiante();
	}

	@Override 
	protected void addActions(Panel actionsPanel) {
		
	}

	@Override
	protected void createMainTemplate(Panel mainPanel) {
		this.setTaskDescription("Datos del usuario");
		this.setTitle("Informacion de usuario");
		super.createMainTemplate(mainPanel);
		
		mainPanel.setLayout(new VerticalLayout());
		
		new Label(mainPanel).setText("Información actual del alumno")
	  	.setWidth(300);
	  
		new Label(mainPanel).setText("Modificar informacion").setWidth(300);
		  
		new Label(mainPanel).setText("Nombre nuevo:");
		new TextBox(mainPanel).bindValueToProperty("nombre");
		new Label(mainPanel).setText("Legajo nuevo:");
		new TextBox(mainPanel).bindValueToProperty("legajo");
		new Label(mainPanel).setText("Git nuevo:");
		new TextBox(mainPanel).bindValueToProperty("git");
		
		RequestService rq = new RequestService();
		Parser parser = new Parser();
		new Button(mainPanel)
		.setCaption("Actualizar informacion")
		.onClick(()-> {
			try {
				System.out.println(parser.convertirObjetoEnString(this.estudiante));
				rq.cargarAlumno(parser.convertirObjetoEnString(this.estudiante));
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		})
		//.onClick(()-> this.close())
		.setWidth(100);
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		// TODO Auto-generated method stub
		
	}
}