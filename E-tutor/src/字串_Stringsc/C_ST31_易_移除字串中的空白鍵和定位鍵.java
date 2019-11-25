package 字串_Stringsc;

import java.util.*;

public class C_ST31_易_移除字串中的空白鍵和定位鍵 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		while (sc.hasNext()) {
			input += sc.nextLine();
		}
		System.out.println(input.replace("\t", "").replace(" ", ""));
	}

}
