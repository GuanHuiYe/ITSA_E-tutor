package 字串II_StringsII;

import java.util.*;

public class C_ST56_易_字串轉換 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			char[] input = sc.nextLine().toCharArray();
			int sum = 0;
			for (char item : input) {
				int nth = 0;
				char convertC;
				if (Character.isUpperCase(item))
					nth = item - 65;
				else
					nth = item - 97;

				if (nth < 26 / 2)
					convertC = (char) (item + (26 - nth - 1) - (nth));
				else
					convertC = (char) (item - (26 - (26 - nth)) + (26 - nth - 1));

				sum += nth + 1;
				System.out.print(convertC);
			}
			System.out.println(" " + sum);
		}

	}

}
