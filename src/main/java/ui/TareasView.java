package ui;

import java.util.ArrayList;

import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import domain.TareaAbstracta;

@SuppressWarnings("serial")
public class TareasView extends Dialog<TareasViewModel>{
	
	ArrayList<TareaAbstracta> tareas = new ArrayList<TareaAbstracta>();

	public TareasView(WindowOwner main, TareasViewModel unasTareas) {
		super(main, unasTareas);
	}

	@Override
	protected void addActions(Panel mainPanel) {
		
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		
		this.setTitle("Luisitoooooooooo");
		mainPanel.setLayout(new VerticalLayout());
	}
}
