package °}¦C_Array;

import java.util.*;

public class C_AR48_©ö_¼Æ¦r¥[±K {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(getans(Integer.parseInt(input.substring(2, 3)))
				+ getans(Integer.parseInt(input.substring(3, 4))) + getans(Integer.parseInt(input.substring(0, 1)))
				+ getans(Integer.parseInt(input.substring(1, 2))));
	}

	public static String getans(int num) {
		return String.valueOf((num + 7) % 10);
	}

}
