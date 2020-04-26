package com.ropimasi.cryptocorepack.cryptocore;

import com.ropimasi.cryptocorepack.cryptocore.CryptoCore;

public class Teste1 {

	public static void main(String[] args) {

		
		if (CryptoCore.IN_DEBUG_MODE) {
			
			System.out.println("\nConstantes de informações do projetos prédefinidas:\n"+
						"PROJ_NAME["+ CryptoCore.PROJ_NAME +"]\n"+
						"PROJ_PACKAGE_PATH["+ CryptoCore.PROJ_PACKAGE_PATH +"]\n"+
						"PROJ_PACKAGE_NAME["+ CryptoCore.PROJ_PACKAGE_NAME +"]\n"+
						"PROJ_PACK_NAME["+ CryptoCore.PROJ_PACK_NAME +"]\n"+
						
						"PROJ_BUILD["+ CryptoCore.PROJ_BUILD +"]\n"+
						"PROJ_PRE_VERSION["+ CryptoCore.PROJ_PRE_VERSION +"]\n"+
						"PROJ_VERSION_PATCH["+ CryptoCore.PROJ_VERSION_PATCH +"]\n"+
						"PROJ_VERSION_MINOR["+ CryptoCore.PROJ_VERSION_MINOR +"]\n"+
						"PROJ_VERSION_MAJOR["+ CryptoCore.PROJ_VERSION_MAJOR +"]\n"+
						"PROJ_VERSION["+ CryptoCore.PROJ_VERSION +"]\n"+
						
						"TITLE["+ CryptoCore.TITLE +"]\n"+
						"CHAR_SET_WORKABLE["+ CryptoCore.CHAR_SET_WORKABLE +"]\n");		
			
			System.out.println("\nConstantes de tratamento de erros:\n"+
					"ERR0101["+ CryptoCore.ERR0101 +"]\n"+
					"ERR0102["+ CryptoCore.ERR0102 +"]\n"+
					"ERR0201["+ CryptoCore.ERR0201 +"]\n"+
					"ERR0301["+ CryptoCore.ERR0301 +"]\n"+
					"ERR9999["+ CryptoCore.ERR9999 +"]\n");
			
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CryptoCore.PROJ_VERSION, 0));
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CryptoCore.PROJ_VERSION, 1));
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CryptoCore.PROJ_VERSION, 2));
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CryptoCore.PROJ_VERSION, 18));
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CryptoCore.PROJ_VERSION, CryptoCore.PROJ_VERSION.length()));
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CryptoCore.PROJ_VERSION, 25));
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CryptoCore.PROJ_VERSION, 36));
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CryptoCore.PROJ_VERSION, 37));
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CryptoCore.PROJ_VERSION, 'a'));	// Char is read as a shortint or int.
			//System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CryptoCore.PROJ_VERSION, -1));	// BUG.
			System.out.println();
			
			System.out.println("\nsymmCharSwitching(): "+ CryptoCore.symmCharSwitching(CryptoCore.PROJ_VERSION, true));
			System.out.println("\nsymmCharSwitching(): "+ CryptoCore.symmCharSwitching(CryptoCore.PROJ_VERSION, false));
			System.out.println("\nsymmCharSwitching(): "+ CryptoCore.symmCharSwitching(CryptoCore.symmCharSwitching(CryptoCore.PROJ_VERSION, true), false));
			System.out.println();
			
			System.out.println("\nsymmRandomFoundry(): "+ CryptoCore.symmRandomFoundry(CryptoCore.PROJ_VERSION, true));
			System.out.println("\nsymmRandomFoundry(): "+ CryptoCore.symmRandomFoundry(CryptoCore.PROJ_VERSION, false));
			System.out.println("\nsymmRandomFoundry(): "+ CryptoCore.symmRandomFoundry(CryptoCore.symmRandomFoundry(CryptoCore.PROJ_VERSION, true), false));
			System.out.println();
			
			System.out.println("\nsymmKeyFoundry(): "+ CryptoCore.symmKeyFoundry(CryptoCore.PROJ_VERSION, CryptoCore.PROJ_PRE_VERSION, true));
			System.out.println("\nsymmKeyFoundry(): "+ CryptoCore.symmKeyFoundry(CryptoCore.PROJ_VERSION, CryptoCore.PROJ_PRE_VERSION, false));
			System.out.println("\nsymmKeyFoundry(): "+ CryptoCore.symmKeyFoundry(CryptoCore.symmKeyFoundry(CryptoCore.PROJ_VERSION, CryptoCore.PROJ_PRE_VERSION, true), CryptoCore.PROJ_PRE_VERSION, false));
			System.out.println();
			
			
		}
		
	}

}
