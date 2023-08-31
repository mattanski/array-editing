package it.apuliadigitalmaker.esercitazioni;

import java.util.Arrays;

public class ArrayEditing {
	
		
		public static void main(String[] args) {
		    int array1[]={12, 45, 78, 11, 44, 77, 10, 43, 76, 9,};
		    int i;
		    int numeroMassimo;

		    numeroMassimo=array1[0];

		    for(i=0; i<=array1.length-1; i++) {
		      if( array1[i]>numeroMassimo ) {
		    	  numeroMassimo=array1[i];
		      }
		    }

		    System.out.println("Il numero più grande: "+numeroMassimo);
		    
		    
		    Arrays.sort(array1);
		    System.out.println("L'array in ordine crescente è: "+ Arrays.toString(array1));
		    
		    
		    int[] array2 = new int[10]; 						//crea un nuovo array di 10 numeri
		    int j;
		    
		    for(i=0,j=9; i<=9; i++, j--) {
		    	
		    	array2[i]=array1[j];
		    	
		    	
		    }
		    
		    
		    System.out.print ("Il nuovo array ordinato in ordine decrescente è: " + Arrays.toString(array2));
		    
		    
		    
		  }
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
	