package Dia2;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.concurrent.SynchronousQueue;

import org.junit.jupiter.api.Test;

class Testes {

	CArrayList teste = new CArrayList();
	Integer obj1 = 1;
	Integer obj2 = 2;
	Integer obj3 = 3;
	Integer obj4 = 4;
	Integer obj5 = 5;
	
	@Test
	void testAdd() {
		
		Integer[] esperado = {1,2,3,4};
		
		this.teste.add(obj1);
		this.teste.add(obj2);
		this.teste.add(obj3);
		this.teste.add(obj4);
		
		assertArrayEquals(esperado, this.teste.getElements());
		assertSame(obj4, this.teste.size());
		
		assertArrayEquals(esperado, this.teste.getElements());
		assertTrue(this.teste.contains(obj1));
		assertTrue(this.teste.contains(obj2));
		assertTrue(this.teste.contains(obj3));
		assertTrue(this.teste.contains(obj4));
		
		assertSame(obj4, this.teste.elementAt(3));
		
		
		Integer[] esperado2 = {3,4};
		this.teste.remove(obj1);
		this.teste.remove(0);
		
		assertArrayEquals(esperado2, this.teste.getElements());
		
		Integer[] esperado3 = {3,5,4};
		this.teste.add(obj5,1);
		
		assertArrayEquals(esperado3, this.teste.getElements());
		
		this.teste.clear();
		
		Integer[] esperado4 = {};
		
		assertArrayEquals(esperado4, this.teste.getElements());
	}


}
