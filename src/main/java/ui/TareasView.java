package ui;

import java.util.ArrayList;
import java.util.List;

import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.bindings.Observable;

import domain.TareaAbstracta;
import domain.TareaConceptual;

@SuppressWarnings("serial")
public class TareasView extends SimpleWindow<TareasViewModel>{
	
	public TareasView(WindowOwner main, TareasViewModel unasTareas) {
		super(main, unasTareas);
	}

	@Override
	protected void createMainTemplate(Panel mainPanel) {
		this.setTitle("Notas de Luisito");

		super.createMainTemplate(mainPanel);

		this.createResultsGrid(mainPanel);
	}


	protected void createResultsGrid(Panel mainPanel) {
		Table<TareaAbstracta> table = new Table<TareaAbstracta>(mainPanel, TareaAbstracta.class);
		table.setNumberVisibleRows(3);
		table.setWidth(450);

		table.bindItemsToProperty("nombre");
		table.bindValueToProperty("promedio");

		this.describeResultsGrid(table);
	}

	protected void describeResultsGrid(Table<TareaAbstracta> table) {
		new Column<TareaAbstracta>(table) //
			.setTitle("Nombre")
			.setFixedSize(150)
			.bindContentsToProperty("nombre");

		new Column<TareaAbstracta>(table) //
			.setTitle("Promedio")
			.setFixedSize(100)
			.alignRight()
			.bindContentsToProperty("promedio");
	}
		
	@Override
	protected void addActions(Panel mainPanel) {	
	}


	@Override
	protected void createFormPanel(Panel mainPanel) {
		// TODO Auto-generated method stub
		
	}
}
/*	
	@Override
	protected void createFormPanel(Panel mainPanel) {
		
		this.setTitle("Luisitoooooooooo");
		mainPanel.setLayout(new VerticalLayout());
		
		Table<TareaAbstracta> tablaNotas = new Table<TareaAbstracta>(mainPanel, TareaAbstracta.class);
		tablaNotas.bindItemsToProperty("nombre");
	//	tablaNotas.bindItems((Observable<M>) this.getModelObject().getTareas().get(1));
		
		
		
//		Table<TareasViewModel> tablaNotas = new Table<TareasViewModel>(mainPanel, TareasViewModel.class);
//		tablaNotas.bindItemsToProperty("tareas");
//		tablaNotas.bindItems((Observable<M>) this.getModelObject().getTareas().get(1));
	}
}*/
