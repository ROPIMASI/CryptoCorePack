package com.ropimasi.cryptocorepack;



public class Teste_keyRemolding {

	public static void main(String[] args) {

		System.out.println();
		
		System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding("teste-key-remolding", 0));			// BUG ADDRESSED. =)
		System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding("teste-key-remolding", 1));
		System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding("teste-key-remolding", 2));
		System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding("teste-key-remolding", 18));
		System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding("teste-key-remolding", "teste-key-remolding".length()));
		System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding("teste-key-remolding", 25));
		System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding("teste-key-remolding", 36));
		System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding("teste-key-remolding", 37));
		System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding("teste-key-remolding", -1));			// BUG ADDRESSED. =)
		System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding("teste-key-remolding", -5));			// BUG ADDRESSED. =)
		System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding("teste-key-remolding", 999999999));	// BUG ADDRESSED. =)
		
		System.out.println();		
	}
}
