package 資料結構_Datastructurec;

import java.util.*;

public class C_DT22_難_刮號對稱性 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String input_ori = sc.nextLine();
			if (input_ori.equals("end"))
				break;
			char[] input = input_ori.toCharArray();
			Boolean test = input.length%2==0;
			for (int index = 0; index < input.length / 2&&test; index++) {
				if (input[index] == '(') {
					if (input[input.length - 1 - index] != ')') {
						test = false;
						break;
					}
				} else {
					if (input[input.length - 1 - index] != '(') {
						test = false;
						break;
					}
				}
			}
			System.out.println(test ? "1" : "-1");
		}

	}

}
