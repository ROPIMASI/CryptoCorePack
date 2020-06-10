package com.ropimasi.cryptocorepack;



public class Teste1 {

	public static void main(String[] args) {

		if (CCPStandards.DEBUG_MODE) {
			
			System.out.println("\nConstantes de informações do projetos prédefinidas:\n"+
						"PROJ_NAME["+ CCPStandards.PROJ_NAME +"]\n"+
						"PROJ_ALIAS["+ CCPStandards.PROJ_ALIAS +"]\n\n"+
						
						"PROJ_PACKAGE_PATH["+ CCPStandards.PROJ_PACKAGE_PATH +"]\n"+
						"PROJ_PACKAGE_NAME["+ CCPStandards.PROJ_PACKAGE_NAME +"]\n"+
						
						"PROJ_BUILD["+ CCPStandards.PROJ_BUILD +"]\n"+
						"PROJ_PRE_VERSION["+ CCPStandards.PROJ_PRE_VERSION +"]\n"+
						"PROJ_VERSION_PATCH["+ CCPStandards.PROJ_VERSION_PATCH +"]\n"+
						"PROJ_VERSION_MINOR["+ CCPStandards.PROJ_VERSION_MINOR +"]\n"+
						"PROJ_VERSION_MAJOR["+ CCPStandards.PROJ_VERSION_MAJOR +"]\n"+
						"PROJ_VERSION["+ CCPStandards.PROJ_VERSION +"]\n\n"+
						
						"TITLE["+ CCPStandards.TITLE +"]\n\n"+
						
						"CHARSET_WORKABLE["+ CCPStandards.CHARSET_WORKABLE +"]\n\n");		
			
			System.out.println("\nConstantes de tratamento de erros:\n"+
					"ERR0101["+ CCPStandards.ERR0101 +"]\n"+
					"ERR0102["+ CCPStandards.ERR0102 +"]\n"+
					"ERR0201["+ CCPStandards.ERR0201 +"]\n"+
					"ERR0301["+ CCPStandards.ERR0301 +"]\n"+
					"ERR9999["+ CCPStandards.ERR9999 +"]\n");
			
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CCPStandards.PROJ_VERSION, 0));
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CCPStandards.PROJ_VERSION, 1));
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CCPStandards.PROJ_VERSION, 2));
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CCPStandards.PROJ_VERSION, 18));
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CCPStandards.PROJ_VERSION, CCPStandards.PROJ_VERSION.length()));
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CCPStandards.PROJ_VERSION, 25));
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CCPStandards.PROJ_VERSION, 36));
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CCPStandards.PROJ_VERSION, 37));
			System.out.println("\nkeyRemolding(): "+ CryptoCore.keyRemolding(CCPStandards.PROJ_VERSION, 'a'));	// Char is read as a shortint or int.
			//System.out.println("\nkeyRemolding(): "+ CCPTextFile.keyRemolding(CCPTextFile.PROJ_VERSION, -1));	// BUG.
			System.out.println();
			
			System.out.println("\nsymmCharSwitching(): "+ CryptoCore.symmCharSwitching(CCPStandards.PROJ_VERSION, true));
			System.out.println("\nsymmCharSwitching(): "+ CryptoCore.symmCharSwitching(CCPStandards.PROJ_VERSION, false));
			System.out.println("\nsymmCharSwitching(): "+ CryptoCore.symmCharSwitching(CryptoCore.symmCharSwitching(CCPStandards.PROJ_VERSION, true), false));
			System.out.println();
			
			System.out.println("\nsymmRandomFoundry(): "+ CryptoCore.symmRandomFoundry(CCPStandards.PROJ_VERSION, true));
			System.out.println("\nsymmRandomFoundry(): "+ CryptoCore.symmRandomFoundry(CCPStandards.PROJ_VERSION, false));
			System.out.println("\nsymmRandomFoundry(): "+ CryptoCore.symmRandomFoundry(CryptoCore.symmRandomFoundry(CCPStandards.PROJ_VERSION, true), false));
			System.out.println();
			
			System.out.println("\nsymmKeyFoundry(): "+ CryptoCore.symmKeyFoundry(CCPStandards.PROJ_VERSION, CCPStandards.PROJ_PRE_VERSION, true));
			System.out.println("\nsymmKeyFoundry(): "+ CryptoCore.symmKeyFoundry(CCPStandards.PROJ_VERSION, CCPStandards.PROJ_PRE_VERSION, false));
			System.out.println("\nsymmKeyFoundry(): "+ CryptoCore.symmKeyFoundry(CryptoCore.symmKeyFoundry(CCPStandards.PROJ_VERSION, CCPStandards.PROJ_PRE_VERSION, true), CCPStandards.PROJ_PRE_VERSION, false));
			System.out.println();
		}
		
	}

}
