package 綜合_Comprehensive;

import java.util.Scanner;

public class C_CH44_易_檢驗學號 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int n = Integer.parseInt(sc.nextLine()); n > 0; n--) {
			char[] input = sc.nextLine().toCharArray();
			int[] c = new int[13];
			for (int nn = 0; nn < 12; nn++) {
				c[nn] = Character.getNumericValue(input[nn]);
			}
			int v = 26 - (((c[0] + c[2] + c[4] + c[6] + c[8] + c[10]) + 3 * (c[1] + c[3] + c[5] + c[7] + c[9] + c[11]))
					% 26);
			if ((char) (v + 64) == input[input.length - 1]) {
				System.out.println("valid");
			} else {
				System.out.println("invalid");

			}
		}

	}

}
