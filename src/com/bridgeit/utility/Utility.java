package com.bridgeit.utility;

import java.util.Scanner;

public class Utility {
	
		static Scanner scanner;

		public Utility() {
			scanner = new Scanner(System.in);
		}

		// INPUT STRING
		public static String inputString() {
			try {
				return scanner.next();
			} catch (Exception e) {
				System.out.println(e);
			}
			return "";
		}

		// INPUT Integer
		public static int inputInteger() {
			try {
				return scanner.nextInt();
			} catch (Exception e) {
				System.out.println(e);
			}
			return 0;
		}
}
