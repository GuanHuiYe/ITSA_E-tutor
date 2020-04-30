package 陣列_Array;

import java.util.*;

public class C_AR49_易_字母往前移 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] input = sc.nextLine().toCharArray();
		int shift = Integer.parseInt(sc.nextLine());
		for (char item : input) {
			if (item >= 'A' && item <= 'Z') {
				if (item + shift < 'A') {
					item += shift + 26;
				} else if (item + shift > 'Z') {
					item += shift - 26;
				} else
					item += shift;
			} else if (item >= 'a' && item <= 'z') {
				if (item + shift < 'a') {
					item += shift + 26;
				} else if (item + shift > 'z') {
					item += shift - 26;
				} else
					item += shift;
			}
			System.out.print(item);
		}
		System.out.println();

	}

}
