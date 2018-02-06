package Dia2;

import interfaces.IStack;

public class CArrayStack<T> implements IStack<T> {

	
	
	CArrayList<T> list = new CArrayList<T>();
	
	@Override
	public int size() {
		return list.size();
		
	}

	@Override
	public void clear() {
		list.clear();
		
	}

	@Override
	public void push(T element) {
		list.add(element);
		
	}

	@Override
	public T pop() {	
		T remove = null;	
		if(list.size()  - 1 > 0) {
			int index = this.list.size() - 1;	
			remove = list.elementAt(index);	
			list.remove(index);
			return remove;
		}
		
		throw new IllegalArgumentException("Indice Invalido");
		
	}

	@Override
	public T peek() {
		
		if(list.size()  - 1 > 0) {
			int index = this.list.size() - 1;
			
			T remove = list.elementAt(index);
			
			return remove;
		}
		
		throw new IllegalArgumentException("Indice Invalido");
	}

}
