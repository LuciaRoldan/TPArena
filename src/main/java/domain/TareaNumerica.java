package domain;

import java.util.ArrayList;

public class TareaNumerica extends TareaAbstracta{
	ArrayList<Integer> notas = new ArrayList<Integer>();
	int notaPromedio;
	
	public String promedio() {
		notaPromedio = notas.stream().mapToInt(Integer::intValue).sum() / notas.size();
		return String.valueOf(notaPromedio);
	}
	
	public boolean aprueba() {
		return this.notaPromedio >= 6;
	}
}
