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

	public EstudianteView(WindowOwner padre) {
	    super(padre, new EstudianteViewModel(
	    		new Estudiante("Luis Lucena", (long) 123456789, "luisitoElCapito", 
	    						new ArrayList<TareaAbstracta>())));
	    
	    ArrayList<CalificacionConceptual> notas = new ArrayList<CalificacionConceptual>();
	    notas.add(CalificacionConceptual.DISTINGUIDO);
	    notas.add(CalificacionConceptual.DISTINGUIDO);
		this.getModelObject().getTareas().add(new TareaConceptual("Literatura", notas));
	}

	  @Override
	  public void createFormPanel(Panel mainPanel) {
		  this.setTitle("Informacion del alumno");
		  mainPanel.setLayout(new VerticalLayout());
		  
		  new Label(mainPanel).setText("Nombre:");
		  new Label(mainPanel).bindValueToProperty("nombre");
		  
		  new Label(mainPanel).setText("Legajo:");
		  new Label(mainPanel).bindValueToProperty("legajo");
		  
		  new Label(mainPanel).setText("Git:");
		  new Label(mainPanel).bindValueToProperty("git");
		  new Label(mainPanel).setText("Git nuevo:");
		  new TextBox(mainPanel).bindValueToProperty("git");
		  
		 /* new NumericField(mainPanel).bindValueToProperty("millas");

		  new Button(mainPanel)
				.setCaption("Convertir a kilómetros")
				.onClick(()-> this.getModelObject().convertir());

		  new Label(mainPanel) //
				.setBackground(Color.ORANGE)
				.bindValueToProperty("kilometros");

		  new Label(mainPanel).setText(" kilómetros");*/
	  }
	  
	  @Override
	  public void addActions(Panel mainPanel) {
		  new Button(mainPanel)
			.setCaption("Ver mis notas")
			.onClick(()-> this.mostrarNotas(getModelObject().getTareas()));
		  new Button(mainPanel)
			.setCaption("Cambiar Git");
			//Todo tuyo Ro
		  
	  }
	  
	  public void mostrarNotas(List<TareaAbstracta> unasTareas) {
		  new TareasView(this, new TareasViewModel(unasTareas)).open(); 
	  }

}
