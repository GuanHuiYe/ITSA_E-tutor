package ��Ƶ��c_Datastructurec;

import java.util.*;

public class C_DT17_��_�A���ǰt���D {

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
