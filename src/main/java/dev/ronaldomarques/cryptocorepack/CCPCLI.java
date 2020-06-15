package dev.ronaldomarques.cryptocorepack;



public class CCPCLI {

	public static void main(String[] args) {

		if ((args.length > 0) && (args[0].charAt(0) == '-')) {

			switch (args[0].charAt(1)) {
			case 'v':
				System.out.println("version");
				break;

			case 's':
				System.out.println("syntax");
				break;
				
			case 'h':
				System.out.println("help");
				break;

			case 'e':
				System.out.println("encr");
				break;

			case 'd':
				System.out.println("decr");
				break;

			default:
				System.out.println("default");
				break;
			}
		} else {
			System.out.println(
					"Error in args! The first one must be an option.\n" + "Type 'java CCPCLI -s' to see the syntax.");
		}
		System.out.println("Done.\n");
	}
}
