package Dia2;

import java.util.Arrays;

import interfaces.IQueue;

public class CQueue<T> implements IQueue<T> {
	
	public static void main(String[] args) {
		CQueue<Integer> teste = new CQueue<Integer>();
		
		Integer obj1 = 1;
		Integer obj2 = 2;
		
		
		teste.enqueue(obj1);
		teste.enqueue(obj2);
		
		System.out.println(teste.head());
	}
	
	
	private CArrayList<T> elements = new CArrayList<T>();
	
	public Object[] getElements() {
		return this.elements.getElements();
	}
	@Override
	public int size() {
		return this.elements.size();
	}

	@Override
	public void clear() {
		this.elements.clear();
	}

	@Override
	public void enqueue(T e) {
		this.elements.add(e, this.size());
	}

	@Override
	public void poll() {
		this.elements.remove(0);
	}

	@Override
	public T head() {
		
		return this.elements.elementAt(0);
	}

}
