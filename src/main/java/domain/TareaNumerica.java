package domain;

import java.util.ArrayList;

public class TareaNumerica{
	String nombre;
	ArrayList<Integer> notas = new ArrayList<Integer>();
	
	public int promedio() {
		return notas.stream().mapToInt(Integer::intValue).sum() / notas.size();
	}
	
	public boolean aprueba() {
		return this.promedio() >= 6;
	}
}
