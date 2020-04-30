package 陣列II_ArrayII;

import java.util.*;

public class C_AR59_易_好數問題 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			char[] input = sc.nextLine().toCharArray();
			if (input.length != 4) {
				System.out.println("Failure Input");
				continue;
			}
			TreeMap<Character, Integer> TM = new TreeMap<Character, Integer>();
			for (char item : input) {
				if (TM.containsKey(item))
					TM.put(item, TM.get(item) + 1);
				else
					TM.put(item, 1);
			}
			Boolean test = false;
			for (Map.Entry<Character, Integer> item : TM.entrySet()) {
				if (item.getValue() ==2) {
					if (test) {
						test = false;
						break;
					}
					test = true;

				}
			}
			System.out.println(test ? "Yes" : "No");
		}

	}

}
