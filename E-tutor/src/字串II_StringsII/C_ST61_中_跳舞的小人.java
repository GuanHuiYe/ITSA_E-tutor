package 字串II_StringsII;

import java.util.*;

public class C_ST61_中_跳舞的小人 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] input = sc.nextLine().split(" ");
			String str = "";
			int numindex = 0;
			int index = -1;
			for (String item : input) {
				index++;
				if (Character.isDigit(item.charAt(0))) {
					numindex = index;
					int shift = Integer.parseInt(item);
					char[] charArr = str.toCharArray();
					for (char item_char : charArr) {
						if (Character.isUpperCase(item_char)) {
							if (item_char + shift > 'Z') {
								System.out.printf("%c", ('A' - 1) + ((item_char + shift) - 'Z'));
							} else {
								System.out.printf("%c", item_char + shift);
							}
						} else {
							if (item_char + shift > 'z') {
								System.out.printf("%c", ('a' - 1) + ((item_char + shift) - 'z'));
							} else {
								System.out.printf("%c", item_char + shift);
							}
						}
					}

					str = "";
				} else {
					str += item;
				}

			}
			if (numindex != input.length - 1) {
				System.out.print(str);
			}
			System.out.println();
		}
	}

}
