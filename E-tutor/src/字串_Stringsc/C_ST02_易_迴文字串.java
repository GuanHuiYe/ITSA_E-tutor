package ¦r¦ê_Stringsc;

import java.util.*;

public class C_ST02_©ö_°j¤å¦r¦ê {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			char[] input = sc.nextLine().toCharArray();
			for (int index = input.length - 1; index >= 0; index--) {
				System.out.print(input[index] + (index == 0 ? "\n" : ""));
			}
		}

	}

}
