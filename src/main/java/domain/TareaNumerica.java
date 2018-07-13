package domain;

import java.util.ArrayList;

public class TareaNumerica extends TareaAbstracta{
	ArrayList<Integer> notas = new ArrayList<Integer>();
	int notaPromedio;
	
	public TareaNumerica(String unNombre, ArrayList<Integer> unasNotas) {
		this.nombre = unNombre;
		this.notas = unasNotas;
	}
	
	@Override
	public String getPromedio() {
		notaPromedio = notas.stream().mapToInt(Integer::intValue).sum() / notas.size();
		return String.valueOf(notaPromedio);
	}
	
	@Override
	public boolean aprueba() {
		return this.notaPromedio >= 6;
	}
}
