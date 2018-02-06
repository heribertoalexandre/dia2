package Dia2;

import java.util.Arrays;

public class Tempo2 {
	
	public static void main(String[] args) {
		
		
		CArrayList list = new CArrayList ();
		CArrayList listUni = new CArrayList ();
		
		
		Integer[]  random = Aquecimento.randomPlus(10000000, 0, 100);
		
		for(int i = 0; i < random.length; i++)
			list.add(random[i]);
	
		long time = System.currentTimeMillis();
	
		for(int i = 0; i < list.size(); i++) {
				if(!listUni.contains(list.elementAt(i))) {
					 listUni.add(random[i]);
				 }
		}
		time = System.currentTimeMillis() - time;
		
		
		System.out.println(time);
	}
	
}
