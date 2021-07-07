package ui;

import domain.*;

import java.io.IOException;
import java.util.ArrayList;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;



public class EstudianteView extends SimpleWindow<EstudianteViewModel>{
	
	public EstudianteView(WindowOwner padre) throws IOException {
	    //super(padre, new EstudianteViewModel( new Estudiante("Luis Lucena", 1234567, "luisitoElCapito", 
	    	//								new ArrayList<TareaAbstracta>())));
	    super(padre, new EstudianteViewModel(new Parser().parsearEstudiante()));
	    
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
		  
		  new Label(mainPanel).setText("Bienvenido!");
	  }
	  
	  @Override
	  public void addActions(Panel mainPanel) {
		  new Button(mainPanel)
			.setCaption("Ver datos")
			.onClick(()-> this.mostrarDatos(getModelObject())).setWidth(100);
		  
		  new Button(mainPanel)
			.setCaption("Ver mis notas")
			.onClick(()-> this.mostrarNotas(getModelObject())).setWidth(100);
		  
		  new Button(mainPanel)
			.setCaption("Modificar datos")
			.onClick(()-> this.mostrarCambioDatos(getModelObject())).setWidth(100);
	  }

	  public void mostrarNotas(EstudianteViewModel unEstudiante) {
		  new TareasView(this, unEstudiante).open(); 
	  }
	  
	  public void mostrarDatos(EstudianteViewModel unEstudiante) {
		  new DatosView(this, unEstudiante).open(); 
	  }
	  
	  public void mostrarCambioDatos(EstudianteViewModel unEstudiante) {
		  new CambiarDatosView(this, unEstudiante).open(); 
	  }

}
