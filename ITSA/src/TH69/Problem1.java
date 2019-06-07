package TH69;

import java.util.*;

public class Problem1 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String input = sc.nextLine();
			String[] Stringserch = { "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S",
					"T", "U", "V",  "X", "Y","W", "Z", "I", "O" };
			int[] intserch = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32,
					33, 34, 35 };
			int[] inputarray = new int[11];
			String in = input.substring(0, 1);
			for (int n1 = 0; n1 < Stringserch.length; n1++) {

				if (Stringserch[n1].equals(in)) {
					String serch = Integer.toString(intserch[n1]);
					inputarray[0] = Integer.parseInt(serch.substring(0, 1));
					inputarray[1] = Integer.parseInt(serch.substring(1, 2));

					break;
				}
			}
			for (int n = 1; n < input.length(); n++) {

				inputarray[n+1] = Integer.parseInt(input.substring(n, n + 1));

			}
			int p = inputarray[0] + 9 * inputarray[1] + 8 * inputarray[2] + 7 * inputarray[3] + 6 * inputarray[4]
					+ 5 * inputarray[5] + 4 * inputarray[6] + 3 * inputarray[7] + 2 * inputarray[8] + inputarray[9]
					+ inputarray[10];
			if (p % 10 == 0) {
				System.out.println("CORRECT!!!");

			} else {
				System.out.println("WRONG!!!");
			}
		}
		

	}

}
