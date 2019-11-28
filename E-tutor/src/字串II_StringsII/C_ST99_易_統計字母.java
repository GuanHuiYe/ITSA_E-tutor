package ¦r¦êII_StringsII;

import java.util.*;

public class C_ST99_©ö_²Î­p¦r¥À {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			int[] en = new int[26];
			for (char item : sc.nextLine().toCharArray())
				en[item - 97]++;

			int MaxIndex = en.length - 1;
			for (int index = MaxIndex; index >= 0; index--)
				if (en[index] >= en[MaxIndex])
					MaxIndex = index;

			System.out.println((char) (MaxIndex + 97) + " " + en[MaxIndex]);
		}

	}

}
