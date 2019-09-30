package 數學_Mathematics;

import java.util.*;

public class C_MM32_易_Armstrong數 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.nextLine();
			int sum = 0;
			for (char item : input.toCharArray()) {
				sum += Math.pow(Character.getNumericValue(item), input.length());
			}
			System.out.println(sum == Integer.parseInt(input) ? "Yes" : "No");
		}
	}

}
