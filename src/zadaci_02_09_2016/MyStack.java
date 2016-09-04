package zadaci_02_09_2016;

import java.util.ArrayList;

public class MyStack implements Cloneable {
	
	// kreiramo listu
	private ArrayList<Object> list = new ArrayList<>();
	
	//provjerava da li je prazna
	public boolean isEmpty() {
		return list.isEmpty();
	}
	//vraca velicinu liste
	public int getSize() {
		return list.size();
	}
	//vraca zadnji objekat
	public Object peek() {
		return list.get(getSize() - 1);
	}
	//vraca zadnji objekat iz liste i brise ga.
	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	//dodaje u listu
	public void push(Object o) {
		list.add(o);
	}
	 // Metod klonira listu.
	public MyStack clone() throws CloneNotSupportedException {
		MyStack stackClone = (MyStack) super.clone();
		stackClone.list = new ArrayList<>(list);;
		return stackClone;
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}

}
