package Dia2;

import java.util.Arrays;

import interfaces.IList;

public class CArrayList<T> implements IList<T> {
	
	public static void main(String[] args) {
		Integer object = 2;
		Integer object2 = 3;
		Integer object3 = 4;
		CArrayList teste = new CArrayList ();
		teste.add(object);
		teste.add(object2);
		teste.add(object3, 1);
		System.out.println(teste.contains(object));
		
	}
	
	Object[] elements;
	int next;
	
	public CArrayList() {
		this.elements = new Object[10];
		this.next = 0;
	}
	
	
	public Object[] getElements() {
		Object[] elements = new Object[this.next];
		
		for(int i = 0; i < this.next; i++) {
			elements[i] = this.elements[i];
		}
		
		return elements;
	}



	

	@Override
	public boolean contains(Object element) {
		
		 
		
		boolean result = false;
		
		for(int i = 0; i < next && !result; i++) {
			if(this.elements[i].equals(element))
				result = true;
		}

		return result;
	}

	@Override
	public void add(Object element) {
		this.elements[next] = element;
		next++;
		
		if(next == this.elements.length)
			duplicatedArray();	
	}
	
	public int searchindex(Object element) {
		int  result = -1;
		boolean find = false;
		
		for(int i = 0; i < this.next && !find; i++) {
			if(this.elements[i].equals(element)) {
				result = i;
			}
		}
		return result;
	}

	@Override
	public void remove(Object element) {
		int indexElement = this.searchindex(element);
		if(indexElement != -1) {
			this.remove(indexElement);
		}
		this.next--;
	}

	@Override
	public int size() {
		return this.next;
	}

	@Override
	public void clear() {
		for(int i = 0; i < next; i++)
			this.remove(i);
		this.next = 0;
	}

	@Override
	public void add(Object element, int index) {
		if(index < next) {
			for(int i = index; i < next + 1; i++) {
				this.elements[i + 1 ] = this.elements[i];	
			}
			this.replace(index, element);
			this.next++;
			if(this.next == this.elements.length)
				this.duplicatedArray();
		} else if( index == next) {
			this.add(element);
		} else {
			// Exception
		}
		
	}

	@Override
	public T elementAt(int index) {
		if(index < 0 || index >= next || this.next == 0)
			throw new IllegalArgumentException("Indice Invalido");
			
		return (T) this.elements[index];
	}

	@Override
	public void replace(int index, Object element) {
		if(index < 0 || index >= next)
			throw new IllegalArgumentException("Indice Invalido");
		
		this.elements[index] = element;
	}

	@Override
	public void remove(int index) {
		if(index < this.next) {
			this.elements[index] = null;
			
			for(int i = index + 1; i < this.next; i++) {
				this.elements[i - 1] = this.elements[i];
			}
			this.next--;
		}
		
	}
	
	public  void duplicatedArray() {
		
		Object[] newArray = new Object[this.elements.length * 2];	
		
		for(int i = 0; i < this.next; i++) {
			newArray[i] = this.elements[i];
		}	
		this.elements = (Object[]) newArray;
	}

}
