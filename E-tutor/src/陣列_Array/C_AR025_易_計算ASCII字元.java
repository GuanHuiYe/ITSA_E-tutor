package 陣列_Array;

import java.util.*;

public class C_AR025_易_計算ASCII字元 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			TreeMap<Character, Integer> dictionary = new TreeMap<Character, Integer>();

			char[] input = sc.nextLine().toCharArray();
			for (char item : input) {
				if (dictionary.containsKey(item)) {
					dictionary.put(item, dictionary.get(item) + 1);
				} else {
					dictionary.put(item, 1);
				}
			}

			while (dictionary.size() > 0) {
				char lastKey = dictionary.lastKey();
				System.out.println((int) lastKey + " " + dictionary.get(lastKey));
				dictionary.remove(lastKey);				
			}
		}

	}

}
