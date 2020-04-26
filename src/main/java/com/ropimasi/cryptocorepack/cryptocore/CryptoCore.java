/*****************************************************************************80
 *
 * CryptoCorePack
 * Cryptography Core Package Project
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



/* THE MAIN CLASS. */
public final class CryptoCore {

	/* PRE-DEFINED STANDARD PROJECT INFOMATIONS CONSTANTS. */
	public static final String PROJ_NAME = "CRYPTOGRAPHY CORE PACK";
	public static final String PROJ_PACKAGE_PATH = "com/ropimasi/cryptocorepack/cryptocore";
	public static final String PROJ_PACKAGE_NAME = "com.ropimasi.cryptocorepack.cryptocore";
	public static final String PROJ_PACK_NAME = "cryptocore";
	
	public static final String PROJ_BUILD = "20200426";
	public static final String PROJ_PRE_VERSION = "dev";
	public static final String PROJ_VERSION_PATCH = "0";
	public static final String PROJ_VERSION_MINOR = "1";
	public static final String PROJ_VERSION_MAJOR = "0";
	public static final String PROJ_VERSION = PROJ_VERSION_MAJOR+"."+PROJ_VERSION_MINOR+"."+PROJ_VERSION_PATCH+"-"+PROJ_PRE_VERSION+"+"+PROJ_BUILD;
	
	public static final String TITLE = PROJ_NAME +" "+ PROJ_VERSION;
	public static final String CHAR_SET_WORKABLE = "ASCII";
	public static final boolean IN_DEBUG_MODE = true;
	
	
	
	/* PRE-DEFINED STANDARD ERROR MENSAGES CONSTANTS. */
	
	/* ERR01__ SERIES: CLI PARAMETERS IN GENERAL: */
	/* 1st argument missing: */
	public static final String ERR0101 = "Error # 0101.\nDescription: ...\nSolution: ...\nSee ... for more information.";
	/* # 2nd argument missing: */
	public static final String ERR0102 = "Error # 0102.\nDescription: ...\nSolution: ...\nSee ... for more information.";
	
	/* ERR02__ SERIES: CLI OPTIONS PARAMETERS SPECIFICALLY: */
	/* Unknown option: */
	public static final String ERR0201 = "Error # 0201.\nDescription: ...\nSolution: ...\nSee ... for more information.";
	
	/* ERR03__ SERIES: CLI FILES PARAMETERS SPECIFICALLY: */
	/* File not found: */
	public static final String ERR0301 = "Error # 0301.\nDescription: ...\nSolution: ...\nSee ... for more information.";

	/* # ERR99__ SERIES: UNHANDLED OR UNSPECTED: */
	public static final String ERR9999 = "Error # 9999.\nDescription: Unspected error.";
	
	
	
	/* DEBUG auxiliary method to print when DEBUG_MODE == true. */
	protected static void idmPrint(String str) {
		if (IN_DEBUG_MODE) System.out.println(str);
	}
	
	
	
	/* Very simple, old, and rudimentary method of cryptography, unless like knowledge. */
	/* Simple char switching method, used as a cryptography step. It will be used on hybrid mode. */
	/* Auxiliary method: simple char switching for others methods calling. */
	public static char charSwitching(char c, boolean doUndo) {
		switch (c) {
		case 'a': 
			return (doUndo) ? 'q' : 'K';
		
		case 'b':
			return (doUndo) ? 'w' : 'X';
		
		case 'c':
			return (doUndo) ? 'e' : 'V';
		
		case 'd':
			return (doUndo) ? 'R' : 'm';
		
		case 'e':
			return (doUndo) ? '4' : 'c';
		
		case 'f':
			return (doUndo) ? 'Y' : 'n';
		
		case 'g':
			return (doUndo) ? 'u' : '2';
		
		case 'h':
			return (doUndo) ? 'i' : 'P';
		
		case 'i':
			return (doUndo) ? 'o' : 'h';
		
		case 'j':
			return (doUndo) ? '8' : 'Q';
		
		case 'k':
			return (doUndo) ? 'A' : '8';
		
		case 'l':
			return (doUndo) ? 'S' : 's';
		
		case 'm':
			return (doUndo) ? 'd' : 'z';
		
		case 'n':
			return (doUndo) ? 'f' : '4';
		
		case 'o':
			return (doUndo) ? '2' : 'i';
		
		case 'p':
			return (doUndo) ? 'H' : 'J';
		
		case 'q':
			return (doUndo) ? 'J' : 'a';
		
		case 'r':
			return (doUndo) ? 'K' : 'D';
		
		case 's':
			return (doUndo) ? 'l' : '7';
		
		case 't':
			return (doUndo) ? '6' : 'E';
		
		case 'u':
			return (doUndo) ? 'x' : 'g';
		
		case 'v':
			return (doUndo) ? 'C' : 'W';
		
		case 'w':
			return (doUndo) ? 'V' : 'b';
		
		case 'x':
			return (doUndo) ? 'B' : 'u';
		
		case 'y':
			return (doUndo) ? '0' : 'F';
		
		case 'z':
			return (doUndo) ? 'm' : '3';
			
		case 'A':
			return (doUndo) ? 'Q' : 'k';
	
		case 'B':
			return (doUndo) ? 'W' : 'x';

		case 'C':
			return (doUndo) ? '5' : 'v';
		
		case 'D':
			return (doUndo) ? 'r' : 'M';
		
		case 'E':
			return (doUndo) ? 't' : '@';
		
		case 'F':
			return (doUndo) ? 'y' : 'N';
		
		case 'G':
			return (doUndo) ? '9' : 'O';
		
		case 'H':
			return (doUndo) ? 'I' : 'p';
		
		case 'I':
			return (doUndo) ? 'O' : 'H';
		
		case 'J':
			return (doUndo) ? 'p' : 'q';
		
		case 'K':
			return (doUndo) ? 'a' : 'r';
		
		case 'L':
			return (doUndo) ? '3' : 'S';
		
		case 'M':
			return (doUndo) ? 'D' : ' ';
		
		case 'N':
			return (doUndo) ? 'F' : '!';
		
		case 'O':
			return (doUndo) ? 'G' : 'I';
		
		case 'P':
			return (doUndo) ? 'h' : '1';

		case 'Q':
			return (doUndo) ? 'j' : 'A';
		
		case 'R':
			return (doUndo) ? '7' : 'd';

		case 'S':
			return (doUndo) ? 'L' : 'l';
		
		case 'T':
			return (doUndo) ? 'Z' : '0';

		case 'U':
			return (doUndo) ? 'X' : '6';
		
		case 'V':
			return (doUndo) ? 'c' : 'w';

		case 'W':
			return (doUndo) ? 'v' : 'B';
		
		case 'X':
			return (doUndo) ? 'b' : 'U';

		case 'Y':
			return (doUndo) ? '1' : 'f';
		
		case 'Z':
			return (doUndo) ? ' ' : 'T';
			
		case ' ':
			return (doUndo) ? 'M' : 'Z';
			
		case '0':
			return (doUndo) ? 'T' : 'y';
		
		case '1':
			return (doUndo) ? 'P' : 'Y';
		
		case '2':
			return (doUndo) ? 'g' : 'o';
		
		case '3':
			return (doUndo) ? 'z' : 'L';
		
		case '4':
			return (doUndo) ? 'n' : 'e';
		
		case '5':
			return (doUndo) ? '@' : 'C';
		
		case '6':
			return (doUndo) ? 'U' : 't';
		
		case '7':
			return (doUndo) ? 's' : 'R';
		
		case '8':
			return (doUndo) ? 'k' : 'j';
		
		case '9':
			return (doUndo) ? '!' : 'G';
			
		case '!':
			return (doUndo) ? 'N' : '9';

		case '@':
			return (doUndo) ? 'E' : '5';
			
		default:
			return c;
		}
	}
	
	
	
	/* Auxiliary method: password resizing through repetition. */
	public static String keyRemolding(String key, int newLength) {
		
		/* BUG FOUND in this method:
		 * newLength negative <= -1
		 * { java.lang.StringIndexOutOfBoundsException } */
		
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

	
	
	/* Symmetric foundry-technique without key. */ 
	public static String symmCharSwitching(String aText, boolean doUndo) {
		String returnText = "";
		for (int i = 0; i < aText.length(); i++) {
			idmPrint(".");
			returnText += charSwitching(aText.charAt(i), doUndo);
		}
		idmPrint("[" + returnText + "]");
		return returnText;
	}	
	
	
	
	/* Symmetric foundry-technique without key. */ 
	public static String symmRandomFoundry(String aText, boolean doUndo) {
		String returnText = "";
		for (int i = 0; i < aText.length(); i++) {
			idmPrint(".");
			returnText += 
					(doUndo) ?
					(char) ((int) (aText.charAt(i)) + (aText.length() - i)) :
					(char) ((int) (aText.charAt(i)) - (aText.length() - i)) ;
		}
		idmPrint("[" + returnText + "]");
		return returnText;
	}
	
	
	
	/* Symmetric foundry-technique with key. */ 
	public static String symmKeyFoundry(String aText, String key, boolean doUndo) {
		idmPrint("[" + key + "][" + aText.length() + "]");
		key = keyRemolding(key, aText.length());
		String returnText = "";
		for (int i = 0; i < aText.length(); i++) {
			idmPrint(".");
			returnText += 
					(doUndo) ?
					(char) ((int) (aText.charAt(i)) + (int) (key.charAt(i)) + i) :
					(char) ((int) (aText.charAt(i)) - (int) (key.charAt(i)) - i) ;
		}
		idmPrint("[" + key + "][" + aText.length() + "][" + returnText + "]");
		return returnText;
	}
	
}
