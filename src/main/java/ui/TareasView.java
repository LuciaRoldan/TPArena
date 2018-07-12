package ui;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.bindings.Observable;

import domain.TareaAbstracta;

@SuppressWarnings("serial")
public class TareasView extends SimpleWindow<TareasViewModel>{

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
		
		Table<TareaAbstracta> tablaNotas = new Table<TareaAbstracta>(mainPanel, TareaAbstracta.class);
		tablaNotas.bindItemsToProperty("nombre");
	//	tablaNotas.bindItems((Observable<M>) this.getModelObject().getTareas().get(1));
	}
}
