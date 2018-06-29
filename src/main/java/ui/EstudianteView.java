package ui;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;

import domain.*;

public class EstudianteView extends MainWindow<EstudianteViewModel>{

	public EstudianteView() {
	    super(new EstudianteViewModel(new Estudiante()));
	  }

	  @Override
	  public void createContents(Panel mainPanel) {
	  }

	  public static void main(String[] args) {
	    new EstudianteView().startApplication();
	  }
	  
}
