package com.ropimasi.cryptocorepack;



public class Teste2 {

	public static void main(String[] args) {

		int v[] = new int[46];
		
		int c = 0;
		v[c] = 0;
		System.out.println(c +": "+ v[c]);
		
		c = 1;
		v[c] = 1;
		System.out.println(c +": "+ v[c]);		
		
		for (c=2; c<=46; c++) {
			v[c] = v[c-1] + v[c-2] ;
			System.out.println(c +": "+ v[c]);
		}
	
	}

}
