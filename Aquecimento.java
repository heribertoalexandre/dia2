package Dia2;

import java.util.Random;

public class Aquecimento {
	
	public static void main(String[] args) {
		Integer[] array = {1,5,8,9,9,12,21,23};
		
		System.out.println(buscaBinaria(array,23));
	}
	
	
	public static boolean contains (Integer[]v , int n) {
		
		boolean result = false;
		
		for(int i = 0;  i < v.length && !result ; i++) {
			if(v[i] == n) {
				result =  true;
			}
		}
		
		return result;
	}
	
	public static boolean buscaBinaria (Integer[]v, int n) {
		boolean result = false;
		
		int end = v.length - 1;
		int start = 0;
		int half= (end - start) / 2;
		
		while(start <= end && !result) {
			
			if(v[half] == n) {
				result = true;
			} else if(v[half] < n) {
				start = half + 1;
			} else if ( n < v[half]) {
				end = half - 1;
			}
			half = ((end - start)/2) + start;
		}
		return result;	
	}
	
	public static void InsertionSort (Integer[] v) {
		for(int i = 1; i < v.length; i++) {	
			int aux = v[i];
			int j = i - 1;
			for(; j >= 0 && v[j] > aux; j--)
				 v[j + 1] =  v[j];
				
			v[j+1] = aux; 
		}
	}
	
public static Integer [] randomPlus(int length, int min, int max) {
		
		Integer[] vector = new Integer[length];
		Random seed = new Random(max);
	
		for(int times = 0; times < length; times++) {	
			
			int randomFinal = seed.nextInt((max - min) + 1) + min;
			vector[times] = randomFinal;
		}
		return vector;
	}
}
