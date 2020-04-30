package 綜合_Comprehensive;

import java.util.*;

public class C_CH27_易_回文結構數字 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] input = sc.nextLine().split(" ");
			String ans = "";
			for (int num = Integer.parseInt(input[0]); num <= Integer.parseInt(input[1]); num++) {
				char[] num_char = String.valueOf(num).toCharArray();
				Boolean test = true;
				for (int index = 0; index < num_char.length / 2; index++) {
					if (num_char[index] != num_char[num_char.length - 1 - index]) {
						test = false;
						break;
					}
				}
				if (test)
					ans += num + " ";
			}
			System.out.println(ans.equals("")?"0":ans.substring(0,ans.length()-1));
		}

	}

}
