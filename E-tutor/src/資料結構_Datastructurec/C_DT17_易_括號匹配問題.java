package 資料結構_Datastructurec;

import java.util.*;

public class C_DT17_易_括號匹配問題 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] input = sc.nextLine().toCharArray();
		int count = 0;
		for (char item : input) {
			if (item == '(')
				count++;
			if (item == ')')
				count--;
			if (count < 0)
				break;
		}
System.out.println(count==0?"Yes":"No");
	}

}
