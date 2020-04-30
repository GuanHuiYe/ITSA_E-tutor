package 字串II_StringsII;

import java.util.*;

public class C_ST79_中_文字接龍 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			String input = sc.nextLine();
			int index = 0;
			while (true) {
				if (index >= input.length() - 1)
					break;
				String item = input.substring(index, index + 1);
				String doStr = input.substring(index + 1);
				String result = input.substring(0, index + 1);

				switch (item.toCharArray()[0]) {
				case 'a':
					for (int i = doStr.length() - 1; i >= 0; i--)
						result += doStr.substring(i, i + 1);
					break;
				case 'b':
					result += doStr + doStr;
					break;
				case 'c':
					if (doStr.length() > 2)
						result += doStr.substring(2);
					break;
				default:
					result = input;
					break;
				}
				input = result;

				index++;
			}
			System.out.println(input);
		}

	}

}
