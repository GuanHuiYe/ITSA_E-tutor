package 陣列_Array;

import java.util.*;

public class C_AR022_易_字母出現的頻率 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<Character, Integer> dictionary = new TreeMap<Character, Integer>();
		for (char n = 65, N = 97; n <= 90; n++, N++) {
			dictionary.put(n, 0);
			dictionary.put(N, 0);
		}
		char[] input = sc.nextLine().toCharArray();
		for (char item : input) {
			if (dictionary.containsKey(item))
				dictionary.put(item, dictionary.get(item) + 1);
		}
		for (char n = 65, N = 97; n <= 90; n++, N++) {
			System.out.print(dictionary.get(n) + dictionary.get(N));
			if (n < 90)
				System.out.print(" ");
		}
		System.out.println();
	}

}
