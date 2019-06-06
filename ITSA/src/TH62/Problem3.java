package TH62;

import java.util.*;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int n = Integer.parseInt(sc.nextLine()); n > 0; n--) {
			int a = 0, b = 0;
			int[] ansa = new int[4];
			int[] finalans = new int[4];
			String fin = sc.nextLine();
			String ans = sc.nextLine();

			for (int n1 = 0; n1 < 4; n1++) {
				finalans[n1] = Integer.parseInt(fin.substring(n1, n1 + 1));
			}
			for (int n1 = 0; n1 < 4; n1++) {
				ansa[n1] = Integer.parseInt(ans.substring(n1, n1 + 1));
			}

			for (int n1 = 0; n1 < 4; n1++) {
				for (int nn = 0; nn < 4; nn++) {
					if (finalans[n1] == ansa[nn]) {
						if (n1 == nn) {
							a++;
						} else {
							b++;
						}
					}
				}
			}
			System.out.println(a+"a"+b+"b");
		}
	}

}
