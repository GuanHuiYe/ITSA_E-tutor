package �r��_Stringsc;

import java.util.*;

public class C_ST22_��_�j��r��II {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] input = sc.nextLine().toCharArray();
		for (int index = input.length - 1; index >= 0; index--) {
			if (Character.isLowerCase(input[index]))
				System.out.print((char)(input[index] - 32));
			else if(Character.isUpperCase(input[index]))
				System.out.print((char)(input[index] + 32));
			else System.out.print(input[index]);
		}
		System.out.println();

	}

}
