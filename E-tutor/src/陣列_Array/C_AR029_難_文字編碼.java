package 陣列_Array;

import java.util.Scanner;

public class C_AR029_難_文字編碼 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		Double sq = Math.sqrt(input.length());
		int m = sq.intValue();
		while (true) {

			if (m * m < input.length()) {
				m++;
			} else {
				break;
			}

		}

		String[][] ansarr = new String[m][m];
		int nth = 0;
		for (int n = 0; n < m; n++) {
			for (int nn = 0; nn < m; nn++) {
				if (nth > input.length() - 1)
					break;
				ansarr[nn][n] = input.substring(nth, nth+1);
				nth++;
			}
			if (nth > input.length() - 1)
				break;
		}
		for (int n = 0; n < m; n++) {
			for (int nn = 0; nn < m; nn++) {

				if (ansarr[n][nn] == null) {
					ansarr[n][nn] = " ";
				}

			}
		}

		String ans = "";
		Boolean test = true;
		for (int n = 0; n < m; n++) {
			for (int nn = 0; nn < m; nn++) {

				String str = ansarr[n][nn];
				if (test) {
					if (str.equals(" ")) {
						ans += str;
						test = false;
					} else
						test = true;
				} else {
					if (str.equals(" "))
						continue;
					else
						test = true;
				}

				if (test)
					ans += str;
			}
		}

		System.out.println(ans);

	}

}
