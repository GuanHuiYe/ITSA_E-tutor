package 數學_Mathematics;

import java.util.*;

public class C_MM13_易停車費計算 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] import1 = sc.nextLine().split(" ");
		int starttime = Integer.parseInt(import1[0]) * 60 + Integer.parseInt(import1[1]);

		String[] import2 = sc.nextLine().split(" ");
		int endtime = Integer.parseInt(import2[0]) * 60 + Integer.parseInt(import2[1]);

		int time = endtime - starttime;
		int ans = 0;

		if (time >= 240) {
			ans += ((time - 240) / 30) * 60;
			time = time - (time - 240);
		}
		if (time >= 120) {
			ans += ((time - 120) / 30) * 40;
			time = time - (time - 120);
		}
		if (time >= 30) {
			ans += (int) (time / 30) * 30;
		}

		System.out.println(ans);

	}

}
