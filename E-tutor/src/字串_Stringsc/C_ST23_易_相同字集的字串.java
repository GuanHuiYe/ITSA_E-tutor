package 字串_Stringsc;

import java.util.*;

public class C_ST23_易_相同字集的字串 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(",");
		TreeMap<Character, Integer> TM_L = new TreeMap<Character, Integer>();
		input[0] = input[0].toLowerCase();
		for (char item : input[0].toCharArray()) {
			if (item != ' ') {
				if (TM_L.containsKey(item))
					TM_L.put(item, TM_L.get(item) + 1);
				else
					TM_L.put(item, 1);
			}
		}

		TreeMap<Character, Integer> TM_R = new TreeMap<Character, Integer>();
		input[1] = input[1].toLowerCase();
		for (char item : input[1].toCharArray()) {
			if (item != ' ') {
				if (TM_R.containsKey(item))
					TM_R.put(item, TM_R.get(item) + 1);
				else
					TM_R.put(item, 1);
			}
		}

		Boolean test = true;
		for (Map.Entry<Character, Integer> item : TM_L.entrySet()) {
			if (item.getValue() != TM_R.get(item.getKey())) {
				test = false;
				break;
			}
		}
		System.out.println(test ? 1 : 0);

	}

}
