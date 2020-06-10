package com.ropimasi.cryptocorepack;



public class Teste_allAccumulativeSeq_Methods {

	public static void main(String[] args) {
		System.out.println();

		// The current algorithm of method always will create, at least, 2 elementsAmount.
		// It will always create, at least, 2 elements.
		int[] c = CryptoCore.genAccumulativeSeq(-1); // Where (0); (1); (2); would 
		// System.out.println(c[-1]); // thows java.lang.ArrayIndexOutOfBoundsException as expected. ok.
		System.out.println(c[0]);
		System.out.println(c[1]);
		// System.out.println(c[2]); // thows java.lang.ArrayIndexOutOfBoundsException as expected. ok.
		System.out.println();
		
		
		// The current algorithm of method always will create, at max, 32 elementsAmount (index 31).
		int[] b = CryptoCore.genAccumulativeSeq(128); // Where (32); (33); (127); would have the same effect.
		// System.out.println(c[-1]); // thows java.lang.ArrayIndexOutOfBoundsException as expected. ok.
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
		System.out.println(b[7]);
		System.out.println(b[15]);		
		System.out.println(b[31]);
		//System.out.println(b[32]); // thows java.lang.ArrayIndexOutOfBoundsException as expected. ok.
		//System.out.println(b[127]); // thows java.lang.ArrayIndexOutOfBoundsException as expected. ok.
		System.out.println();
		
		
		int[] a = CryptoCore.genAccumulativeSeq(8);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		System.out.println(a[6]);
		System.out.println(a[7]);
		// System.out.println(a[8]); // thows java.lang.ArrayIndexOutOfBoundsException as expected. ok.
		System.out.println();		
		
				
		System.out.println(CryptoCore.getAccumulativeSeqElement('i', -1)); // get value 0, as expected. ok.
		System.out.println(CryptoCore.getAccumulativeSeqElement('i', 0)); // get value 0, as expected. ok.
		System.out.println(CryptoCore.getAccumulativeSeqElement('i', 1)); // get value 1, as expected. ok. 
		System.out.println(CryptoCore.getAccumulativeSeqElement('i', 2)); // get value 1, as expected. ok.
		System.out.println(CryptoCore.getAccumulativeSeqElement('i', 3)); // get value 2, as expected. ok.
		System.out.println(CryptoCore.getAccumulativeSeqElement('i', 7)); // get value 32, as expected. ok.
		System.out.println(CryptoCore.getAccumulativeSeqElement('i', 15)); // get value 8192, as expected. ok.
		System.out.println(CryptoCore.getAccumulativeSeqElement('i', 31)); // get value 536870912, as expected. ok.
		System.out.println(CryptoCore.getAccumulativeSeqElement('i', 32)); // get value 536870912 as well as expected. ok.
		
		
		a = CryptoCore.genAccumulativeSeq(32);
		for (int i=0; i<=31; i++) {
			System.out.println("i["+ i +"] "+ a[i]);
		}
	}
}
