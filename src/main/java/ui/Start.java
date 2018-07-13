package ui;


import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

public class Start extends Application{
	
	public static void main(String[] args) {
		    new Start().start();
		  }
	
	@Override
	protected Window<?> createMainWindow() {
		return new EstudianteView(this);
	}

	
}
