package com.ropimasi.cryptocorepack;



public class Teste_symmTokenInjection { // v0

	public static void main(String[] args) {
		
		/*
		System.out.println();
		String inputText= "Ronaldo Marques ρπμδ"; // ρπμδ || ρπμ
		
		
		System.out.println(inputText.substring(inputText.length()-4));
		System.out.println(inputText.substring(inputText.length()-3));
		
		
		String ie = inputText.substring(0, inputText.length()-4);
		System.out.println("["+ ie +"]");
		
		
		System.out.println();
		*/
		
			
		
		
		System.out.println("WITHOUT KEY");
		System.out.println();
		String natural1 = "Mensagem Natural" ;
		
		// ok, according expected, there are some improvements and bugs to re-code.
		System.out.println("Natural:"+ natural1 +":"+ natural1.length());
		System.out.println();
		
		// ok, according expected, there are some improvements and bugs to re-code.
		String injected1 = CryptoCore.symmTokenInjection(natural1, true);
		System.out.println("Injetado 1:"+ injected1 +":"+ injected1.length());
		System.out.println();
		
		// ok, according expected, there are some improvements and bugs to re-code.
		System.out.println("Reconhecimento 1:"+ injected1 +":"+ (injected1).substring((injected1).length()-4) +":"+ (injected1).substring((injected1).length()-3) +":"+ CryptoCore.tokenRecognition(injected1));
		System.out.println();
		
		// deject.
		String dejected1 = CryptoCore.symmTokenInjection(injected1, false);
		System.out.println("Dejetado 1:"+ dejected1 +":"+ dejected1.length());
		System.out.println();
		
		
		
		/*
		System.out.println();
		System.out.println("WITH KEY");
		String text2 = "Algumas Mensagemmmns" ;
		String key2 = "abc123def456ghi789!@#%&*()_+-=::" ; // ok, according expected, there are some improvements and bugs to re-code.
		
		
		System.out.println("Natural:"+ text2 +":"+ text2.length()); // ok, according expected, there are some improvements and bugs to re-code.
		System.out.println();
		
		String cyphra2 = CryptoCore.symmTokenInjection(key2, text2, true); // ok, according expected, there are some improvements and bugs to re-code.
		System.out.println("Ciphrado 2:"+ cyphra2 +":"+ cyphra2.length()); 
		System.out.println();
		
		// ok, according expected, there are some improvements and bugs to re-code.
		System.out.println("Reconhecimento 2:"+ cyphra2 +":"+ (cyphra2).substring((cyphra2).length()-4) +":"+ (cyphra2).substring((cyphra2).length()-3) +":"+ CryptoCore.tokenRecognition(cyphra2));
		System.out.println();
		*/
		
	}
}
