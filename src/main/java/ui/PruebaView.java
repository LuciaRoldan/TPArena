package ui;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

public class PruebaView extends Dialog<PruebaViewModel>{
	
	public PruebaView(WindowOwner padre) {
		super(padre, new PruebaViewModel(1));
	}

	@Override
	protected void createFormPanel(Panel arg0) {
		// TODO Auto-generated method stub
		
	}

}
