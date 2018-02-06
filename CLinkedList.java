package Dia2;

import java.util.Arrays;

import interfaces.IList;

public class CLinkedList<T> implements IList<T> {

	public static void main(String[] args) {
		CLinkedList<Integer> teste = new  CLinkedList<Integer>();
		Integer obj1 = 1;
		Integer obj2 = 2;
		Integer obj3 = 3;
		
		
		teste.add(obj1);
		teste.add(obj2);
		teste.add(obj3);
		teste.remove(1);
		System.out.println(teste.elementAt(1));
	}
	
	
	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	
	public CLinkedList() {
		
		this.head = new Node<T> (null);
		this.tail = new Node<T> (null);
		this.size = 0;
	}



	
	public static class Node<T>{
		T element;
		Node<T> next;
		
		public Node (T e){
			element = e; 
		}
	}
	
	@Override
	public boolean contains(T element) {
		boolean result = false;
		Node<T> node = head.next;

		while(node != null && !result)
		{
			if(node.element.equals(element)) {
				result = true;
			}else {
				node = node.next;
			}
		}
			
		return result;
	}

	@Override
	public void add(T element) {
		Node<T> novo = new Node<T>(element);
		
		if(size == 0) {
			this.head.next = novo;
			this.tail = novo;	
		}else {
			this.tail.next = novo;
			this.tail = novo;
		}
		
		this.size++;
		
	}
	public boolean isEmpty() {
		boolean result = false;
		
		if(this.head.next == null) {
			result = true;
		}
		return result;
	}
	@Override
	public void remove(T element) {
		
		
		Node<T> pivo = head.next;
		Node<T> a = head;
		
		if(this.size > 0) {
			
			boolean find = false;
			
			int count = 0;
			while(count < size && !find) {
				if(pivo.element.equals(element)) {
					a.next = pivo.next;
				}
					
			}
		}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void clear() {
		this.head = null;
		this.tail = null;	
		this.size = 0;
	}

	@Override
	public void add(T element, int index) {
		
		Node<T> novo = new Node<T>(element);
		
		Node<T> pivo = head.next;
		Node<T> a = head;
		
		boolean find = false;

		if(index == 0) {
			novo.next = a.next;
			this.head = novo;
		}else {

			for(int i = 0; i < this.size && !find; i++) {
				if(i  == index) {
					a.next = novo;
					novo.next = pivo.next;
					find = true;
				}else {
					a = a.next;
					pivo = pivo.next;
				}
			}
		}
		
		
	}
	
	public  int searchIndex(Node<T> element) {
		int index = -1;
		Node pivo = head;
		
		for(int i = 0; i< this.size; i++) {
			if(pivo.next.equals(element)) {
				return i;
			}
			
			pivo = pivo.next;
		}
		return index;
	}

	@Override
	public T elementAt(int index) {
		boolean find = false;
		Node pivo = head.next;
		
		for(int i = 0; i < this.size && !find; i++) {
			if(index == i) {
				return (T) pivo.element;
			} else {
				pivo = pivo.next;
			}
		}
		return null;
	}

	@Override
	public void replace(int index, T element) {

		
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

}
