package com.ropimasi.cryptocorepack;



public class Teste_allFibonacciSeq_Methods {

	public static void main(String[] args) {
		System.out.println();

		// The current algorithm of method always will create, at least, 2 elementsAmount.
		// It will always create, at least, 2 elements.
		int[] c = CryptoCore.genFibonacciSeq(-1); // Where (0); (1); (2); would 
		//System.out.println(c[-1]); // thows java.lang.ArrayIndexOutOfBoundsException as expected. ok.
		System.out.println(c[0]);
		System.out.println(c[1]);
		//System.out.println(c[2]); // thows java.lang.ArrayIndexOutOfBoundsException as expected. ok.
		System.out.println();
		
		
		// The current algorithm of method always will create, at max, 32 elementsAmount (index 31).
		int[] b = CryptoCore.genFibonacciSeq(128); // Where (44); (45); (127); would have the same effect.
		//System.out.println(c[-1]); // thows java.lang.ArrayIndexOutOfBoundsException as expected. ok.
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
		System.out.println(b[7]);
		System.out.println(b[15]);		
		System.out.println(b[44]);
		//System.out.println(b[45]); // thows java.lang.ArrayIndexOutOfBoundsException as expected. ok.
		//System.out.println(b[127]); // thows java.lang.ArrayIndexOutOfBoundsException as expected. ok.
		System.out.println();
		
		
		int[] a = CryptoCore.genFibonacciSeq(8);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println(a[6]);
		System.out.println(a[7]);
		//System.out.println(a[8]); // thows java.lang.ArrayIndexOutOfBoundsException as expected. ok.
		System.out.println();		
		
				
		System.out.println(CryptoCore.getFibonacciSeqElement('i', -1)); // get value 0, as expected. ok.
		System.out.println(CryptoCore.getFibonacciSeqElement('i', 0)); // get value 0, as expected. ok.
		System.out.println(CryptoCore.getFibonacciSeqElement('i', 1)); // get value 1, as expected. ok. 
		System.out.println(CryptoCore.getFibonacciSeqElement('i', 2)); // get value 1, as expected. ok.
		System.out.println(CryptoCore.getFibonacciSeqElement('i', 3)); // get value 2, as expected. ok.
		System.out.println(CryptoCore.getFibonacciSeqElement('i', 7)); // get value 13, as expected. ok.
		System.out.println(CryptoCore.getFibonacciSeqElement('i', 15)); // get value 610, as expected. ok.
		System.out.println(CryptoCore.getFibonacciSeqElement('i', 44)); // get value 701408733, as expected. ok.
		System.out.println(CryptoCore.getFibonacciSeqElement('i', 45)); // get value 701408733 as well as expected. ok.
		
		a = CryptoCore.genFibonacciSeq(32);
		for (int i=0; i<=31; i++) {
			System.out.println("i["+ i +"] "+ a[i]);
		}
		
	}
}
