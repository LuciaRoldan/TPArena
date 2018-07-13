package ui;

import java.awt.Color;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

@SuppressWarnings("serial")
public class DatosView extends SimpleWindow<EstudianteViewModel>{
	
	public DatosView(WindowOwner main, EstudianteViewModel unEstudiante) {
		super(main, unEstudiante);
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
	  
	  new Label(mainPanel).setText("El nombre es:");
	  new Label(mainPanel) 
		.setBackground(Color.PINK)
		.bindValueToProperty("nombre");
	  new Label(mainPanel).setText("El legajo es:");
	  new Label(mainPanel) 
		.setBackground(Color.PINK)
		.bindValueToProperty("legajo");
	  new Label(mainPanel).setText("El Git es:");
	  new Label(mainPanel) 
		.setBackground(Color.PINK)
		.bindValueToProperty("git");
		
	  new Button(mainPanel)
		.setCaption("Aceptar")
		.onClick(()-> this.close()).setWidth(100);
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		// TODO Auto-generated method stub
		
	}
}