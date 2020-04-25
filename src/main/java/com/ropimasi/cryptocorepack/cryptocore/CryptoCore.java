/*****************************************************************************80
 *
 * CryptoCorePack (symm.wwok)
 * Cryptography Core Package Project (branch: symm.wwok)
 * 
 * The CryptoCorePack and its resources are a personal property project sample, which I have developing to demonstrate some of my abilities: java, oop, scrum, kanban, git, github, gitflow.
 * The CryptoCorePack project belongs to my personal portfolio. Detailed project can be followed just here on GitHub: https://github.com/users/ROPIMASI/projects/. It is also found on my web portfolio: https://ropimasi.wixsite.com/portfolio.
 * 
 * AUTHOR: RONALDO PI MA SI.
 * LICENSE: PRIVATE (either copy or usage are prohibited).
 * 
 * CONTENT: A PERSONAL CRYPTOGRAPHY UTILITIES PPROJECT;
 *     - THEME: TEXT SYMMETRIC AND ASYMMETRIC CRYPTOGRAFY PACKAGE;
 *     - PROJECT NAME: CryptoCorePack;
 *     - PROJECT BRANCH: symm.wwok;
 *     - PROJECT VERSION: 0.1.0-dev+20200425;
 *     - DEPENDENCES: None;
 *     
 * DEV. ENVIRONMENT PLATAFORM:
 *     - LANGUAGE: JAVA 8. 
 *     - Microsoft Windows(10), Eclipse IDE EE v201903(4.11.0), JDK_SE-JRE-JVM 1.8.0.212;
 * 
 * PROJECT ASSETS:
 *     - SOURCE FILE NAME: CryptoCore.java;
 *     - BIN FILE NAME: CryptoCore.class or its JAR: cryptocorepack.jar;
 *     - README FIRST FILE: README.md;
 *     - OFFICIAL DOCUMENTATION:
 *         . docs/versioning.md;
 *         . docs/changelog.md;
 *         . docs/to-do.md;
 *         . docs/contributors.md.
 *
 * NOTA IMPORTANTE / ISENÇÃO DE RESPONSABILIDADE:
 *     - Este é um projeto pessoal, particular, com finalidade exclusiva de estudos em tecnologia da informação, e de uso e fruto única e exclusivamente de seu autor. Trata-se de um projeto em fase de desenvovimento e experimentações, o qual não tem nenhuma garantia nem responsabilidade sobre seus resultados e efeitos ao ser utilizado.
 *    
 * IMPORTANT NOTE / DISCLAIMER:
 *     - This is a personal, private project, solely for the purpose of my studies in information technology, and for the sole and exclusive use of its author. It is a project under development and experimentation, which has no guarantee neither responsibility over its results and effects when used.
 * 
 ******************************************************************************/



/* PACKAGE OWNER. */
package com.ropimasi.cryptocorepack.cryptocore;



/* IMPORT OF DEPENDENCES. */



/* MAIN CLASS. */
public final class CryptoCore {

	/* PRE-DEFINED STANDARD PROJECT INFOMATIONS CONSTANTS. */
	public static final String PROJ_NAME = "CRYPTOGRAPHY CORE PACKAGE";
	public static final String PROJ_PACK_NAME = "cryptocore";
	public static final String PROJ_BUILD = "20200425";
	public static final String PROJ_PRE_VERSION = "dev";
	public static final String PROJ_VERSION_PATCH = "2";
	public static final String PROJ_VERSION_MINOR = "1";
	public static final String PROJ_VERSION_MAJOR = "0";
	public static final String PROJ_VERSION = PROJ_VERSION_MAJOR+"."+PROJ_VERSION_MINOR+"."+PROJ_VERSION_PATCH+"-"+PROJ_PRE_VERSION+"+"+PROJ_BUILD;
	public static final String TITLE = PROJ_NAME +" "+ PROJ_VERSION;
	public static final String CHAR_SET_WORKABLE = "ASCII";
	public static final boolean IN_DEBUG_MODE = true;
	
	
	
	/* PRE-DEFINED STANDARD ERROR MENSAGES CONSTANTS. */
	
	/* ERR01__ SERIES: CLI PARAMETERS IN GENERAL: */
	/* 1st argument missing: */
	public static final String ERR0101 = "Error # 0101.\nDescription: ...\nSolution: ...\nSee ... for more information.\n";
	/* # 2nd argument missing: */
	public static final String ERR0102 = "Error # 0102.\nDescription: ...\nSolution: ...\nSee ... for more information.\n";
	
	/* ERR02__ SERIES: CLI OPTIONS PARAMETERS SPECIFICALLY: */
	/* Unknown option: */
	public static final String ERR0201 = "Error # 0201.\nDescription: ...\nSolution: ...\nSee ... for more information.\n";
	
	/* ERR03__ SERIES: CLI FILES PARAMETERS SPECIFICALLY: */
	/* File not found: */
	public static final String ERR0301 = "Error # 0301.\nDescription: ...\nSolution: ...\nSee ... for more information.\n";

	/* # ERR99__ SERIES: UNHANDLED OR UNSPECTED: */
	public static final String ERR9999 = "Error # 9999.\nDescription: Unspected error.\n";
	
	
	
	/* Auxiliary method to print when DEBUG_MODE == true. */
	protected static void idmPrint(String str) {
		if (IN_DEBUG_MODE) System.out.println(str);
	}
	
	
	
	/* Password resizing method through repetition. */
	public static String resizeRepeating(String key, int newLength) {
		if (key.length() == newLength) {
			idmPrint(",");
			return key;
		} else if (key.length() < newLength) {
			int pos = 0;
			int tokenSize = key.length();
			do {
				idmPrint(",");
				key += key.charAt(pos);
				pos = (pos <= tokenSize - 1) ? pos + 1 : 0;
			} while (key.length() < newLength);
			return key;
		} else { // (key.length() > newLength)
			idmPrint(",");
			key = key.substring(0, newLength);
			return key;
		}
	}

	
	
	/* Symmetric encryptation without key. */ 
	public static String symmEncrypt(String decryptedText) {
		/**
		 * Return an encrypted string from a given natural text (input on arg).
		 * 
		 */
		String encryptedText = "";
		for (int i = 0; i < decryptedText.length(); i++) {
			idmPrint(".");
			encryptedText += (char) ((int) (decryptedText.charAt(i)) + (decryptedText.length() - i));
		}
		idmPrint("[" + encryptedText + "]");
		return encryptedText;
	}

	
	
	/* Overloading: Symmetric encryptation with key. */ 
	public static String symmEncrypt(String decryptedText, String key) {
		/**
		 * Return an encrypted string from a given natural text (input on arg).
		 * 
		 */
		idmPrint("[" + key + "][" + decryptedText.length() + "]");
		key = resizeRepeating(key, decryptedText.length());
		String encryptedText = "";
		for (int i = 0; i < decryptedText.length(); i++) {
			idmPrint(".");
			encryptedText += (char) ((int) (decryptedText.charAt(i)) + (int) (key.charAt(i)) + i);
		}
		idmPrint("[" + key + "][" + decryptedText.length() + "][" + encryptedText + "]");
		return encryptedText;
	}

	
	
	/* Symmetric decryptation without key. */
	public static String symmDecrypt(String encryptedText) {
		/**
		 * Return a decrypted string from a given encrypted text (input on arg).
		 * 
		 */
		String decryptedText = "";
		for (int i = 0; i < encryptedText.length(); i++) {
			idmPrint(":");
			decryptedText += (char) ((int) (encryptedText.charAt(i)) - (encryptedText.length() - i));
		}
		idmPrint("[" + decryptedText + "]");
		return decryptedText;
	}

	
	
	/* Overloading: Symmetric decryptation with key. */
	public static String symmDecrypt(String encryptedText, String key) {
		/**
		 * Return a decrypted string from a given encrypted text (input on arg).
		 * 
		 */
		idmPrint("[" + key + "][" + encryptedText.length() + "]");
		key = resizeRepeating(key, encryptedText.length());
		String decryptedText = "";
		for (int i = 0; i < encryptedText.length(); i++) {
			idmPrint(":");
			decryptedText += (char) ((int) (encryptedText.charAt(i)) - (int) (key.charAt(i)) - i);
		}
		idmPrint("[" + key + "][" + encryptedText.length() + "][" + decryptedText + "]");
		return decryptedText;
	}
}
