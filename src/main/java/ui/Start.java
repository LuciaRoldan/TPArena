package ui;


import java.io.IOException;

import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;

public class Start extends Application{
	
	public static void main(String[] args) {
		    new Start().start();
		  }
	
	@Override
	protected Window<?> createMainWindow() {
		try {
			return new EstudianteView(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
}
