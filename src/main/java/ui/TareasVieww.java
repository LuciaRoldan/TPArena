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
public class TareasVieww extends SimpleWindow<EstudianteViewModel>{
	
	public TareasVieww(WindowOwner main, EstudianteViewModel unEstudiante) {
		super(main, unEstudiante);
	}

	@Override
	protected void createMainTemplate(Panel mainPanel) {
		this.setTaskDescription("Notas de Luisito");
		this.setTitle("Notas");

		super.createMainTemplate(mainPanel);

		this.createResultsGrid(mainPanel);
	}


	protected void createResultsGrid(Panel mainPanel) {
		Table<TareaAbstracta> table = new Table<TareaAbstracta>(mainPanel, TareaAbstracta.class);
		table.setNumberVisibleRows(3);
		table.setWidth(450);

		table.bindItemsToProperty("tareas");

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