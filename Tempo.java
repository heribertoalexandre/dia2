package Dia2;

import java.util.Arrays;
import java.util.Random;

public class Tempo {
	public static void main(String[] args) {
		long tempo = System.currentTimeMillis();
		
		Integer[] array = Aquecimento.randomPlus(1000000, 0, 100000);
		Integer[] random = Aquecimento.randomPlus(10000, 0, 50000);
		
		
		for(int i = 0; i < random.length; i++) {
			Aquecimento.contains(array,random[i]);
		}
		
		tempo = System.currentTimeMillis()- tempo;
		
		System.out.println("Tempo linerar: " + tempo);
		
		//busca binaria
		
		Arrays.sort(array);
		
		tempo = System.currentTimeMillis();
		
		for(int i = 0; i < random.length; i++) {
			Aquecimento.buscaBinaria(array,random[i]);
		}
		
		tempo = System.currentTimeMillis() - tempo;
		
		System.out.println("Tempo Busca Binaria: " + tempo);
		
	}
}
