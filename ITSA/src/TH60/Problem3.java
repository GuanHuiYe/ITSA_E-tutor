package TH60;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int send = sc.nextInt();
		for (int s = 0; s < send; s++) {
			String sfad;
			while ((sfad = sc.nextLine()).equals(""))
				;
			String[] nm = sfad.split(" ");
			String[] need = sc.nextLine().split(" ");
			int mend = Integer.parseInt(nm[1], 10);
			for (int m = 0; m < mend; m++) {
				String[] want = sc.nextLine().split(" ");
				int sum = 0;
				for (int sumn = Integer.parseInt(want[0]) - 1; sumn < Integer.parseInt(want[1]); sumn++) {
					sum += Integer.parseInt(need[sumn]);
				}
				System.out.println(sum);

			}

		}

	}

}
