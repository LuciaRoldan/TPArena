package ui;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import domain.TareaAbstracta;

@SuppressWarnings("serial")
public class TareasView extends SimpleWindow<EstudianteViewModel>{
	
	public TareasView(WindowOwner main, EstudianteViewModel unEstudiante) {
		super(main, unEstudiante);
	}

	@Override
	protected void createMainTemplate(Panel mainPanel) {
		this.setTaskDescription("Notas de Luisito");
		this.setTitle("Notas");

		super.createMainTemplate(mainPanel);

		this.createResultsGrid(mainPanel);
		
		  new Button(mainPanel)
			.setCaption("Aceptar")
			.onClick(()-> this.close()).setWidth(100);
		
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
