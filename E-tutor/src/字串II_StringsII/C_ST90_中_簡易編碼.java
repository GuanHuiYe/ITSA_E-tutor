package ¦r¦êII_StringsII;

import java.util.*;

public class C_ST90_¤¤_Â²©ö½s½X {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String input = sc.nextLine();
			String str = "";
			Boolean isDigit = Character.isDigit(input.substring(0, 1).toCharArray()[0]);
			while (input.length() > 0) {
				char item = input.substring(0, 1).toCharArray()[0];
				input = input.substring(1);

				if (isDigit) {
					if (Character.isDigit(item)) {
						str += String.valueOf(item);
					} else {
						System.out.printf("0N%04X", Integer.parseInt(str));
						str = String.valueOf(item);
						isDigit = false;
					}
				} else {
					if (!Character.isDigit(item)) {
						System.out.printf("0C%02X", (int) item);
					} else {
						str = String.valueOf(item);
						isDigit = true;
					}
				}
			}
			if (str.length() > 0) {
				if (isDigit) {
					System.out.printf("0N%04X", Integer.parseInt(str));
				} else {
					System.out.printf("0C%02X", (int)str.substring(0,1).toCharArray()[0]);
				}
			}
		}
		

	}

}
