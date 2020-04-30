package 字串_Stringsc;

import java.util.*;

public class C_ST02_易_迴文字串 {

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
