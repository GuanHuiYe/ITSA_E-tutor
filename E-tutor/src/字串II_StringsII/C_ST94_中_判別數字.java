package �r��II_StringsII;

import java.util.*;

public class C_ST94_��_�P�O�Ʀr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int en = 0, num = 0;
		char[] input = sc.nextLine().toCharArray();
		for (char item : input) {
			if (Character.isDigit(item))
				num++;
			else if (Character.isLetter(item))
				en++;
		}
		System.out.println(en + "," + num);

	}

}
