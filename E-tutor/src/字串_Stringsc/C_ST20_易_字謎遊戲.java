package 字串_Stringsc;

import java.util.*;

public class C_ST20_易_字謎遊戲 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			char[] ori = sc.nextLine().toCharArray();
			char[] new_str = sc.nextLine().toCharArray();
			TreeMap<Character, Integer> ori_TM = new TreeMap<Character, Integer>();
			for (char item : ori) {
				if (ori_TM.containsKey(item))
					ori_TM.put(item, ori_TM.get(item) + 1);
				else
					ori_TM.put(item, 0);
			}

			TreeMap<Character, Integer> new_TM = new TreeMap<Character, Integer>();
			for (char item : new_str) {
				if (new_TM.containsKey(item))
					new_TM.put(item, new_TM.get(item) + 1);
				else
					new_TM.put(item, 0);
			}
			Boolean test = true;
			for (Map.Entry<Character, Integer> item : ori_TM.entrySet()) {
				if (item.getValue() != new_TM.get(item.getKey())) {
					test = false;
					break;
				}
			}
			System.out.println(test ? 1 : 0);
		}

	}

}
