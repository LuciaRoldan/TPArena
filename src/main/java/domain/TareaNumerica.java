package domain;

import java.util.ArrayList;

public class TareaNumerica extends TareaAbstracta{
	ArrayList<Integer> notas = new ArrayList<Integer>();
	int notaPromedio;
	
	@Override
	public String promedio() {
		notaPromedio = notas.stream().mapToInt(Integer::intValue).sum() / notas.size();
		return String.valueOf(notaPromedio);
	}
	
	@Override
	public boolean aprueba() {
		return this.notaPromedio >= 6;
	}
}
