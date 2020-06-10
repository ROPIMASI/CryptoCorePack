package com.ropimasi.cryptocorepack;



public class Teste_charSwitching {

	public static void main(String[] args) {

		System.out.println();
		
		CryptoCore.symmCharSwitching("", true);
		CryptoCore.symmCharSwitching(" ", true);
		CryptoCore.symmCharSwitching("  ", true);
		System.out.println();
		
		String tmp = CryptoCore.symmCharSwitching(" abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ 0123456789 !@#$%¨&*()[]{}_çÇ~^´`'\" -=+\\|/?,.;<>:", true);
		System.out.println();		
		
		CryptoCore.symmCharSwitching(tmp,false);
		System.out.println();
		
		CryptoCore.symmCharSwitching(CryptoCore.symmCharSwitching(Integer.toString(1+1),true),false);
		// APPROVED.20200428.ROPIMASI. =)
	}
}
