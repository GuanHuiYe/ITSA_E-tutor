package �}�CII_ArrayII;

import java.util.*;

public class C_AR67_��_�H�N�E�E���k {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");

		for (int y = 0; y < input.length; y++) {
			for (int x = 0; x < input.length; x++) {
				System.out.printf("%03d" + (x == input.length - 1 ? "\n" : " "),
						Integer.parseInt(input[y]) * Integer.parseInt(input[x]));
			}

		}

	}

}
