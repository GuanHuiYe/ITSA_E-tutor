package TH70;

import java.util.*;

public class Problem_1_矩陣反轉 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] input = sc.nextLine().split(" ");
			int row = Integer.parseInt(input[0]);
			int col = Integer.parseInt(input[1]);
			String[][] ori = new String[row][col];
			String[][] ans = new String[col][row];
			for (int n = 0; n < row; n++) {
				String[] put = sc.nextLine().split(" ");
				for (int n1 = 0; n1 < col; n1++) {
					ori[n][n1] = put[n1];
				}
			}
			for (int n = 0; n < row; n++) {

				for (int n1 = 0; n1 < col; n1++) {

					ans[n1][n] = ori[n][n1];
				}
			}
			for (int n = 0; n < col; n++) {

				for (int n1 = 0; n1 < row; n1++) {
					if (n1 == row - 1) 
						System.out.print(ans[n][n1] );
					else
						System.out.print(ans[n][n1] + " ");
					
				}

				System.out.println();
			}

		}

	}

}
