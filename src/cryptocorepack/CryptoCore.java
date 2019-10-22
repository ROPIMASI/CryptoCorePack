/**
 * CONTENT: A PERSONAL UTILITY MINI PPROJECT.
 * THEME: SYMMETRIC AND ASYMMETRIC CRYPTOGRAFY LIBRARY.
 * PROJECT NAME: CryptoCorePack.
 * PPROJECT VERSION: 0.0.1.beta.
 * SOURCE FILE NAME: CryptoCore.java.
 * BIN FILE NAME: CryptoCore.class or its JAR: cryptocorepack.jar.
 * DEPENDENCES: None.
 * BRANCH: MASTER.
 * AUTHOR: RONALDO PI MA SI.
 * DATE: 2019-OCT.
 * LANGUAGE: JAVA 8.
 * PLATAFORM: Microsoft Windows7, Eclipse IDE EE v201903(4.11.0), JDK_SE-JRE-JVM 1.8.0.22.
 * 
 * NOTA IMPORTANTE / ISEN��O DE RESPONSABILIDADE:
 * Este � um projeto pessoal, particular, com finalidade exclusiva de estudos
 * em tecnologia da informa��o, e de uso e fruto �nico e exclusivamente de seu
 * autor. Trata-se de um projeto em fase de desenvovimento e experimenta��es,
 * o qual n�o tem nenhuma responsabilidade pelas informa��es nele contidas,
 * t�o pouco sobre seus resultados e efeitos ao ser utilizado.  
 *   
 * IMPORTANT NOTE / DISCLAIMER:
 * This is a personal, private project, solely for the purpose of my studies_
 * in information technology, and for the sole and exclusive use of its author.
 * It is a project under development and experimentation, which has no respon-
 * sibility for the information contained therein, nor about its results and_
 * effects when used.  
 */

package cryptocorepack;

public final class CryptoCore {

	// Declara��o de constantes e vari�veis globais.
	public static final String PACK_NAME = "CryptoCorePack";
	public static final String PACK_VERSION = "0.0.1.beta";
	public static final String CHAR_SET_ABLE = "ASCII";
	public static final boolean IN_DEBUG_MODE = true;
	// M�todo de impress�o particular para DEBUG_MODE true.
	protected static void idmPrint(String str) {
		if (IN_DEBUG_MODE) System.out.println(str);
	}

	public static String resizeRepeating(String key, int newLength) {
		idmPrint(",");

		if (key.length() == newLength) {
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
			key = key.substring(0, newLength);
			return key;
		}
	}

	public static String encrypt(String decryptedText) {
		/**
		 * Return an encrypted string from a given natural text (input on arg).
		 * 
		 */
		String encryptedText = "";
		idmPrint("e");
		for (int i = 0; i < decryptedText.length(); i++) {
			idmPrint("e");
			encryptedText += (char) ((int) (decryptedText.charAt(i)) + (decryptedText.length() - i));
		}
		idmPrint("[" + encryptedText + "]");
		return encryptedText;
	}

	public static String encrypt(String decryptedText, String password) {
		/**
		 * Return an encrypted string from a given natural text (input on arg).
		 * 
		 */
		idmPrint("[" + password + "][" + decryptedText.length() + "]");
		idmPrint(".");
		password = resizeRepeating(password, decryptedText.length());
		String encryptedText = "";
		for (int i = 0; i < decryptedText.length(); i++) {
			idmPrint(".");
			encryptedText += (char) ((int) (decryptedText.charAt(i)) + (int) (password.charAt(i)) + i);
		}
		idmPrint("[" + password + "][" + decryptedText.length() + "][" + encryptedText + "]");
		return encryptedText;
	}

	public static String decrypt(String encryptedText) {
		/**
		 * Return a decrypted string from a given encrypted text (input on arg).
		 * 
		 */
		String decryptedText = "";
		idmPrint("d");
		for (int i = 0; i < encryptedText.length(); i++) {
			idmPrint("d");
			decryptedText += (char) ((int) (encryptedText.charAt(i)) - (encryptedText.length() - i));
		}
		idmPrint("[" + decryptedText + "]");
		return decryptedText;
	}

	public static String decrypt(String encryptedText, String password) {
		/**
		 * Return a decrypted string from a given encrypted text (input on arg).
		 * 
		 */
		idmPrint("[" + password + "][" + encryptedText.length() + "]");
		idmPrint(":");
		password = resizeRepeating(password, encryptedText.length());
		String decryptedText = "";
		for (int i = 0; i < encryptedText.length(); i++) {
			idmPrint(":");
			decryptedText += (char) ((int) (encryptedText.charAt(i)) - (int) (password.charAt(i)) - i);
		}
		idmPrint("[" + password + "][" + encryptedText.length() + "][" + decryptedText + "]");
		return decryptedText;
	}
}