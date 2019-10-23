package TH74;

import java.util.*;
   

public class Problem_1_­pºâ½Æ§Q {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = Double.parseDouble(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());
		int p = Integer.parseInt(sc.nextLine());

		double ans = 0;
		for (; n > 0; n--) {
			ans += p;
			ans +=Double.parseDouble( String.format("%.5f", ans*r));	
			ans =Double.parseDouble(String.format("%.5f", ans));
//			System.out.println(ans);
		}
		System.out.println((int) Math.floor(ans));
	}

}
