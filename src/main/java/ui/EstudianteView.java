package ui;

import domain.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.preference.StringFieldEditor;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Control;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.ControlBuilder;
import org.uqbar.lacar.ui.model.bindings.Binding;


import domain.*;

public class EstudianteView extends SimpleWindow<EstudianteViewModel>{
	
	String git;
	
	public EstudianteView(WindowOwner padre) {
	    super(padre, new EstudianteViewModel(
	    		new Estudiante("Luis Lucena", (long) 123456789, "luisitoElCapito", 
	    						new ArrayList<TareaAbstracta>())));
	    
	    ArrayList<TareaAbstracta> listaTareas = new ArrayList<TareaAbstracta>();
	    
	    ArrayList<CalificacionConceptual> notas1 = new ArrayList<CalificacionConceptual>();
	    notas1.add(CalificacionConceptual.DISTINGUIDO);
	    notas1.add(CalificacionConceptual.DISTINGUIDO);
	    TareaConceptual unaTarea1 = new TareaConceptual("Sistemas Operativos", notas1);
	    
	    ArrayList<Integer> notas2 = new ArrayList<Integer>();
	    notas2.add((Integer) 8);
	    notas2.add((Integer) 10);
	    TareaNumerica unaTarea2 = new TareaNumerica("Disenio de Sistemas", notas2);
	    
	    
	    
	    listaTareas.add(unaTarea1);
	    listaTareas.add(unaTarea2);
		this.getModelObject().setTareas(listaTareas);
	}

	  @Override
	  public void createFormPanel(Panel mainPanel) {
		  this.setTitle("Informacion del alumno");
		  mainPanel.setLayout(new VerticalLayout());
		  
		  new Label(mainPanel).setText("Información actual del alumno")
		  	.setWidth(300);
		  
		  new Label(mainPanel).setText("Nombre:").setWidth(300);
		  new Label(mainPanel).bindValueToProperty("nombre");
		  new Label(mainPanel).setText("Legajo:");
		  new Label(mainPanel).bindValueToProperty("legajo");
		  new Label(mainPanel).setText("Git:");
		  new Label(mainPanel).bindValueToProperty("git");
		  
		  new Label(mainPanel).setText("Modificar informacion").setWidth(300);
		  
		  new Label(mainPanel).setText("Nombre nuevo:");
		  new TextBox(mainPanel).bindValueToProperty("nombre");
		  new Label(mainPanel).setText("Legajo nuevo:");
		  new TextBox(mainPanel).bindValueToProperty("legajo");
		  new Label(mainPanel).setText("Git nuevo:");
		  new TextBox(mainPanel).bindValueToProperty("git");
		  
		  new Button(mainPanel)
			.setCaption("Actualizar informacion")
			.onClick(()-> this.getModelObject().setGit("git")).setWidth(100);
		  
		  new Label(mainPanel).setText("El nuevo Git es:");
		  
		  new Label(mainPanel) //
			.setBackground(Color.PINK)
			.bindValueToProperty("git");
	  }
	  
	  @Override
	  public void addActions(Panel mainPanel) {
		  new Button(mainPanel)
			.setCaption("Ver mis notas")
			.onClick(()-> this.mostrarNotas(getModelObject()));
		  new Button(mainPanel)
			.setCaption("Cambiar Git")
			.onClick(()-> this.getModelObject().setGit("git"));
		  new Button(mainPanel)
			.setCaption("Actualizar informacion")
			.onClick(()-> this.getModelObject().setGit("estoyreloco")).setWidth(100);
	  }
	  
	  
	  public void mostrarNotas(EstudianteViewModel unEstudiante) {
		  new TareasView(this, unEstudiante).open(); 
	  }

}
