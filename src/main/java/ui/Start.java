package ui;

import java.util.ArrayList;

import org.uqbar.arena.Application;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.windows.Window;

import domain.Estudiante;
import domain.TareaAbstracta;

public class Start extends Application{
	
	public static void main(String[] args) {
		    new Start().start();
		  }
	
	@Override
	protected Window<?> createMainWindow() {
		return new EstudianteView(this);
	}

	
}
