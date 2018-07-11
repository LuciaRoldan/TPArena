package ui;

import domain.*;

import java.awt.Color;
import java.util.ArrayList;

import org.eclipse.jface.preference.StringFieldEditor;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Control;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.lacar.ui.model.ControlBuilder;
import org.uqbar.lacar.ui.model.bindings.Binding;


import domain.*;

public class EstudianteView extends MainWindow<EstudianteViewModel>{

	public EstudianteView() {
	    super(new EstudianteViewModel(new Estudiante("Luis Lucena", (long) 123456789, "luisitoElCapito", new ArrayList<TareaConceptual>(), new ArrayList<TareaNumerica>())));
	    
		this.getModelObject().get.add(new TareaConceptual());
	}

	  @Override
	  public void createContents(Panel mainPanel) {
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
		  
		  new Button(mainPanel)
			.setCaption("Modificar cuanta de Git")
			.onClick(()-> this.getModelObject().setGit("da"));
		  
		  new Table<TareaConceptual>(mainPanel, TareaConceptual.class)
		  			.bindItemsToProperty("nombre");
		  			/*.bindItemsToProperty("promedio")
		  			.bindItemsToProperty("aprueba");*/

		 /* new NumericField(mainPanel).bindValueToProperty("millas");

		  new Button(mainPanel)
				.setCaption("Convertir a kilómetros")
				.onClick(()-> this.getModelObject().convertir());

		  new Label(mainPanel) //
				.setBackground(Color.ORANGE)
				.bindValueToProperty("kilometros");

		  new Label(mainPanel).setText(" kilómetros");*/
	  }

	  public static void main(String[] args) {
	    new EstudianteView().startApplication();
	  }
	  
	  public void mostrarNotas(Panel mainPanel) {
		  new Label(mainPanel).setText("Legajo:");
		  new Label(mainPanel).bindValueToProperty("legajo");
	  }
}
