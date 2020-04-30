package _2019_12;

import java.util.*;

public class Problem1_電話費計算 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int nth = Integer.parseInt(sc.nextLine()); nth > 0; nth--) {
			String[] input = sc.nextLine().split(" ");
			int i = Integer.parseInt(input[0]);
			int o = Integer.parseInt(input[1]);
			double ans = 0;
			if (i >= 1001) {
				ans = (i * 3) * 0.5 ;
				
			} else if (i >= 501) {
				ans = (i * 3) * 0.75 ;
				
			} else if (i >= 301) {
				ans = (i * 3) * 0.9 ;
				
			} else {
				ans = i * 3;
			}
			
			if (o >= 1001) {
				ans += (o * 6) * 0.75 ;
				
			} else if (o >= 501) {
				ans += (o * 6) * 0.9 ;
				
			}  else {
				ans += o * 6;
			}
			System.out.println((int)Math.floor(ans));
		}
	}

}
